class Ejercicio32
{
	public static void main (String[] args)
	{
		double x;
		double y;
		double z;
		int a;
		int b;
		int c;
		
		x= 88;
		y= 3.5;
		z= -5.2;
		a= 2;
		b= 3;
		c= 5;
		
		System.out.println(x + y + z);
		System.out.println(a *y + 3 *  (x - z));
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(x / (y +z));
		System.out.println(x * (y % z));
		System.out.println(b * x - z - a * x);
		System.out.println(a * x / c % y);
		System.out.println(x - y - z *a);
	}
}