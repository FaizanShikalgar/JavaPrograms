
public class TestOverload {

	public static void main(String[] args) {
    
		MathUtil util = new MathUtil();
		util.add(12, 23);
		System.out.println(util.add(12.3f, 12,34));
		util.add(1, 6,23.3f);


	}

}
