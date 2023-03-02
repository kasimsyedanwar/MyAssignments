package week2.day4;

public class EmployeeDetails{
	
		public void printEmployeeName(String empName, int empId) {
			System.out.println("EmplyeeName ="+empName);
			System.out.println("Employee ID = "+empId);
		}
		public void getEmployeeAddress(String empAddress) {	
		    System.out.println("Employee Address ="+empAddress);
		}
		public void printEmpSalary(double empSalary) {
		    System.out.println("Employee Salary ="+empSalary);
		}
		public void empMobileNumber(long mobileNum) {
		    System.out.println("Employee Mobile Number ="+mobileNum);
		}
	public static void main(String[] args) {
	   EmployeeDetails empDetail = new EmployeeDetails();
	    empDetail.printEmployeeName("Kasim Syed Anwar", 2023);
	    empDetail.getEmployeeAddress("123, tambaram, chennai");
	    empDetail.printEmpSalary(5500.45);
	    empDetail.empMobileNumber(7358085227l);
	}
	}


