/*
class Dev
{
public int array1()
	{
	Integer n[]=new Integer[]{1, ,4, 8, 5};
	return n;
	}
}
*/

class Arrays
{
public static Integer[] array1()
	{
	Integer n[]=new Integer[]{1, 2, 4, 8, 5};
	return n;
	}
public static void main(String[]args)
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	// Length of Array
	Integer I[]=new Integer[5];
	System.out.println("Length of Array is: "+I.length);
	String s[]=new String[]{"Hai darling","How r u ", "Darling"};
	System.out.println("Length of String is: "+s.length);
	String s1=new String("Hai darling");
	System.out.println("Length of String is: "+s1.length());
	Integer I1[]=new Integer[]{1, 2, 3, 4, 5, 6 };
	System.out.println("Length of Array is: "+I1.length);
	
	// To take Array Input from end user

	System.out.println("Enter Array Size:");
	Integer size=sc.nextInt();
	Integer a[]=new Integer[size];
	for(int i=0; i<size; i++)
		{
		System.out.println("Enter the Elements");
		a[i]=sc.nextInt();
		}
//	sc.close();					//Exception (May or maynot use)
	System.out.println("Printing Elements");
	for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]);
		}

	// Return Array from method
	Integer b[] = array1();
	for(int i=0; i<b.length; i++)
		{	
		System.out.println("Array of elements are: "+b[i]);											
		}
	// Different way of printing Array
	// By using for loop	
	Integer p[]=new Integer[]{10, 20, 30};
	for(int i=0; i<p.length; i++)
		{
		System.out.print(p[i]+" ");
		}
	System.out.println("\n");
	// By using for-each loop	
	Integer q[]=new Integer[]{10, 20, 30};
	for(int i:q)
		{
		System.out.print(i+" ");
		}
	System.out.println("\n");

	// Printing 2D Array
	Integer r[][]=new Integer[][]{ {11,22,33} , {44, 55, 66} };
	for(int i=0; i<r.length; i++)
		{
		for(int j=0; j<r[i].length; j++)
			{
			System.out.print(r[i][j]+" ");
			}
		System.out.println("\n");
		}	

	// Printing 3D Array
	Integer sr[][][]=new Integer[][][]{ { {11,22} , {44, 55, 66} } ,{ {12, 13, 14 }, {21, 22} } };
	for(int i=0; i<sr.length; i++)
		{
		for(int j=0; j<sr[i].length; j++)
			{	
			for(int k=0; k<sr[i][j].length; k++)
				{
				System.out.print(sr[i][j][k]+" ");
				}
			System.out.println("\n");
			}
		}
	//1. Find the sum of array 
	Integer arr1[]=new Integer[8];
	Integer sum=0;
	arr1[0]=1;
 	arr1[1]=2;
	arr1[2]=3;
	arr1[3]=4;
	arr1[4]=5;
	arr1[5]=6;
	arr1[6]=7;
	arr1[7]=8;
	for(int i=0; i<arr1.length; i++)
		{
		sum=sum+arr1[i];
		}
	System.out.println("Sum of Array is: "+sum);

	//2. Find the sum of array 
	Integer arr2[]=new Integer[]{8, 7, 6, 5, 4, 3, 2, 1};
	Integer sum1=0;
	for(int i=0; i<arr2.length; i++)
		{
		sum1=sum1+arr2[i];
		}
	System.out.println("Sum of Array is: "+sum1);

	// Find the avarage of array
	Integer arr3[]=new Integer[5];
	Integer sum2=0;
	Double avg;
	System.out.println("Enter Array elements"+"\n");
	for(int i=0; i<5; i++)
		{
		arr3[i]=sc.nextInt();		
		}
	for(int i=0; i<5; i++)
		{
		System.out.println("Array Elements are: "+arr3[i]+" ");
		}
	for(int i=0; i<5; i++)
		{
		sum2=arr3[i]+sum2;
		}
	avg=sum2/5.0;
	System.out.println("\n"+"Sum of Array Elements is: "+sum2+"\n"+"Avarage of Array Elements is: "+avg);

	// Largest Number in array

	System.out.println("Enter Array size: ");
	Integer size1=sc.nextInt();
	Integer arr4[]=new Integer[size1];
	for(int i=0; i<size1; i++)
		{
		System.out.println("Enter Array Elements: ");
		arr4[i]=sc.nextInt();
		}
	System.out.println("Array  Elements are");
	for(int i=0; i<arr4.length; i++)
		{
		System.out.print(arr4[i]+" ");
		}
	Integer max=arr4[0];
	for(int i=1; i<arr4.length; i++)
		{
		if(max<arr4[i])
			{
			max=arr4[i];
			}
		}
	System.out.println("Maximum element in array is: "+max);

	// Lowest Number in array elements


	System.out.println("Enter Array size: ");
	Integer size2=sc.nextInt();
	Integer arr5[]=new Integer[size2];
	for(int i=0; i<size2; i++)
		{
		System.out.println("Enter Array Elements: ");
		arr5[i]=sc.nextInt();
		}
	System.out.println("Array  Elements are");
	for(int i=0; i<arr5.length; i++)
		{
		System.out.print(arr5[i]+" ");
		}
	Integer min=arr5[0];
	for(int i=1; i<arr5.length; i++)
		{
		if(min>arr5[i])
			{
			min=arr5[i];
			}
		}
	System.out.println("Minimum element in array is: "+min);
	}
}