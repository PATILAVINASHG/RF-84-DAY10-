package com.employee;


public class EmployeeWageCalculation {

	public static void main(String[] args) {
		/*
		 * EmployeeWageBuilder dmartEmp = new EmployeeWageBuilder("DMart", "John", 8,
		 * 20, 20, 60); System.out.println(dmartEmp);
		 * 
		 * System.out.println("--------------------------------------");
		 * 
		 * EmployeeWageBuilder rilEmp = new EmployeeWageBuilder("RIL", "Tony", 9, 25,
		 * 25, 80); System.out.println(rilEmp);
		 */
		
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder("john");
	//	Company ob = new Company("dmart", 8 ,20, 20,60);
		empWageBuilder.addCompany(new Company("Dmart", 8, 20, 20, 60));
//		System.out.println(ob);
		empWageBuilder.addCompany(new Company("RIL", 8, 20, 20, 60));
		empWageBuilder.addCompany(new Company("INFOSYS", 6, 40, 25, 100));
		empWageBuilder.addCompany(new Company("INFOSYS", 6, 40, 25, 100));
		empWageBuilder.addCompany(new Company("INFOSYS", 6, 40, 25, 100));
		empWageBuilder.addCompany(new Company("INFOSYS", 6, 40, 25, 100));
		
		empWageBuilder.calculateAllCompaniesEmpWage();
	}

}

