/*
  Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price." Include a method to calculate the discount on the TV based on its scounted price.*/
package practice;

import java.util.Scanner;
public class TV {

	String brand;
	int size;
	float originalPrice = 0.0F;
	float discountPrice;

	Scanner sc = new Scanner(System.in);

	void user() {

		System.out.print("Enter Brand of the TV : ");
		brand = sc.nextLine();

		System.out.print("Enter Size of the TV : ");
		size = sc.nextInt();


	}

	void display()
	{
		System.out.println("Brand of the TV : " + brand);
		System.out.println("Size of the TV : " + size + " inch");
		System.out.println("Original Price of the Tv : " + originalPrice);
		System.out.println("Discount price of the TV : " + discountPrice);

	}


	void calculate() {
		if (size == 45) {
			originalPrice = 45000;
			int discount = 2000;
			discountPrice =  (originalPrice - discount);

		} else if (size == 55) {
			originalPrice = 55000;
			int discount2=3000;
			discountPrice =  (originalPrice - discount2);

		} else if (size == 65) {
			originalPrice = 65000;
			int discount3=4000;
			discountPrice =  (originalPrice - discount3);

		} else if (size == 75) {
			originalPrice = 75000;
			int discount4=5000;
			discountPrice =  (originalPrice - discount4);

		}
	}
}
	class c {
		public static void main(String args[]) {
			TV t = new TV();

			t.user();
			t.calculate();
			t.display();
		}
	}