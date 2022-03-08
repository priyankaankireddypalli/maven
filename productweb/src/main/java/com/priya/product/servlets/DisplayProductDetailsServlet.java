package com.priya.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.priya.product.bo.ProductBOImpl;
import com.priya.product.dto.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	       
 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ProductBOImpl bo = new ProductBOImpl();
			Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
			
			
			PrintWriter out = response.getWriter();
			out.print("Product Details");
			out.print("Product ID: "+product.getId());
			out.print("Product ID: "+product.getName());
			out.print("Product ID: "+product.getDescription());
			out.print("Product ID: "+product.getPrice());
			
			
		}
}
