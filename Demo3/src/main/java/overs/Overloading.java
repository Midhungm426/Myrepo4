package overs;

public class Overloading
{
	public static int findsum(int a, int b)
	{
		return (a+b);
	}
	public static int findsum(int x, int y,int z)
	{
		return (x+y+z);
	}
	public static float findsum(float c,float d)
	{
		return(c+d);
	}
	public static void main(String[] args) 
	{
		int sum1=findsum(10,20);
		int sum2=findsum(2,4,6);
		float sum3=findsum(1.1f,2.3f);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
