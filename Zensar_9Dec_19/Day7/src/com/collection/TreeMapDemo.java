package com.collection;
import java.util.*;
public class TreeMapDemo
{	public static void main(String[] args) 
	{
		TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("z", "Zabra");
		map.put("a", "ant");
		map.put("d","dog");
		map.put("h","horse");
		
		System.out.println(map);
		
        SortedMap<String,String> submap;
		submap = map.subMap("b", "g");
		System.out.println(map +""+submap);
		
		map.put("b","bat");
		submap.put("f", "fish");
		
		map.put("r","raccon");
       // submap.put("p","pig");
		
		System.out.println(map + " "+ submap);
		
		
				
				

	}

}
