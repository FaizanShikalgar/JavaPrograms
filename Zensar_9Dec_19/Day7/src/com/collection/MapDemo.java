package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

      Map<Integer,String> empMap = new HashMap<>();
      empMap.put(101,"Sam");
      empMap.put(104,"geeta");
      empMap.put(108,"Seeta");
      empMap.put(109,"Seeta");
   
      System.out.println(empMap.get(101));
      
      System.out.println(empMap.containsKey(104));
      
      Set<Integer> keySet = empMap.keySet();
      System.out.println(keySet);
      Iterator<Integer> itr = keySet.iterator();
      while(itr.hasNext()) {
    	  Integer ikey = itr.next();
    	  System.out.println("Key is:"+ikey+
    			  "\t Value:"+empMap.get(ikey));
      }
      
	}

}
