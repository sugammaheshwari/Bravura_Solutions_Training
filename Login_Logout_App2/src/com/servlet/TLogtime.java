package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TLogtime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		LocalDateTime now=(LocalDateTime) session.getAttribute("Logtime");
		LocalDateTime now2 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		PrintWriter out=resp.getWriter();
		out.println("Session Started :" + dtf.format(now) +" and ended at :" + dtf.format(now2)); 
	}
}
