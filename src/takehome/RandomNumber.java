package takehome;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	static int[] myarray = null;
	static int[] newarray = null;

	public static void main(String[] args) {

		RandomNumber RN = new RandomNumber();
		int newlength = RN.randomnumber(10);
		for (int i = 0; i < newlength; i++) {
			System.out.print(newarray[i]+" ");
		}
		System.out.println("\n");
		System.out.println("new length of the arrray is : " + newlength);
		System.out.println("Given me a number to know nth smallest number in new array");
		Scanner input = new Scanner(System.in);
		int givenNthNumber = input.nextInt();
		System.out.println(newarray[givenNthNumber]);
	}

	public int randomnumber(int arraylength) {
		Random random = new Random();
		myarray = new int[arraylength];
		for (int i = 0; i < arraylength; i++) {
			myarray[i] = random.nextInt(arraylength);
		}
		System.out.println("Array before sorting " + Arrays.toString(myarray));
		Arrays.sort(myarray);
		System.out.println("Array after sorting " + Arrays.toString(myarray));
		newarray = new int[arraylength];
		int j = 0;
		for (int i = 0; i < arraylength - 1; i++) {
			if (myarray[i] != myarray[i + 1]) {
				newarray[j++] = myarray[i];

			}
		}
		newarray[j++] = myarray[arraylength - 1];
		System.out.println("Array after removing duplicates:" + Arrays.toString(newarray));
		return j;

	}

}
