package eSPT;

import java.util.Random;

public class Calendar {
	public static void main(String args[]) {
		//events
		//events blast = new events("blast series", "BLT"),
		//	iem = new events("intel extreme masters", "IEM"),
		//	empty = new events("empty", "   ");
		
		CalGen x = new CalGen();
		
		/*events[][] month = {{ empty, iem, empty, empty, empty, empty, empty,},
                { blast, empty, empty, empty, empty, empty, empty, },
                { empty, empty, iem, empty, empty, empty, empty, }, 
                { empty, empty, blast, empty, empty, empty, empty, }};
		*/
		
		for (int i = 0; i < 4; i++ ) {
			
			System.out.print("Week " + (i+1) + ": ");
			
			for (int j = 0; j < 7; j++ ) {
				
				System.out.print("[ " + x.WeekGen() + " ]");
			}
			System.out.println();
		}
	}
}