package overs;

public class Overriding extends Override
{
	public void show()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		Overriding obj=new Overriding();
		obj.show();
	}
}