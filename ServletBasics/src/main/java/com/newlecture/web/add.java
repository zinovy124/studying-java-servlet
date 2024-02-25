package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class add extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String temp = req.getParameter("x");
		int x = 0, y = 0;
		if (temp != null && !temp.equals("")) {
			x = Integer.parseInt(req.getParameter("x"));
		}
		temp = req.getParameter("y");
		if (temp != null && !temp.equals("")) {
			y = Integer.parseInt(req.getParameter("y"));
		}
		PrintWriter out = resp.getWriter();
		out.println(x + y);
	}
}
