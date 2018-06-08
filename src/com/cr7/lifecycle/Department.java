package com.cr7.lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr7.Database.DepartmentDAO;
import com.cr7.Database.Dept;

/**
 * Servlet implementation class Department
 */
public class Department extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DepartmentDAO deptDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Department() {
		super();
		deptDao = new DepartmentDAO();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dept dept = new Dept();
		int deptNumber = Integer.parseInt(request.getParameter("deptNumber"));
		String deptName = request.getParameter("deptName");
		String deptLocation = request.getParameter("deptLocation");
		dept.setDeptNo(deptNumber);
		dept.setdName(deptName);
		dept.setLoc(deptLocation);
		deptDao.registerEmplyoee(dept);
		System.out.println("Got it");

	}

}
