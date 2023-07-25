package assignment1;

public class ArmstrongNoRange {

	public static boolean findArm(int n) {

		int original = n;

		int res = 0;

		while (n != 0) {
			int rem = n % 10;
			res = res + (rem * rem * rem);
			n = n / 10;
		}

		if (res == original) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void ArmRange(int start ,int end) {
		
		for(int i=start;i<end;i++) {
			if(findArm(i)) {
				System.out.print(i+" ");;
			}
		}
		System.out.println();
	}


	public static void main(String[] args) {
		
		ArmRange(100, 999);

	}

}
