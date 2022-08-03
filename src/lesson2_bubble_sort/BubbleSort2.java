package lesson2_bubble_sort;

// by video lesson 
public class BubbleSort2 {

	public static void main(String[] args) {
		int[] array = { 64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36 };
		printArray(array);
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
//					if (array[i] > array[i - 1]) { // sort from big to small
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					isSorted = false;
				}
			}
			printArray(array);
		}
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println("]");
	}
}
