package service;

import model.Emp;

public interface EmployeeServiceInf {
	public Emp findById(int id);
	public boolean save(Emp emp); 

}
