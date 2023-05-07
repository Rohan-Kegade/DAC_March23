class Q3{	
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
	
	public static void main(String[] args){
		int n = 8;
		int[] arr = {12,48,98,100,47,74,20,66};
				
		sort(arr);
		
		System.out.println("Second Largest Element	:	"+arr[n-2]);
	}
}