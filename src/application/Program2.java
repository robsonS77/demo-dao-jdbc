package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		//System.out.println("=== TEST 1: department insert =====");
		Department dep = new Department(null, "DepTest1");
		//depDao.insert(dep);
		//System.out.println("Inserted! New id: " + dep.getId());
		
		System.out.println("\n=== TEST 2: department update =====");
		dep.setId(7);
		dep.setName("newDepTest2");
		depDao.update(dep);
		System.out.println("Update! Id affected: " + dep);
	}
}
