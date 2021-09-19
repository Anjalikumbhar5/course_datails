package inherintance_1;
class operation{
	void A() 
	{
	   System.out.println("This is parent class");
	   }
}
class Addition extends operation {
	void add() {
		int a=10;
		int b=5;
		int c=a+b;
		 System.out.println("Addition is " +c);
 
	}
}
class subtr extends operation{
	void sub() {
		int a1=10;
		int b1=5;
		int c1=a1-b1;
		 System.out.println("subtraction is" +c1);
		 


	}
}
public class heirarchical_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		subtr s=new subtr();
		s.A();

		s.sub();
		
		Addition a=new Addition();
		a.add();
		

	}

}
