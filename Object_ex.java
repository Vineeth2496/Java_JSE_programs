class Test
{
	private Integer id;
	private String name;
	private Float sal;
	public Test(Integer id, String name, Float sal)
		{
		this.id=id;
		this.name=name;
		this.sal=sal;
		}
	public String toString()
		{
		return id + " " + name + " " +sal;
		}

}

class Object_ex
{
public static void main(String[]args)
	{

	//	1.  public final native java.lang.Class<?> getClass();

//	Test t=new Test();
//	System.out.println("To return class name: "+t.getClass());

	//	2.  public native int hashCode();

//	System.out.println("Address of object : "+t.hashCode());
	Byte km=120;
	String loc="hyderabad";
	Character c='A';
	Integer k=200;
	System.out.println("Loacation/address of k: "+k.hashCode());
	System.out.println("Loacation/address of km: "+km.hashCode());
	System.out.println("Loacation/address of Hyderabad: "+loc.hashCode());	
	System.out.println("Loacation/address of A: "+c.hashCode());
	
	//	3.  public boolean equals(java.lang.Object);

	String s1="ravi";
	String s2="ravi";
	String ss1=new String("Vikram");
	String ss2=new String("Vikram");
	if(s1==s2)
		{
		System.out.println("Hai dude");
		}	
	if(ss1.equals(ss2))
		{
		System.out.println("Hai darling");
		}
	System.out.println("Loacation/address of s1: "+s1.hashCode());	
	System.out.println("Loacation/address of s2: "+s2.hashCode());	
	System.out.println("Loacation/address of ss1: "+ss1.hashCode());	
	System.out.println("Loacation/address of ss2: "+ss2.hashCode());	

	//	4.  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
//	Test t1=new Test();
//	System.out.println(t1.clone());	
	
	//	5.  public java.lang.String toString();
	Test e=new Test(233, "vineeth", 23.97f);
	System.out.println(e);

	//	6.  public final native void notify();

	}
}

/*
C:\Users\admin>javap java.lang.Object
Compiled from "Object.java"
public class java.lang.Object
{
	  public java.lang.Object();
	1.  public final native java.lang.Class<?> getClass();
	2.  public native int hashCode();
	3.  public boolean equals(java.lang.Object);
	4.  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
	5.  public java.lang.String toString();	
	6.  public final native void notify();
	7.  public final native void notifyAll();
	8.  public final native void wait(long) throws java.lang.InterruptedException;
	9.  public final void wait(long, int) throws java.lang.InterruptedException;
	10.  public final void wait() throws java.lang.InterruptedException;
	11.  protected void finalize() throws java.lang.Throwable;
	  static {};
}
*/
