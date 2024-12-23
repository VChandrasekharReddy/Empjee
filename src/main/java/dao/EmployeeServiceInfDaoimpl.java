package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Emp;

public class EmployeeServiceInfDaoimpl implements EmployeeServiceInfDaoinf {
    private static final String URL = "jdbc:mysql://localhost:3306/emp";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String search = "SELECT * FROM employees WHERE id= ?;";
    private static final String add = "INSERT INTO employees values(?,?,?,?);";


	
    @Override
    public Emp findById(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(search)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Correctly fetch columns by name or by position (1-based index)
                    Emp emp = new Emp(
                        rs.getInt("id"),         // Access column by name
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                    );
                    return emp;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


	@Override
	public boolean save(Emp emp) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);
	             PreparedStatement ps = con.prepareStatement(add)) {
	            ps.setInt(1, emp.getId());
	            ps.setString(2, emp.getName());
	            ps.setString(3, emp.getDepartment());
	            ps.setDouble(4, emp.getSalary());
	           
	            b = ps.executeUpdate()>0;
	            if(con!= null) con.close();
	            if(ps!=null) ps.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        
		return b;
	}

}
