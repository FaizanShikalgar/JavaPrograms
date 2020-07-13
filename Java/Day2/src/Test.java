
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee e = new Employee();
       //System.out.println("Employee Id"+e.empId);
		 e.display();
		 e.setEmployee(12, "Sam", 50000);
		 e.display();
		
       
       Employee  emp = new Employee(1,"Manasi", 12000);
       emp.display();
       
       emp = new Employee(102, "jon");
       emp.display();*/
		
		
		System.out.println("Count of Person:"+Person.getCount());
		Person p = new Person();
		/*p.displayPersonName();
		p.setPersonName("Shobha", "De");
		p.setFirstName("Sona");
		System.out.println("Last Name of Sona:"+p.getLastName());*/
		
		Person p1 = new Person("Manasi","Patake");
		Person p2 = new Person("Manasi","Joshi");
		System.out.println("Count of Person:"+Person.getCount());
		
		
		
		
		
		
		
		
		
		
	}

}
