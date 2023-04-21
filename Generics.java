class development<T>
{
private T id;
public development(T id)
	{
	this.id=id;
	}
public T GetID()
	{
	return id;
	}
}
class development2<T, E, K, V>
{
private T name;
private E id;
private K phno;
private V BG;
public development2(T name, E id, K phno, V BG)
	{
	this.name=name;
	this.id=id;
	this.phno=phno;
	this.BG=BG;
	} 
public String toString()
	{
	return name+" , "+id+" , "+phno+" , "+BG;
	}
}

class Generics
{
public static void main(String[]args)
	{
	development<Integer> d=new development<Integer>(1020);
	System.out.println("Development ID is: "+d.GetID());
	development<Integer> d2=new development<Integer>(1122);
	System.out.println("Development2 ID is: "+d2.GetID());
	development2<String, String, Integer, String> d3=new development2<String, String, Integer, String>("Vineeth", "TSI-001", 983649298, "O+" );
	System.out.println("Employee Details"+"\n"+d3.toString());
	} 
}