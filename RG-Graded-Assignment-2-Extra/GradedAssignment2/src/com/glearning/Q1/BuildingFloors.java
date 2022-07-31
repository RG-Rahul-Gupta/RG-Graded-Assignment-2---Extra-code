package com.glearning.Q1;

import java.util.Scanner;
import java.util.Stack;

public class BuildingFloors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int size = sc.nextInt();
		Stack<Integer> floor = new Stack<Integer>();
		int[] floorSize = new int[size];
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter the floor size on day" + i + " - ");
			floorSize[i - 1] = sc.nextInt();
		}
		System.out.println("Order of construction is as follows");
		for (int i = 0; i < floorSize.length; i++) {

			System.out.println("\n Day " + (i + 1) + " - ");
			floor.push(floorSize[i]);
			if (!floor.isEmpty()) {
				while (!floor.isEmpty() && floor.peek() == size) {
					System.out.print(" " + floor.pop() + " ");
					size--;
				}
			}

		}
		sc.close();
	}
}
