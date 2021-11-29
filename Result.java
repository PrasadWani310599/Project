class Result{
	public static void main(String[] args){
		
		int sub1=70,sub2=80,sub3=54;
		
		if(sub1>60 && sub2>60 && sub3>60)
		{
			System.out.println("COngraturation Yor are passed");
		}
		else if((sub1>60 && sub2>60 || sub3<60)||(sub1<60 && sub2>60 && sub3>60)||
		(sub1>60 && sub3>60 || sub3>60))
		{
			System.out.println("You Are Promoted To Next Class");
		}
		else if(sub1<60 && sub2<60 && sub3<60)
		{
			System.out.println("You Are Fail");
		}
		
		
	}
