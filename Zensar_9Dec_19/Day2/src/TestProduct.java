
public class TestProduct {

	public static void main(String[] args) {
		
		Product p =  new Product(101,"Laptop","Ele",20,45000);
		System.out.println("Stock_in _Hand:"+p.getStock());
		p.displayProcuctDetils();
		p.placeOrder(21, "Laptop");
		p.setProductName("NoteBook");
		System.out.println("Price of NoteBook:"+p.getPrice());
		
       Product p1 = new Product();
       p1.displayProcuctDetils();
	}

}
