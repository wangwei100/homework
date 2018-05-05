package com.demohot.homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcHandler extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		System.out.println(x);
		System.out.println(y);

		if (null != x && null != y) {
				int a = Integer.valueOf(x);
				int b = Integer.valueOf(y);
				String c = String.valueOf(a + b);
				resp.getOutputStream().write(c.getBytes());
//			try {
//			} catch (Exception e) {
//				e.printStackTrace();
//				resp.getOutputStream().write("error".getBytes());
//			}
		} else {
			String result = "3";
			resp.getOutputStream().write(result.getBytes());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		System.out.println(x);
		System.out.println(y);
	}

}
