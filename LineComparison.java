package com.BridgeLabz.lineComparison;
import java.util.Scanner;
public class LineComparison {
   public static void main(String[] args) {
	// TODO Auto-generated method stub
       
     //declaration
      Scanner sc = new Scanner(System.in);
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      int y1=sc.nextInt();
      int y2=sc.nextInt();
      
      //computation
      double length=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
      System.out.println("Length of the Line: "+length);
	}

}
