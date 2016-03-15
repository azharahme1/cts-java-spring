package com.mts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mts.service.TxrService;

/**
 * Servlet implementation class TxrServlet
 */

public class TxrServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	WebApplicationContext applicationContext = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("txr-form.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fromAccNum = request.getParameter("fromAccNum");
		String toAccNum = request.getParameter("toAccNum");
		String amount = request.getParameter("amount");

		// Need txrService comp

		TxrService txrService = applicationContext.getBean("txrService", TxrService.class);
		txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);

		// response...
		request.setAttribute("status", "Txr success");
		request.getRequestDispatcher("txr-status.jsp").forward(request, response);

	}

}
