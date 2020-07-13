package com.collection;
import java.util.*;
class Dog1
{
	String name;
	public Dog1(String n)
	{
		name = n;
	}
	public boolean equals(Object o)
	{
		if((o instanceof Dog1)&&(((Dog1)o).name==name))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int hashCode()
	{
		return name.length();
	}
	
}

class cat {}

enum Pets{ DOG, CAT, Hourse } 

public class MapTest 
{
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Map m = new HashMap();
         m.put("k1",new Dog1("aiko"));
         m.put("k2",Pets.DOG);
         m.put(Pets.CAT, "Cat key");
         Dog1 d1 = new Dog1("clover");
         m.put(d1, "Dog Key");
         m.put(new cat(), "Cat Key");
         
         System.out.println(m.get("k1"));
         String k2 = "k2";
         System.out.println(m.get(k2));
         Pets p = Pets.CAT;
         System.out.println(m.get(p));
         System.out.println(m.get(new Dog1("clover")));
         System.out.println(m.get(new cat()));
         System.out.println(m.size());
         
         

	}

}

/* public int hashCode()
 * {
 *    return name.length();
 *  }  */
