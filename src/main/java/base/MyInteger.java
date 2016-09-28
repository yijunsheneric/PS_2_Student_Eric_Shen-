// This program is under the package base as we can see through the 
//(continue on above) structure of the code will show the base package directory


package base;

public class MyInteger {
	
	
//Part ONE

// Acoording to the instruction, we need to name iValue to store the
//(continue above) integer value. Moreover, we need to use a constructor
//(Continue) and get method to return the iValue.  
		
		private int iValue; 
			
		public int getValue() 
		{ 
			return iValue ;
		}
		
		private void setValue(int iValue)
		{
			this.iValue = iValue;
		}
		
// This is to create Myinteger object to specific values. 
		
		public MyInteger(int value) 
		{
			this.iValue = iValue;
			
		}
		
		
// Part TWO
		
// In this part, we need to create a method and/or constructor to odd number, 
// even number and the prime number. For even number, we use the mathematical method,
// which is any even number divide the number 2 will have 0 reminder. For odd number,
// any odd number divide the number 2 will have reminder 1. For example, if 9 divide 2,
// result will come with reminder 1. 
		
		public boolean isEven() 
		{
			if (this.getValue() % 2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		

		
		public boolean isOdd() 
		{
			if (this.getValue() % 2 == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	
		
		public boolean isPrime() 
		{
			int i = 0;
			for (i = 1; i <= iValue / 2; i++)
			{
				if (iValue % i == 0) 
					return true;
			}
			return false;
		}
		

		
//Part THREE
		
				
// In this satic method, we will need to use static method to justify whether the number is 
// odd number, even number or the prime number. However, in this part, the 
		
		
		
		public static boolean isEven(int value) 
		{
			if (value % 2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		// Static method that returns true if the given value is odd
		public static boolean isOdd(int value) 
		{
			if (value % 2 == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		// Static method that returns true if the given value is prime
		public static boolean isPrime(int z) 
		{
			int i = 0;
			for (i = 2; i <= z / 2; i++){
				System.out.print(i);
				if (z % i != 0){
					return true;
				}
			}
			return false;
		}
		
		// Static method that returns true if the given value is even
		public static boolean isEven(MyInteger myIntx) 
		{
			if (myIntx.getValue() % 2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		// Static method that returns true if the given value is odd
		public static boolean isOdd(MyInteger myInty) 
		{
			if (myInty.getValue() % 2 == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		// Static method that returns true if the given value is prime
		public static boolean isPrime(MyInteger myIntz) 
		{
			int i = 0;
			for (i = 2; i <= myIntz.getValue() / 2; i++)
			{
				if (myIntz.getValue() % i != 0) 
					return true;
			}
			return false;
		}
		
		// Returns true if the value in the object is equal to the specified value
		public boolean equals(int a) 
		{
			return a == iValue;
		}
		
		// Returns true if the value in the object is equal to the specified value
		public boolean equals(MyInteger b) 
		{
			return b.getValue() == iValue;
		}
		
		// Converts an array of numeric characters into an integer value
		public static int parseInt(char[] a) 
		{
			return parseInt(new String(a));
		}
		
		// Converts a string into an integer value
		public static int parseInt(String s)
		{
			return Integer.parseInt(s);
		}
		
	}
