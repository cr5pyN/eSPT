package eSPT;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		Calendar x = new Calendar();
		
		for (int i = 0; i < 4; i++ ) {
			
			System.out.print("Week " + (i+1) + ": ");
			
			for (int j = 0; j < 7; j++ ) {
				String[] week = x.WeekGen();
				System.out.print(week[j]);
			}
			System.out.println();
		}
		
		kb.close();
	}
}