package com.java.dhanasekaran;

import java.util.Scanner;

public class MathsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;

		Scanner maths = new Scanner(System.in);
		System.out.println("Enter your Integer X value");
		x = maths.nextInt();
		System.out.println("Enter your Integer Y value");
		y = maths.nextInt();
		System.out.println("Maths Operators\n ");
		System.out.println("Your Adition  (x+y) is =  " + "x=" + x + "," + "y=" + y + "=" + (x + y));
		System.out.println("Your Subtraction (x-y)is =  " + "x=" + x + "," + "y=" + y + "=" + (x - y));
		System.out.println("Your Multiblication (x*y)is =  " + "x=" + x + "," + "y=" + y + "=" + (x * y));
		System.out.println("Your Divition (x/y)is =  " + "x=" + x + "," + "y=" + y + "=" + (x / y));
		System.out.println("Your Modulus (x%y)is =  " + "x=" + x + "," + "y=" + y + "=" + (x % y));
		System.out.println("Opertor precitence (x*Y/10)" + "x=" + x + "," + "y" + y + "=" + (x * y / 10));
		
		System.out.println("Integer math x= " + (100 / x));

		System.out.println("\n Basic Maths Funtion\n");
//Abs
		float X, Y;
		System.out.println("Enter The Two Float value");
		X = maths.nextFloat();
		Y = maths.nextFloat();
		System.out.println("Floating point  math = " + (Y / 100));
		for (int i = 0; i < 100; i++) {
			x += 0.01D;
		}
		System.out.println("Floating Point Precision  X =  " + X);
		for (int i = 0; i < 100; i++) {
			y += 0.01D;
		}
		System.out.println("Floating Point Precision  Y =  " + Y);

		System.out.println("The absolute (positive)(abs) value of x = " + Math.abs(X));
		System.out.println("The absolute (positive)(abs) value of y = " + Math.abs(Y));
		System.out.println("Print nearest Integer(ceil) Value of X = " + Math.ceil(X));
		System.out.println("Print nearest Integer(ceil) Value of y = " + Math.ceil(Y));

		System.out.println("returns the closest(floor) integer value x= " + Math.floor(X));
		System.out.println("returns the closest integer(floor) value y = " + Math.floor(Y));

		System.out.println("returns the largest(floorDiv)  integer value  = " + Math.floorDiv(x, y));

		System.out.println("returns the minimum value x,y = " + Math.min(X, Y));
		System.out.println("returns the maximum value x, y = " + Math.max(X, Y));

		System.out.println("returns the round value X = " + Math.round(X));
		System.out.println("returns the round  value y = " + Math.round(Y));
		System.out.println("returns the random value  = " + Math.random());

		System.out.println("\nExponential and Logarithmic Math Functions\n");

		double a, b;
		System.out.println("Enter the two double value");
		a = maths.nextDouble();
		b = maths.nextDouble();
		System.out.println("returns Exp value  a= " + Math.exp(a));
		System.out.println("returns Exp value  b= " + Math.exp(b));
		System.out.println("returns log value  a= " + Math.log(a));
		System.out.println("returns log value  b= " + Math.log(b));
		System.out.println("returns log10 value  a= " + Math.log10(a));
		System.out.println("returns log10 value  b= " + Math.log10(b));
		System.out.println("returns pow value  = " + Math.pow(a, b));
		System.out.println("returns sqrt value  a= " + Math.sqrt(a));
		System.out.println("returns sqrt value  b= " + Math.sqrt(b));

		System.out.println("\nTrigonometric Math Functions\n");
		double A, B;
		System.out.println("Enter the Two Double value");
		A = maths.nextDouble();
		B = maths.nextDouble();
		System.out.println("PI value is =" + Math.PI);
		System.out.println("sin value is " + Math.sin(Math.PI));
		System.out.println("cos value is " + Math.cos(Math.PI));
		System.out.println("tan value is " + Math.tan(Math.PI));
		System.out.println("asin value is " + Math.asin(Math.PI));
		System.out.println("acos value is " + Math.acos(Math.PI));
		System.out.println("atan value is " + Math.atan(Math.PI));
		System.out.println("atan2 value is " + Math.atan2(A, B));
		System.out.println("sinh value is " + Math.sinh(Math.PI));
		System.out.println("cosh value is " + Math.cosh(Math.PI));
		System.out.println("tanh value is " + Math.tanh(Math.PI));
		System.out.println("toDegrees value is " + Math.toDegrees(Math.PI));
		System.out.println("totoRadians value is " + Math.toRadians(Math.PI));

	}
}
