package com;
class EnumDemo1 
{
	public static void main(String[] args) 
	{
		Fruit f;
		System.out.println("Here is all Fruits : ");

		System.out.println();

		Fruit allfruits[] = Fruit.values();
		//  using values() all enum consts. are obtained
		
		for(Fruit ft : allfruits)
			// one by one each enum member is accessed
			System.out.println(ft);

		f = Fruit.valueOf("Mango"); 
		// valueOf() returns enum value associated 
		//with name mentioned
			System.out.println("Fruit is "+f);

			System.out.println("Value is "+f.ordinal());
		
	}
}
