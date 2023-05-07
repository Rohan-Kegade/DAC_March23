class Q5{	
	public static int findLargest(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i] > max)
				max = arr[i];
			else
				continue;
		return max;
	}
	
	public static int findSmallest(int[] arr){
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i] < min)
				min = arr[i];
			else
				continue;
		return min;
	}
		
	public static void main(String[] args){
		int n = 8;
		int key = 100;
		int[] arr = {12,48,98,100,48,74,20,66};
		int max = findLargest(arr);
		System.out.println("Max	:	"+max);
		
		int min = findSmallest(arr);
		System.out.println("Min	:	"+min);
	}
}