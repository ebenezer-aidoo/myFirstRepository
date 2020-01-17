package com.amalitech.scannerclass;
	import java.util.Scanner;
		
	public class ScannerClass {
		public static void main(String[] args) {
			
		Scanner input = new Scanner (System.in);	
		
		
		System.out.println("What is the colour of Manchester?");
		String nme = input.nextLine ();
	
		System.out.println("Manchester is "+ nme);
		
		System.out.println("Where is manchester located?");
		String loc = input.nextLine ();
		
		System.out.println("Manchester is in "+ loc);

		
		System.out.println("What is the width");
		int wdth = input.nextInt ();
		
		System.out.println("What is the lenght");
		int lnght = input.nextInt ();
		
		System.out.println("Area = "+ lnght * wdth);
		
		
		System.out.println("What is the lenght");
		int lenght = input.nextInt();
		
		System.out.println("what is the width");
		int width = input.nextInt();
		
		int rslt = lenght * width;
		int acrs = rslt * 43560;
		
		System.out.println(acrs);
	
		
		/*
		System.out.println("Number of container less than one litre");
		double lessLitre = input.nextDouble();
		
		System.out.println("Number of container more than one litre");
		double moreLitre = input.nextDouble();
		
		double addLessLitre = lessLitre * 0.10;
		double addMoreLitre = moreLitre * 0.25;
		
		double rslt = addLessLitre;
		double rslt2 = addMoreLitre;
		
		/*System.out.println("For less than 1 litre the amount = $" + rslt);
		System.out.println("For more than 1 litre the amount = $" + rslt2);
		
		
		input.close();
		
		
		
		

		
		System.out.println("Cost of Meal ordered");
		double foodCst = input.nextDouble();
		
		double txrate = 0.10;
		double txamnt = txrate * foodCst;
		double tip = 0.18 * foodCst;
		double grndTotl = foodCst + txamnt + tip;
		
		System.out.println("Taxamount = " + txamnt);
		System.out.println(" Tip amount =" + tip);
		System.out.println("Grand Total=" + grndTotl);
		
		*/
		
		

		
			
		}
}
