import java.lang.reflect.Array;
class StringPre
{
public static void main(String[]args)
	{
	String name="Vineeth";
	String fname="Armoori";

	//	public int length();   
	//	To find the length of the String value.	

	System.out.println("String Length: " +name.length());	
	System.out.println("String Length: " +fname.length());
	
	//	public boolean isEmpty();
	//	To find boolean value of given String value length is Empty or Not.

	String e="";
	String f="Darling";
	System.out.println("String Length is Empty: "+ e.isEmpty());
	System.out.println("String Length is not Empty: "+ f.isEmpty());
	
	//	public char charAt(int);
	//	To find the String variable index number (Ex: Index value of String variable starts from 0 to n-1)
	
	String ph_no="9440169218";
	String Add="Hyderabad";
	System.out.println("Character Index value of Phone number is: " + ph_no.charAt(6));
	System.out.println("Character Index value of Address is: " + Add.charAt(4));

	//	public int codePointAt(int);
	//	Code Point At means is ASCII value for char/int variable for given Index to be Identified.
	
	try
	{
	String ee="Electrical Engineer";
	String Id="TSI 0025";
	System.out.println("Code point value/ASCI value  : " +ee.codePointAt(0));
	System.out.println("Code point value/ASCI value  : " +Id.codePointAt(3));

	//	public int codePointBefore(int);
	//	Code Point Before means is ASCII value for char/int value for given Index's before value(n-1) to be Identified.
	//	If the index value is "0" then (Output is String Index is out of range) 
	
	System.out.println("Code point before value/ASCI value: "+ ee.codePointBefore(0));
	}
	catch(Exception c)
	{
	System.out.println("Entered Number is out of Bound range, Enter valid range");
	}

	//	public int offsetByCodePoints(int, int);
	//	Offset By Code Points for Given Index values Addition.

	String Ind="India";
	System.out.println("Offset By code: "+ Ind.offsetByCodePoints(2, 1));

	//	void getChars(char[], int);
	//	Printing Character value step by step

	char a[]={'d', 'a', 'r', 'l', 'i', 'n', 'g'};
	for(int i=0; i<7; i++)
		{
		char x = Array.getChar(a, i);
		System.out.println(x);
		} 	
		

	//	public void getChars(int, int, char[], int);
	//	In between String required text printing. 
	
	try
		{
		String Msg="Hello Dude how are you doing";
		char[] dst=new char[18];
		Msg.getChars(10, 28, dst, 0);
		System.out.println(dst);
		}
	catch(Exception ex)
		{
		System.out.println("Enter required Index range");
		}	
		
	//	public void getBytes(int, int, byte[], int);
	//	Complier error shows (uses or overrides a deprecated API.)

/*	String B1="Vikram";
	byte[] B2=B1.getBytes();
	B1.getBytes(1, 6, B2, 0);
	System.out.println(B1);	*/	

	//	public byte[] getBytes();
	//	Method's output is string text.

	String by="Mould like water";
	byte[] by1=by.getBytes();
	by.getBytes();
	System.out.println("getBytes method: " +by);

	//	public boolean equals(java.lang.Object);
	//	logics for String variables is .equals to check "true" or "false" conditions.

	String b1="KGF1";
	String b2="KGF1";
	System.out.println("Names of Moives "+b1+ "is equals to " + b2 + " : " + b1.equals(b2));
	System.out.println("Address in memory is "+b1+" : " + b1.hashCode() );
	System.out.println("Address in memory is "+b2+" : " + b2.hashCode() );

	//	public boolean contentEquals(java.lang.StringBuffer);
	
	System.out.println("Content of " +b1+ " is equals to "+ b2 + " : "+b1.contentEquals(b2) );

	//	public boolean equalsIgnoreCase(java.lang.String);
	//	It compares text which is not a case sensetive.
	System.out.println("Compares text without case sensetive of " + b1 +" is equals to "+b2+ "is : "+ b1.equalsIgnoreCase(b2));

	//	public int compareTo(java.lang.String);	
	//	Difrence value of given ASCII numbers/char.
	String t1="Z";
	String t2="A";
	System.out.println("Diffrence between ASCII Values of "+ t1+ " and "+t2+" is : "+t1.compareTo(t2));

	//	public int compareToIgnoreCase(java.lang.String);
	//	Difference between ASCII values without case sensetive.
	
	String ti1="Z";
	String ti2="a";
	System.out.println("Diffrence between ASCII Values of without case sensitive "+ "'"+ti1+"'" + " and "+"'"+ti2+"'"+" is : "+ti1.compareToIgnoreCase(ti2));

	//	public java.lang.String toLowerCase();
	//	String text converts form Uppercase to Lowercase text.

	String Qt="MUSIC IS ONLY LANGUAGE OF LIVE AND LOVE";
	System.out.println(Qt.toLowerCase());
	
	//	public java.lang.String toUpperCase();
	//	String text converts from Lowercase to Uppercase text.

	String Qt1="Music is only language of live and love";
	System.out.println(Qt.toUpperCase());

	//	public int hashCode();
	String hash="  ";
	System.out.println("Address of hash variable : "+ hash.hashCode());

	}
}

/*
  public int length();			
  public boolean isEmpty();
  public char charAt(int);
  public int codePointAt(int);
  public int codePointBefore(int);
  public int codePointCount(int, int);
  public int offsetByCodePoints(int, int);
  void getChars(char[], int);
  public void getChars(int, int, char[], int);
  public void getBytes(int, int, byte[], int);
  public byte[] getBytes(java.lang.String) throws java.io.UnsupportedEncodingException;
  public byte[] getBytes(java.nio.charset.Charset);
  public byte[] getBytes();
  public boolean equals(java.lang.Object);
  public boolean contentEquals(java.lang.StringBuffer);
  public boolean contentEquals(java.lang.CharSequence);
  public boolean equalsIgnoreCase(java.lang.String);
  public int compareTo(java.lang.String);
  public int compareToIgnoreCase(java.lang.String);
  public boolean regionMatches(int, java.lang.String, int, int);
  public boolean regionMatches(boolean, int, java.lang.String, int, int);
  public boolean startsWith(java.lang.String, int);
  public boolean startsWith(java.lang.String);
  public boolean endsWith(java.lang.String);
  public int hashCode();
  public int indexOf(int);
  public int indexOf(int, int);
  public int lastIndexOf(int);
  public int lastIndexOf(int, int);
  public int indexOf(java.lang.String);
  public int indexOf(java.lang.String, int);
  static int indexOf(char[], int, int, java.lang.String, int);
  static int indexOf(char[], int, int, char[], int, int, int);
  public int lastIndexOf(java.lang.String);
  public int lastIndexOf(java.lang.String, int);
  static int lastIndexOf(char[], int, int, java.lang.String, int);
  static int lastIndexOf(char[], int, int, char[], int, int, int);
  public java.lang.String substring(int);
  public java.lang.String substring(int, int);
  public java.lang.CharSequence subSequence(int, int);
  public java.lang.String concat(java.lang.String);
  public java.lang.String replace(char, char);
  public boolean matches(java.lang.String);
  public boolean contains(java.lang.CharSequence);
  public java.lang.String replaceFirst(java.lang.String, java.lang.String);
  public java.lang.String replaceAll(java.lang.String, java.lang.String);
  public java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence);
  public java.lang.String[] split(java.lang.String, int);
  public java.lang.String[] split(java.lang.String);
  public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);
  public static java.lang.String join(java.lang.CharSequence, java.lang.Iterable<? extends java.lang.CharSequence>);
  public java.lang.String toLowerCase(java.util.Locale);
  public java.lang.String toLowerCase();
  public java.lang.String toUpperCase(java.util.Locale);
  public java.lang.String toUpperCase();
  public java.lang.String trim();
  public java.lang.String toString();
  public char[] toCharArray();
  public static java.lang.String format(java.lang.String, java.lang.Object...);
  public static java.lang.String format(java.util.Locale, java.lang.String, java.lang.Object...);
  public static java.lang.String valueOf(java.lang.Object);
  public static java.lang.String valueOf(char[]);
  public static java.lang.String valueOf(char[], int, int);
  public static java.lang.String copyValueOf(char[], int, int);
  public static java.lang.String copyValueOf(char[]);
  public static java.lang.String valueOf(boolean);
  public static java.lang.String valueOf(char);
  public static java.lang.String valueOf(int);
  public static java.lang.String valueOf(long);
  public static java.lang.String valueOf(float);
  public static java.lang.String valueOf(double);
  public native java.lang.String intern();
  public int compareTo(java.lang.Object);
  static {};
}
*/