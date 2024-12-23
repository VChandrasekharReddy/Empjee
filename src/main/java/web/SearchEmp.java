package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Emp;
import service.EmployeeServiceImpl;

/**
 * Servlet implementation class SearchEmp
 */
@WebServlet("/SearchEmp")
public class SearchEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Interger = null;
	EmployeeServiceImpl empservice = new EmployeeServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		 Emp emp = empservice.findById(id);
		 if(emp == null) {
				response.sendRedirect(request.getContextPath() + "/public/jspfiles/result.jsp?error=data not  there");
		 }
		 else {
			 HttpSession session = request.getSession();
			 if(session.getAttribute("emp")!=null) {
				 session.invalidate();
			 }
			 session.setAttribute("emp", emp);
				response.sendRedirect(request.getContextPath() + "/public/jspfiles/result1.jsp?error=data not  there");
		 }
		 
		 
		
		
	}


}
