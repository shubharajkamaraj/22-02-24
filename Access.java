class A
{
	int i;
	private int j;
	void setij(int x, int y)
	{
		i = x;
		j = y;
	}
}
class B extends A
{
	int total;
	void sum()
	{
		total = i + j; // ERROR, j is not accessible here
	}
}
class Access
{
	public static void main(String args[])
	{
		B subOb = new B();
		subOb.setij(10, 12);
 		subOb.sum();
		System.out.println("Total is " + subOb.total);
	}
}


/*

Access.java:16: error: j has private access in A
                total = i + j; // ERROR, j is not accessible here
                            ^
1 error

*/