package com.BridgeLabz.lineComparison;
public class LineComparison {
	   //Decimal Formatter
		public static boolean compOutput;
		public static int compToOutput;

		public static void main(String[] args) {
			//Welcome message
			System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

			//Variables
			double length1, length2;
			int x1=(int) Math.floor(Math.random()*100);
			int x2=(int) Math.floor(Math.random()*100);
			int y1=(int) Math.floor(Math.random()*100);
			int y2=(int) Math.floor(Math.random()*100);
			int x3=(int) Math.floor(Math.random()*100);
			int x4=(int) Math.floor(Math.random()*100);
			int y3=(int) Math.floor(Math.random()*100);
			int y4=(int) Math.floor(Math.random()*100);

			//Length computation
			length1=Math.sqrt((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
			length2=Math.sqrt((x3-x4) * (x3-x4)) + ((y3-y4) * (y3-y4));

			System.out.println("Length of line 1 is : "+length1); 
			System.out.println("Length of line 2 is : "+length2);

			//Class object
			LineComparison obj1=new LineComparison();
			//Invoking equals and compareTo methods
			obj1.equals(length1, length2);
			obj1.compareTo(length1, length2);

		}
		public void equals(double Length1, double Length2) {
			//By equals method
			Double obj1 = new Double(Length1); 
			Double obj2 = new Double(Length2);
			compOutput=obj1.equals(obj2);

			if(compOutput) {
				System.out.println("Both the lines are equal in length");
			}
			else {
				System.out.println("Both the lines are not equal in length");
			}
		}
		public void compareTo(double Length1, double Length2) {
			//Wrapper class
			Double obj1 = new Double(Length1); 
			Double obj2 = new Double(Length2);
			compToOutput=obj1.compareTo(obj2);

			if(compToOutput==0) {
				System.out.println("Both the lines are equal in length");
			}
			else if(compToOutput<0){
				System.out.println("Line 2 length is greater than line 1 length");
			}
			else {
				System.out.println("Line 1 length is greater than line 2 length");
			}
		}
}
	