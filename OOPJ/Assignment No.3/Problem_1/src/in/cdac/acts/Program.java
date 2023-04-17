package in.cdac.acts;

import java.util.Scanner;
import java.util.Arrays;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
			Arrays.sort(arr);
			System.out.print("Sorted Array: ");
			for(int element:arr)
				System.out.print(element+" ");
	}

	private static void largestElement(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			else
				continue;
			}
		System.out.println("Largest element in Array : "+max);
	}

	private static void smallestElement(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			else
				continue;
			}
		System.out.println("Smallest element in Array : "+min);		
	}

	private static void average(int sum,int size) {
		// TODO Auto-generated method stub
			float average = (sum / size);
			System.out.println("Average of Array : "+average);
	}

	private static int sum(int[] arr) {
		// TODO Auto-generated method stub
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println("\nSum of Array : "+sum);
			return sum;
	}

	private static void displayRecord(int[] arr) {
		// TODO Auto-generated method stub
			System.out.print("Contents of array: ");
			for(int element:arr)
				System.out.print(element+" ");
	}

	private static void acceptRecord(int[] arr) {
			int index=0;
			for(int element:arr) {
				System.out.print("Enter Array Element :  ");
				arr[index]=sc.nextInt();
				index++;
			}// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
			System.out.print("Enter Size of Array: ");
			int size = sc.nextInt();
			int[] arr = new int[size];
			
			Program.acceptRecord(arr);
			Program.displayRecord(arr);
			int sum= Program.sum(arr);
			Program.average(sum,size);
			Program.smallestElement(arr);
			Program.largestElement(arr);
			Program.sort(arr);
	}
	}
