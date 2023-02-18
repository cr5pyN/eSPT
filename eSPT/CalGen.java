package eSPT;
import java.util.Random;

public class CalGen {
	events blast = new events("blast series", "BLT"),
			iem = new events("intel extreme masters", "IEM"),
			empty = new events("empty", "   ");
	
	public events[] eventlist() {
		events[] arr = { blast, iem, empty };
		return arr;
	}
	
	public void WeekGen() {
		events[] week = {}; 
		events[] el = eventlist();
		
		for (int i = 0; i < 7; i++) {
			int rand = new Random().nextInt(2);
			week[i] = el[rand];
		}
	}
	
	
	// Intel Extreme Masters - IEM
    // ESL PRO League - EPL              
    // Blast Premier: World Final - BWF  
    // Major - MJR

    // Regional Major Qualifiers - RMQ
    // Regional Major Ranking - RMR
    
    // Intel Extreme Qualifiers - IEQ     
    // Intel Extreme PRO - IEP           

    // ESL Open Qualifier - ESQ          
    // ESL Challenger League - ECL       

    // Blast Spring Showdown - BSS       
    // Blast Spring Finals - BSF         
    // Blast Fall Showdown - BFS          
    // Blast Fall Finals - BFF
	
	// IESF World Esports Championship 2022 - WEC    50k
    // Tipsport Cup - TSC                            48k                      
    // Elisa Invitational - ELI                      45k
    // CEE Championship - CEE                        40k
    // Thunderpick Bitcoin Series - TBS              35k
    // Fantasyexpo Champions - FEC                   32k
    // Funspark ULTI - FSU                           30k
    // WePLay Academy League - WAL                   28k   
    // Gamers Club League - GCL                      25k
	
	// Faceit Pro League - FPL                       4k
    // Faceit Challenger League - FCL                1k       
    // Advanced Impact Cup - AIC                     2k         
    // ESEA Cash Cup - ECC                           3k              
    // Gamers Club Ranked - GCR                      1k
    // REPUBLEAGUE Community Cup - RLC               2k
    // Collectors League - COL                       3k
}
