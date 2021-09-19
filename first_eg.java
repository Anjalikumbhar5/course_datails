package inherintance_1;

public class first_eg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		B b=new B();
		b.A1();
	
	}

}
interface A
{
	void A1();
	void A2();
	
	
}
class B implements A
{
	public void A1() {
		System.out.println("this is implemeted  method");
		
	}

	@Override
	public void A2() {
		// TODO Auto-generated method stub
		
	}
	
}
