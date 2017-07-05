package com.java.ajeet;

/**
 * The Singleton's purpose is to control object creation, limiting the number of objects to only one. 
 * Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class, just like static fields. 
 * Singletons often control access to resources, such as database connections or sockets. 	
 * 
 * @author ajeet.a.bhatnagar
 *
 */
public class SingletonClass {

	/**
	 * Instantiate class object set it null
	 */
	private static SingletonClass instance = null;
	
	/**
	 * Make Class object Singleton so that from other class will not be able to create 
	 * instance of the singleton class
	 */
	public SingletonClass() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static SingletonClass getInstance() {
		if(instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
	
	/**
	 * Main Metod to class getInstance method to create the object,
	 * and if we try to create two object the object will be same 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		SingletonClass singletonClass1 = getInstance();
		System.out.println(singletonClass1);
		
		SingletonClass singletonClass2 = getInstance();
		System.out.println(singletonClass2);
		
		if(singletonClass1.equals(singletonClass2)) {
			System.out.println("Both Objects are same");
		} 
	}

}
