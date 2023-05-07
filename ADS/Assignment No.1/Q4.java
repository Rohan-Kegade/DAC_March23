class Q4{	
	public static void findDuplicate(int[] arr){
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length-i;j++)
				if(arr[i]==arr[j])
					System.out.println(arr[i]+" is at index "+i+" duplicate entry found at index "+j);
			
	}
		
	public static void main(String[] args){
		int n = 8;
		int key = 100;
		int[] arr = {12,48,98,100,48,74,20,66};
		findDuplicate(arr);
		
	}
}