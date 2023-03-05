package com.Mexdi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		int[] arr = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			arr[i] = scanner.nextInt();
		}
		calcPositive(arrLength, arr);
		calcNegative(arrLength, arr);
		calcZeroes(arrLength, arr);
	}

	public static void calcPositive(int arrLength, int[] arr) {
		double positiveValueCount = 0;
		for (int num : arr) {
			if (num > 0) {
				positiveValueCount++;
			}
		}
		System.out.println(positiveValueCount / arrLength);
	}

	public static void calcNegative(int arrLength, int[] arr) {
		double negativeValueCount = 0;
		for (int num : arr) {
			if (num < 0) {
				negativeValueCount++;
			}
		}
		System.out.println(negativeValueCount / arrLength);
	}

	public static void calcZeroes(int arrLength, int[] arr) {
		double zeroValueCount = 0;
		for (int num : arr) {
			if (num == 0) {
				zeroValueCount++;
			}
		}
		System.out.println(zeroValueCount / arrLength);
	}
}