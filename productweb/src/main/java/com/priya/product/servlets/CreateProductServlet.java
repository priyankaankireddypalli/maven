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
 * Servlet implementation class CreateProductServlet
 */
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt( request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		int price =Integer.parseInt( request.getParameter("price"));
		
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		
		ProductBOImpl bo = new ProductBOImpl();
		bo.create(product);
		
		PrintWriter out = response.getWriter();
		out.print("Product created");
	}

}

