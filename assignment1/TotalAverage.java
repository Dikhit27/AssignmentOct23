package assignment1;

import java.util.Scanner;

public class TotalAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		
		int total = sub1+sub2+sub3;
		
		int avg = total/3;
		
		System.out.println("Total marks obtain by the student " +total);
		System.out.println("Average marks obtain by the student " +avg);
		
		
		int student = sc.nextInt();
		
		int total1=0;
		for(int i=1;i<=student;i++) {
			System.out.println("Enter the marks student "+i+"got");
			int sub = sc.nextInt();
			total1+=sub;
		}
		
		System.out.println("Total marks of the students in one sub "+total1);
		System.out.println("Average marks of the students in one sub "+total1/student);
		
		
		

	}

}
