class Q2{	
	static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
	}
	
	public static int search(int[] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int key, int low, int high){
		while(low<=high){
			int mid = (low + high) / 2;
			if(key==arr[mid])
				return mid;
			if(key<arr[mid])
				high = mid - 1;
			if(key>arr[mid])
				low = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args){
		int n = 8;
		int key = 100;
		int[] arr = {12,48,98,100,47,74,20,66};
		int index =search(arr,key);
		if(index==-1)
			System.out.println("key not Found");
		else
			System.out.println("Key found at index	:	"+index);
		
		sort(arr);
		index = binarySearch(arr,key,0,n-1);
		if(index==-1)
			System.out.println("key not Found");
		else
			System.out.println("Key found at index	:	"+index);
	}
}