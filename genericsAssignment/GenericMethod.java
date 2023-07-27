package genericsAssignment;

public class GenericMethod {

	public static <T> void swapNumber(int idx1, int idx2, T[] arr){
		T temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5 };

		
		swapNumber(0, 1, arr);

		for (int i : arr)
			System.out.print(i + " ");

		String strArr[] = { "apple", "dog", "cat" };

		swapNumber(0, 1, strArr);

		for (String i : strArr)
			System.out.print(i + " ");

	}

}
