package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department insert =====");
		Department dep = new Department(null, "DepTest2");
		depDao.insert(dep);
		System.out.println("Inserted! New id: " + dep.getId());
		
		System.out.println("\n=== TEST 2: department update =====");
		dep.setId(8);
		dep.setName("newDepTest2");
		depDao.update(dep);
		System.out.println("Update! Id affected: " + dep);
		
		//System.out.println("\n=== TEST 3: department delete =====");
		//depDao.deleteById(7);
		//System.out.println("Delete done!");
		
		System.out.println("\n=== TEST 4: department findById  =====");
		Department dp = depDao.findById(1);
		System.out.println(dp);
	}
}
