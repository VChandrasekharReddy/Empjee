package dao;

import model.Emp;

public interface EmployeeServiceInfDaoinf {
	public Emp findById(int id);
	public boolean save(Emp emp); 
}
