package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		try {
			MyLinkedList<String> stringList = new MyLinkedList<>();
			
			System.out.println("-----------------------ADD------------------");
			
			stringList.add("Karina"); // Karina
			stringList.add("Jānis");// Karina Jānis
			stringList.print();// Karina Jānis
			stringList.add("Jana", 0);// Jana Karina Jānis
			stringList.print();// Jana Karina Jānis
			stringList.add("Līga", 2);// Jana Karina Līga Jānis
			stringList.print();// Jana Karina Līga Jānis
			System.out.println("-----------------------REMOVE------------------");
			stringList.remove(0);//Karina Līga Jānis
			stringList.print();//Karina Līga Jānis
			stringList.remove(1);//Karina Jānis
			stringList.print();//Karina Jānis
			stringList.remove(1);//Karina
			stringList.print();//Karina
			//stringList.remove(0);//empty 
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}