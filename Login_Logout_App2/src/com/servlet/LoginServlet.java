package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;    

import com.dao.*;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		dao conn;
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		LocalDateTime now = LocalDateTime.now();
		
		try {
			conn=new dao();
			if(conn.validate_user(uname,pass)==true)
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname",uname);
				session.setAttribute("Logtime",now);
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("Register.jsp");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
