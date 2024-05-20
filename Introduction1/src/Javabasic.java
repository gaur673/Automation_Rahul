import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Javabasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		String aa="gaurav";
		char ch='a';
		float fl= 3.4f;
		double dl= 5.6;
		boolean bl= true;
		
		System.out.println(aa + " " +ch);
		System.out.println(fl+"   "+ dl);
		
//Array
		
		int[] arr= {1,3,6,2,6};
		
		for( int i=0;i<=arr.length-1;i++)
		{
		
		System.out.print(arr[i]+" ,");
		}
	
		System.out.println("");
		
		int[] arr1 = new int[3];
		arr1[0]= 23;
		arr1[1]= 232;
		arr1[2]= 243;
		
		
		for( int i=0;i<=arr1.length-1;i++)
		{
		
		System.out.println(arr1[i]);
		}
		
		String[] str = {"aa","dd","ffd"};
		
		for( int i=0;i<=str.length-1;i++)
		{
		
		System.out.println(str[i]);
		}
		
		// other way for 'for loop' -- enhanced for loop
		for(String s: str)
		{
			System.out.println(s);
		}
		
		
		int[] integer= {1,2,3,4,5,6,8,9,10,20};
		
		for(int i=0;i<integer.length;i++)
		{
			if(integer[i]%2==0)
			{
				System.out.println(integer[i]+",");
				break;
			}
			else if(integer[i]%2==1)
			{
				System.out.print(integer[i]+", ");
			}
		}
		
		
 // Arraylist - dynamically increase size of array
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("gau");
		a2.add("asdfg");
		a2.add("chauha");
		
		System.out.println(a2.get(2));
		
		for(int i=0;i<a2.size();i++)
		{
			System.out.println(a2.get(i));
		}
		
		for(String s: a2)
		{
			System.out.println(s);
		}
		
		//a2.contains("gau");
		System.out.println(a2.contains("gau"));
		
// List
		String[] str1 = {"aa","dd","ffd"};
		
		List<String> ls= Arrays.asList(str1);
		
		boolean bl1= ls.contains("dd");
		System.out.println(bl1);
		// or
		System.out.println(ls.contains("dd"));

//String- it is an object which represent sequence of character
		String s= "gaurav";  // String literal
		String s1= "gaurav"; // point same s in memory
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome"); // new memory space will create
		
		String s4="Rahul shetty academy";
		String[] s5= s4.split(" ");
		for(String s6: s5)
		{
			System.out.println(s6+" / ");
		}
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		// Printing in reverse "gaurav"
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		int[] ss= {23,4,2,222,564};
		for(int i=ss.length-1;i>=0;i--)
		{
			System.out.println(ss[i]);
		}
			
		Javabasic oo= new Javabasic();
		oo.getdata();
		String sd=oo.getdata1();
		System.out.println(sd);
		
		
		// Public method from other class
		// if we change it to private , will get error
		Accessmethod am= new Accessmethod();
		String sd1=am.getdata2();
		System.out.println(sd1);
		
		
		// static method - this method not need object to call, it can be directly access
		String sd2=getdata3();
		System.out.println(sd2);
		
		
		
	}
	
	public void getdata()
	{
		System.out.println("heelo");
	}
	
	public String getdata1()
	{
		return "gaurav chauhan";
	}
	
	
	public static String getdata3()
	{
		return "hitdon";
	}

}


