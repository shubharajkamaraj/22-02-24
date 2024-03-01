class Exc1
{
	static void subroutine()
	{
		int d=0;
		int a= 10/ d;
	}

	public static void main(String args[])
	{
		Exc1.subroutine();
	}
}

/*

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Excl.subroutine(Excl.java:6)
        at Excl.main(Excl.java:11)
*/