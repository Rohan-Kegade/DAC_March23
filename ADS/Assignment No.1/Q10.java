class Q10{	
	
	public static void findDuplicates(int[] arr){
		for(int i=0;i<arr.length-1;i++){
				if(arr[i]==arr[i+1]){
					arr[i]=0;
				}
				else
					System.out.print(arr[i]+" ");
		}				
	}
	public static void main(String[] args){
		int[] arr =  {1,2,2,7,8,9,9,9,9,6,5,4,3,3,3};       
		findDuplicates(arr);
	}
}