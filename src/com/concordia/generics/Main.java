package com.concordia.generics;

public class Main {

	public static void main(String[] args) {
		Login<String> login = new Login<String>("p@b.com", "123456");
		
		System.out.println(login.getName());
		
		Login<Integer> login2 = new Login<Integer>(123, 12345);
		System.out.println(login2.getName());
		
		
		Person person = new Person();
		person.setName("John");
		person.setPassword("pass");
		Login<Person> login3 = new Login<Person>(person, person);
		System.out.println(login3.getName().getName() + ", " + login3.getPassword().getPassword());
	}

}
