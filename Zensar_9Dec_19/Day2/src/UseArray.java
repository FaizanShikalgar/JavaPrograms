
public class UseArray {

	public static void main(String[] args) {
		int ivals[] = {1,3,4,5,78,100};
		
		for(int i=0;i<ivals.length;i++) {
			System.out.println(ivals[i]);
		}
		
		
		int []i  = new int[3];
		i[0] = 10;
		i[1] = 100;
		i[2] = 7;
		
		for(int val:i) {
			System.out.println(val);
		}
		
		int matrix[][] = {
				{1,3,4},
				{2,4,6}
		          };
		int [][]imax = new int[2][4];
		imax[0][0] = 1;
		
		Person p[] = new Person[2];
		p[0] = new Person();
		p[1] = new Person("Sam","De");
		
		for(Person person:p) {
			person.displayPersonName();
		}

	}

}
