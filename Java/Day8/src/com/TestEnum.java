package com;
public class TestEnum {

	CoffeeSize size;
	public static void main(String[] args) 
	{
        TestEnum drink1 = new TestEnum();
        drink1.size = CoffeeSize.BIG;
        
        TestEnum drink2 = new TestEnum();
        drink2.size = CoffeeSize.OVERWHELMING;
        
        System.out.println(drink1.size.getOunces());
        System.out.println(drink2.size.getOunces());
        
        String LidCode = drink1.size.getLidCode();
        System.out.println(LidCode);
        System.out.println(drink2.size.getLidCode());

	}

}
