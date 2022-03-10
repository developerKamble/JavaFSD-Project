package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

@WebServlet("/save")

public class StoreData extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		PrintWriter out=response.getWriter();
		
		String name= req.getParameter("pname");
		String price= req.getParameter("price");

		EProduct product=new EProduct();

		product.setName(name);
		product.setPrice(new BigDecimal(price));
		product.setDateAdded(Calendar.getInstance().getTime());
		
		session.save(product);
		
		session.getTransaction().commit();
		response.sendRedirect("success.jsp");
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
