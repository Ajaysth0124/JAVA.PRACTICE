package org.tnsif.accenture.c2tc.scanner_buffer_demo;
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name =scanner.nextLine();
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		System.out.println("name :"+ name + " "+"age :"+age);
		scanner.close();

	}

}