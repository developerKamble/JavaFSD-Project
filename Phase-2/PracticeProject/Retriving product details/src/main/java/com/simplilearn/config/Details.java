package com.simplilearn.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detailsofeach")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties props=new Properties();
		
		String id=request.getParameter("id");

		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DBConfig config=new DBConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
			Connection conn= config.getConnection();
			
			PreparedStatement stmt= conn.prepareStatement("select * from eproduct where id=?");
			stmt.setInt(1, Integer.parseInt(id));
			ResultSet result=stmt.executeQuery();
	
			out.print("<h1>Details</h1><hr>");
			while(result.next())
			{
				out.print("Id : "+id+"<br>Name : "+result.getString(2)+"<br>Price : " + result.getBigDecimal(3).toString()+
						"<br>Date Added : "+result.getTimestamp(4).toString()+"<hr>");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}