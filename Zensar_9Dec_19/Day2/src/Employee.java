
public class Employee {
	
	private int empId;
	private String empName;
	private double sal;
	
	public Employee() {
		empId = 101;
	    empName = "Sam";
	    sal = 1000;
	    System.out.println("non para constructor");
	}
	public Employee(int eid,String eName,double s) {
		empId = eid;
		empName = eName;
		sal = s;
	}
	public Employee(int eid,String ename) {
		empId = eid;
		empName = ename;
	}
	public void setEmployee(int eid,String ename,double s) {
		empId = eid;
		empName = ename;
		sal = s;
	}
	 void display() {
		System.out.println("Employee Id:"+empId+"\nEmployee Name:"+empName+"\n salary:"+sal);
	}

}
