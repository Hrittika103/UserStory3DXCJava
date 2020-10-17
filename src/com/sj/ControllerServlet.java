package com.sj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sj.ProjectDAO;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/welcome")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		String title=request.getParameter("title");
		String desc=request.getParameter("desc");
		String domain=request.getParameter("domain");
		Project p = new Project(pid,title,desc,domain);
		PrintWriter out=response.getWriter();
		try {
			ProjectDAO db = new ProjectDAO();
			boolean b = db.InsertData(p);
			if(b==true)
				out.println("Successful insertion");
				//request.getRequestDispatcher("index.html").include(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
