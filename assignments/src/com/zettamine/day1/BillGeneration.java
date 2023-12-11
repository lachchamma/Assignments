package com.zettamine.day1;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of pizzas bought: ");

		int pizzas = sc.nextInt();
		System.out.println("Enter no of puffs  bought: ");
		int puffs = sc.nextInt();
		System.out.println("Enter no of cool drinks  bought: ");
		int coolDrinks = sc.nextInt();
		generatesBill(pizzas, puffs, coolDrinks);

	}

	private static void generatesBill(int pizzas, int puffs, int coolDrinks) {
		int pizzaCost = 100;
		int puffCost = 20;
		int coolDrinkCost = 10;

		System.out.println("Bill Details");
		int total;
		total = pizzas * pizzaCost;
		System.out.println("No of Pizzas:\t" +"\t"+ pizzas + "\tCost: \t" + total);
		total = puffs * puffCost;
		System.out.println("No of Puffs: \t" + "\t"+puffs + " \tCost: \t" + total);
		total = coolDrinks * coolDrinkCost;
		System.out.println("No of Cool Drinks:" + "\t"+coolDrinks + " \tCost :\t" + total);

		int totalPrice = pizzas * pizzaCost + puffs * puffCost + coolDrinks * coolDrinkCost;
		System.out.println();
		System.out.println("Total Price= " + totalPrice);
		
		System.out.println("ENJOY THE SHOW!!!");

	}

}
