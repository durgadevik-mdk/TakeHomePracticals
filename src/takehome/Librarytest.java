package takehome;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Librarytest {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new File("C:\\techfios\\test practical.txt"));
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] arr = line.split("-");
			System.out.println(arr[0]);
			String[] val = arr[1].split(",");
			for (int i = 0; i < val.length; i++) {
				System.out.println(val[i]);
			}
		}

	}
}
