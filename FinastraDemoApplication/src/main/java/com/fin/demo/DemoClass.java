package com.fin.demo;


public class DemoClass {
	public static void main(String args[]) {
		System.out.println("Test...");
		String res = play(Integer.parseInt(args[0]));
		System.out.println(res);
	}
	
	public static String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Divisible by 3";
        if (number % 5 == 0) return "Divisible by 5";


        return String.valueOf(number);
    }
}
