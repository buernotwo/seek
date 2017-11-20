package seeyou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectToIndexServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	/** 
	 * @throws ServletException 
     */  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    	request.getRequestDispatcher("/index.jsp").forward(request, response);
    }  
    /**
     * @throws ServletException 
     */  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{  
        doGet(request, response);
    }
}
