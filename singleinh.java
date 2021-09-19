package  inherintance_1;

public class singleinh 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub 
	
		son  s=new son();
		s.mul();
		s.add();
		s.A();
		

	}

}
class G_father{
	void A() {
		int a=10;
		int d=5;
		System.out.println(a+d);
	}
}
class parent extends G_father{
	void add()
	{
	int a=5;
	int b=4;
	int c=a+b;
	int s=a-b;
	System.out.println("addition is " +c);
	System.out.println("subtraction is" +s);

	}
	
}
class son extends parent
{
	
	
	void mul() {
		int p=20;
		int q=5;
		int res=p*q;
		int res1=p/q;
		System.out.println("mul is " +res);
		System.out.println("div is " +res1);

	}
	
}





