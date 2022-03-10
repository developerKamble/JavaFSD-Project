package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/details")
public class ShowDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session= factory.openSession();
	
	List<EProduct> list = session.createQuery("from EProduct").list();
	PrintWriter out=response.getWriter();
	
	out.print("<table 'style=border:solid;'><th><tr><td>ID</td>");
	out.print("<td>Name </td>");
	out.print("<td>Price</td>");
	out.print("<td>Available From</td>");
	out.print("</tr></th>");
	
	out.print("<tb>");
	for(EProduct product:list) {
		out.print("<tr>");


		out.print("<td>"+product.getID()+"</td>");
		out.print("<td>"+product.getName()+"</td>");
		out.print("<td>"+product.getPrice().toString()+"</td>");
		out.print("<td>"+product.getDateAdded()+"</td>");
		out.print("</tr>");


	}		out.print("</tb></table>");

	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
