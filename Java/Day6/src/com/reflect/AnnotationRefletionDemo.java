package com.reflect;

import java.lang.reflect.Method;

import com.annotation.DevInfo;
import com.annotation.UseAnnotation;

public class AnnotationRefletionDemo {

	public static void main(String[] args) {

     try {
		UseAnnotation ua = new UseAnnotation();
		 Class c = ua.getClass();
		 
		 Method method = c.getMethod("show");
		 System.out.println("Method info:"+method);
		 if(method.isAnnotationPresent(DevInfo.class)) {
			 DevInfo dinfo = method.getAnnotation(DevInfo.class);
			 System.out.println("Annotation Data:\nDeveloper Name:"
			       +dinfo.devName()+"\nDescription:"+dinfo.desc());
		 }
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
