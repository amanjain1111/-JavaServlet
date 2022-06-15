package com.atcs.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atcs.demo.model.Employee;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Fetching Data From Get Method:");
		String name=request.getParameter("name");
		String Salary=request.getParameter("Salary");
		String age=request.getParameter("Age");
		System.out.println("Your name is:"+name);
		System.out.println("Your Salary is:"+Salary);
		System.out.println("Your age is:"+age);
		
		Employee e=new Employee();
		e.setId(1);
		e.setName(name);
		e.setSalary(Integer.parseInt(Salary));
		e.setAge(Integer.parseInt(age));
		
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("view/Home.jsp");
		request.setAttribute("employee", e);
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello I am in Post Method");
		doGet(request, response);
	}

}
