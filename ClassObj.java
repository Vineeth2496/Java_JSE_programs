class Gmail
{
Integer a=12;
Integer b=23;
public Integer add()
	{
	Integer res=a+b;
	return res;
	}

}
class FB
{
//System.out.println("Welcome to FB");
}
class Insta
{
//System.out.println("Welcome to Instagram");
}
class ClassObj
{
public static void main(String[]args)
	{
	try
		{
		String req;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter your Request");
		req=sc.next();
		Object o=Class.forName( req).newInstance();
		System.out.println("Object is created: "+o.getClass());
//		System.out.println("res is " +o.add());
		}
	catch(Exception e)
		{
		System.out.println("OOPS Error");
		}
	}
}