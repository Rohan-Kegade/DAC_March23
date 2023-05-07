class Q8{	
	
	public static void findPair(int[] arr){
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-1;j++)
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}					
		System.out.println("Pair Found: "+arr[0]+" "+arr[1]);			
	}
	public static void main(String[] args){
		int n = 8;
		int[] arr =  { 110, 120, 130, 140, 150, 160, 170, 180, 190, 200,
					210, 220, 230, 240, 250, 260, 270, 280, 290, 300,
					310, 320, 330, 340, 350, 360, 370, 380, 390, 400,
					410, 420, 430, 440, 450, 250, 470, 480, 490, 500,
					10, 20, 30, 40, 50, 60, 250, 80, 90, 100};
                
		findPair(arr);
		
	}
}