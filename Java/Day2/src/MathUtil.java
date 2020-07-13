
public class MathUtil {
	
	double res;
	public void add(int no1,int no2) {
		res = no1 + no2;
		System.out.println("Res is: "+res);
	}
	public void add(int no1,int no2,int no3) {
		res = no1 + no2 + no3;
		System.out.println("Res is: "+res);
	}
	public void add(int no1,int no2,float no3) {
		res = no1 + no2 + no3;
		System.out.println("Res is: "+res);
	}
	public double add(float no1,int no2,int no3) {
		res = no1 + no2 + no3;
		//System.out.println("Res is: "+res);
		return res;
	}

}
