package equalscomparison;

import java.util.stream.IntStream;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,4,6,7,13,2};
		
		//min element
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(min);
		
		int minimum=IntStream.of(arr).min().getAsInt();
		
		System.out.println(minimum);
		

	}

}
