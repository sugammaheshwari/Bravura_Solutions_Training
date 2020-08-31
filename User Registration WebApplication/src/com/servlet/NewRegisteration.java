package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.dao;

/**
 * Servlet implementation class NewRegisteration
 */
public class NewRegisteration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		dao conn;
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		
		if(pass.equals(cpass)==false)
		{
			PrintWriter out=response.getWriter();
			out.print("Passwords dont match , EXITING !!!!");
		}
		
		try {
			conn=new dao();
			if(conn.check_new_user(uname)==true) {
				conn.add_user(uname,pass);
				response.sendRedirect("welcome.jsp");
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.print("User Already exists , you have exceeded the no of tries !");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
