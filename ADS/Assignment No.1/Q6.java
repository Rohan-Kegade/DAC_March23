class Q6{	
	public static int find(int[] arr,int key){
		int n=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==key)
				n++;
		return n;	
	}
		
	public static void main(String[] args){
		int n = 8;
		int key = 250;
		int[] arr =  {10, 20, 30, 40, 50, 60, 250, 80, 90, 100, 
                110, 120, 130, 140, 150, 160, 170, 180, 190, 200,
                210, 220, 230, 240, 250, 260, 270, 280, 290, 300,
                310, 320, 330, 340, 350, 360, 370, 380, 390, 400,
                410, 420, 430, 440, 450, 250, 470, 480, 490, 500};
		
		int noOfDuplicates = find(arr,key);
		
		if(noOfDuplicates%2!=0)
			System.out.println(key+" is occuring "+noOfDuplicates+" times in array");
	}
}