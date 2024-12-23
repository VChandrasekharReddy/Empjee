package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Emp;
import service.EmployeeServiceImpl;

/**
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeServiceImpl empservice = new EmployeeServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String department  = request.getParameter("dipartment");
		String salaryParam = request.getParameter("salary");
		if (salaryParam == null || salaryParam.trim().isEmpty()) {
		    throw new IllegalArgumentException("Salary parameter is missing or empty.");
		}
		double salary = Double.parseDouble(salaryParam);

		Emp emp = new Emp(id,name,department,salary);
		if(empservice.save(emp)) {
			response.sendRedirect(request.getContextPath() + "/public/jspfiles/result.jsp?error=userdatasaved");

		}else {
			response.sendRedirect(request.getContextPath() + "/public/jspfiles/result.jsp?error=not not stored the data");		}
	}


}
