package lesson5_quick_sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = {64, 42, 73, 31, 53, 16, 24, 57, 42, 74, 55, 36};
		int i;
		for(i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
		quickSort(array, i, array.length-1);
		test1();
		test2();
	}
	
	private static void quickSort(int[] arr, int from, int to) {
		if(from < to) {
			int divideIndex = partition(arr, from, to);
			printSortStep(arr, from, to, divideIndex);
			quickSort(arr, from, divideIndex-1);
			quickSort(arr, divideIndex, to);
		}
	}

	private static int partition(int[] arr, int from, int to) {
		int rightIndex = to;
		int leftIndex = from;
		
		int pivot = arr[from + (to - from)/2];
		while(leftIndex <= rightIndex) {
			while(arr[leftIndex] < pivot) {
				leftIndex++;
			}
			while(arr[rightIndex] > pivot) {
				rightIndex--;
			}
			if(leftIndex <= rightIndex) {
				swap(arr, rightIndex, leftIndex);
				leftIndex++;
				rightIndex--;
			}
		}
		return leftIndex;
	}
	
	private static void swap(int array[], int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
	private static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < array.length; i++) {
			if(i > 0) {
				sb.append(", ");
			}
			sb.append(array[i]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
		System.out.print(arrayToString(arr));
		System.out.print("\n partition at index: " + partitionIndex);
		System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
		System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)));
	}
	
	private static void bubbleSort(int[] arr) {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int i = 1; i < arr.length; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
					sorted = false;
				}
			}
		}
	}
	
	private static void test1() {
		int testLen = 100000;
		
		int[] arr1 = new int[testLen];
		int[] arr2 = new int[testLen];
		
		System.out.println("\n-----somthing array------");
		
		for(int i = 0; i < testLen; i++) {
			arr2[i] = arr1[i] = (int)Math.round(Math.random() * 10000);
		}
		
		System.out.println("Quick Sort: ");
		measureTime(() -> quickSort(arr1, 0, testLen -1));
		
		System.out.println("Bubble Sort: ");
		measureTime(() -> bubbleSort(arr2));
		
	}
	
	private static void test2() {
		int testLen = 100000;
		
		int[] arr1 = new int[testLen];
		int[] arr2 = new int[testLen];
		
		System.out.println("\n-----somthing array------");
		
		for(int i = 0; i < testLen; i++) {
			arr2[i] = arr1[i] = i;
		}
		
		System.out.println("Quick Sort: ");
		measureTime(() -> quickSort(arr1, 0, testLen -1));
		
		System.out.println("Bubble Sort: ");
		measureTime(() -> bubbleSort(arr2));
		
	}
	
	private static void measureTime(Runnable task) {
		
	}

}
