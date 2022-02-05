package searching;

import java.util.Arrays;
import java.util.Scanner;

/*Search a sorted array by repeatedly dividing the search interval in half.
Begin with an interval covering the whole array.
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. 
Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.*/ 

public class binarySearch {

	public static int search(int arr[], int element) {
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == element) {
				return mid;
			} else if(arr[mid] < element) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the element to be searched");
		
		int element = sc.nextInt();
		
		System.out.println("Index of element is: " + search(arr, element));
	}

}
