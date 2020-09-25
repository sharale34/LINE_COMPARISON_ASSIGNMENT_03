package com.BridgeLabz.lineComparison;
import java.util.Scanner;
public class LineComparison {
   public static void main(String[] args) {
	// TODO Auto-generated method stub
       
        //declaration
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int y1=sc.nextInt();
		int y2=sc.nextInt();
		int y3=sc.nextInt();
		int y4=sc.nextInt();
		
	    //computation
		double Length1=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
		double Length2=Math.sqrt(((x3-x4) * (x3-x4)) + ((y4-y3) * (y4-y3)));
		//usage of Wrapper class
		Double obj1 = new Double(Length1);
		Double obj2 = new Double(Length2);
		int comp=obj1.compareTo(obj2);
		if(comp==0)
		{
			System.out.println("Both the lines have equal Length.");
		}
		else if(comp>0)
		{
			System.out.println("Length of line1 is greater than line2.");
		}
		else
		{
			System.out.println("Length of line1 is less than line2.");
		}
	}

}
