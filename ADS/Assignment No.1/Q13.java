class Q13{	
	public static boolean findPair(int[] arr,int target){
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++)
				if((arr[i]+arr[j])==target && i!=j){
					System.out.println("Pair Found : "+arr[i]+" "+arr[j]);
					flag = true;
				}
		return flag;		
	}
		
	public static void main(String[] args){
		int n = 8;
		int target = 250;
		int[] arr =  {10, 20, 30, 40, 50, 60, 250, 80, 90, 100, 
                110, 120, 130, 140, 150, 160, 170, 180, 190, 200,
                210, 220, 230, 240, 250, 260, 270, 280, 290, 300,
                310, 320, 330, 340, 350, 360, 370, 380, 390, 400,
                410, 420, 430, 440, 450, 250, 470, 480, 490, 500};
		
		boolean status = findPair(arr,target);
		
		if(!status)
			System.out.println("No Pair Found!");
	}
}