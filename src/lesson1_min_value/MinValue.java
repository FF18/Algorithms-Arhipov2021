package lesson1_min_value;

public class MinValue {

	public static void main(String[] args) {
		int[] array= {64,42,73,41,31,53,16,24,57,42,74,55,36};
		int minValue= array[0];
		int minIndex=0;
		for(int i=1; i<array.length; i++) {
			if(array[i]<minValue) {
				minValue=array[i];
				minIndex=i;
			}
		}
		System.out.println("minimum Value"+minValue);
		System.out.println("minimum Index"+minIndex);
	}

}
