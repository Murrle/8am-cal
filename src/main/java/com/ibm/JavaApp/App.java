package com.ibm.JavaApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public int num1;
	public int num2;
	
	
	
	public int getNum1() {
		return num1;
	}



	public void setNum1(int num1) {
		this.num1 = num1;
	}



	public int getNum2() {
		return num2;
	}



	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int addFun(int num1, int num2) {
		return num1+num2;
	}
	
	public int subFun(int num1, int num2) {
		return num2-num1;
	}
	
	

	public static void main( String[] args )
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter First Num");
      int a = sc.nextInt();
      
      System.out.println("Enter Second Num");
      int b = sc.nextInt();
      
      App cal = new App();
      cal.setNum1(a);
      cal.setNum2(a);
      
      System.out.println(" The Sum is: "+cal.addFun(a, b));
      System.out.println(" The Dif is: "+cal.subFun(a, b));
    }
}
