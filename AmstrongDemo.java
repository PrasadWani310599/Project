class AmstrongDemo{
	public static void main(String[] args){
		
		int num=200,sum=0;
		int temporary=num;
		while(temporary!=0)
		{
			int rem = temp%10;
			 sum = sum+(rem*rem*rem);
			temporary= temporary/10;
		}
	
		if(sum==num)
		{
			System.out.println("It is a amstromg number"+num);
		}			
		else{
			System.out.println("Its not An Amstrong Number"+num);
		}
			
			
			
		
	}
}