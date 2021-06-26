package Case2;

import java.util.Scanner;

public class ParseInts {
	private static String line;
	private static Scanner scanLine;

	public static void main(String[] args) {
		int val, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line of text");
		scanLine = new Scanner(scan.nextLine());
		while (scanLine.hasNext()) {
			try {
				val = Integer.parseInt(scanLine.next());
				sum += val;
			} catch (NumberFormatException e) {

			}
		}
		System.out.println("The sum of the integers on this line is " + sum);
		scan.close();
	}

	public static String getLine() {
		return line;
	}

	public static void setLine(String line) {
		ParseInts.line = line;
	}

}
