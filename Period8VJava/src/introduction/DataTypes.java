package introduction;

public class DataTypes {

	public static void main(String[] args) {
		//System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		/*double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));*/
		
		String ten = "10";
		String two = "2";
		if (ten.compareTo(two)>0) System.out.println("10 is greater than two");
		else System.out.print("10 is not greater than two");
		
		//1 cannot convert from string to int
		//String s = 1;
		//System.out.println(s);
		
		//2 cannot cast from int to string
		//String s = (String)1;
		//System.out.println(s);
		
		//3 prints 1
		//String s = "1";
		//System.out.println(s);
		
		//4 prints 1
		//String s = ""+1;
		//System.out.println(s);
		
		//5 prints "Happy 18th Birthday"
		//String s = "Happy "+18+"th birthday!";
		//System.out.println(s);
		
		//6 prints "Happy 18th Birthday!"
		//String s = "Happy 18th birthday!";
		//System.out.println(s);
		
		//7 prints "Happy 18th birthday!"
		//String s = "Happy "+54/3+"th birthday!";
		//System.out.println(s);
		
		//8 prints "Happy 18th birthday!"
		//String s = "Happy "+(54/3)+"th birthday!";
		//System.out.println(s);
		
		//9 prints "m/n is 3" 
		//int m = 22;
		//int n = 7;
		//System.out.println("m/n is "+(m/n));
		
		//10 prints "m/n is 3.142857142857143"
		//int m = 22;
		//int n = 7;
		//System.out.println("m/n is "+((double)m/n));
		}
}