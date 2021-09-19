package inherintance_1;

import java.util.Scanner;

 class data1
{ 
	void info() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll NO");
	    int rn=sc.nextInt() ;
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter name");
		String name=sc1.nextLine();
		
		
	}
	
}
class data2 extends data1
{
	void info2() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
	    int mn=sc.nextInt() ;
	


	}
}
public class multilevel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		data2 d=new data2();
		d.info();
		d.info2();
		
		

	}

}
