package lesson2_bubble_sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36 };
		int i, j;
		int temp = array[0];
		int temp1 = array[array.length - 1];
		for (i = 0; i < (array.length - 1); i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i + 1];
				array[i + 1] = array[i];
				array[i] = temp;
			}
		for (j = (array.length - 1); j > 0; j--) {
			if (array[j] < array[j - 1]) {
				temp1 = array[j-1];
				array[j-1] = array[j];
				array[j] = temp1;
			}
		}
		System.out.print(array[i] + " ");
	}
		System.out.print(array[i] + " ");
	}
}
