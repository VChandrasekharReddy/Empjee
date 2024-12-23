package service;

import dao.EmployeeServiceInfDaoimpl;
import model.Emp;

public class EmployeeServiceImpl implements EmployeeServiceInf {
	EmployeeServiceInfDaoimpl empdao = new EmployeeServiceInfDaoimpl();
	@Override
	public Emp findById(int id) {
		// TODO Auto-generated method stub
		return empdao.findById(id);
	}

	@Override
	public boolean save(Emp emp) {
		// TODO Auto-generated method stub
		return empdao.save(emp);
	}

}
