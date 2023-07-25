package assignment1;

import java.util.Scanner;

public class SearchInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = {5,12,14,6,78,19,1,23,26,35,7,52,86,47};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(n+" is present in index "+i);
			}
		}
		
		
		

	}

}
