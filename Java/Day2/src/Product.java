
public class Product {
	
	private int productId;
	private String productName;
	private String productType;
	private int qty;
	private double price;
	private static int stock_in_hand;
	
	public Product() {
		productId =1;
		productName="mobile";
		productType="eletronic";
		qty = 1;
		price = 10000;
		stock_in_hand = qty;
	}

	public Product(int pId, String pName, String pType, int qt, double p) {
		
		productId = pId;
		productName = pName;
		productType = pType;
		qty = qt;
		price = p;
		stock_in_hand = qty;
	}
	static {
		stock_in_hand = 0;
	}
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int pId) {
		productId = pId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String pName) {
		this.productName = pName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String pType) {
		this.productType = pType;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qt) {
		this.qty = qt;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		this.price = p;
	}
	
	public void displayProcuctDetils() {
		System.out.println("Product Id:"+productId+"\nProduct Name:"+productName+"\nProduct Type:"+productType+"\nQty:"+qty+"\nprice"+price);
		
	}
	public void placeOrder(int q,String pname)
	{
		if(stock_in_hand < q) {
			System.out.println("Out Of Stock!!!");
		}
		else {
		stock_in_hand = stock_in_hand - q;
		double total_bill = price * q;
		System.out.println("Bill:"+total_bill);
		}
	}
	public static int getStock() {
		
		return stock_in_hand;
	}
	
	
	
	

}
