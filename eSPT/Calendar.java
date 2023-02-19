package eSPT;
import java.util.Random;

public class Calendar {
	events ZZZ = new events("empty", "   "), 
			// eventsMJR
			MJR = new events("Major", "MJR"),
			RMQ = new events("Regional Major Qualifiers", "RMQ"), 
			RMR = new events("Regional Major Ranking", "RMR"),
			// eventsS
			IEM = new events("Intel Extreme Masters", "IEM"), 
		    EPL = new events("ESL PRO League", "EPL"), 
		    BWF = new events("Blast Premier: World Final", "BWF"), 
		    // eventsA 
		    IEQ = new events("Intel Extreme Qualifiers", "IEQ"), 
		    IEP = new events("Intel Extreme PRO", "IEP"), 
		    ESQ = new events("ESL Open Qualifier", "ESQ"), 
		    ECL = new events("ESL Challenger League", "ECL"), 
		    BSS = new events("Blast Spring Showdown", "BSS"), 
		    BSF = new events("Blast Spring Finals", "BSF"), 
		    BFS = new events("Blast Fall Showdown", "BFS"), 
		    BFF = new events("Blast Fall Finals", "BFF"),
		    // eventsB
		    WEC = new events("IESF World Esports Championship", "WEC"), 
		    TSC = new events("Tipsport Cup", "TSC"), 
		    ELI = new events("Elisa Invitational", "ELI"), 
		    CEE = new events("CEE Championship", "CEE"), 
		    TBS = new events("Thunderpick Bitcoin Series", "TBS"), 
		    FEC = new events("Fantasyexpo Champions", "FEC"), 
		    FSU = new events("Funspark ULTI", "FSU"), 
		    WAL = new events("WePLay Academy League", "WAL"), 
		    GCL = new events("Gamers Club League", "GCL"),
		    // eventsC
		    FPL = new events("Faceit Pro League", "FPL"), 
		    FCL = new events("Faceit Challenger League", "FCL"), 
		    AIC = new events("Advanced Impact Cup", "AIC"), 
		    ECC = new events("ESEA Cash Cup", "ECC"), 
		    GCR = new events("Gamers Club Ranked", "GCR"), 
		    RLC = new events("REPUBLEAGUE Community Cup", "RLC"), 
			COL = new events("Collectors League", "COL");

	
	public events[] eventMJR() {
		events[] eventMJR = { MJR, RMQ, RMR };
		return eventMJR;
	}
	
	public events[] eventsS() {
		events[] eventsS = { BWF, EPL, IEM };
		return eventsS;
	}
	
	public events[] eventsA() {
	    events[] eventsA = { IEQ, IEP, ESQ, ECL, BSS, BSF, BFS, BFF };
	    return eventsA;
	}

	public events[] eventsB() {
	    events[] eventsB = { WEC, TSC, ELI, CEE, TBS, FEC, FSU, WAL, GCL };
	    return eventsB;
	}
	
	public events[] eventsC() {
	    events[] eventsC = { FPL, FCL, AIC, ECC, GCR, RLC, COL };
	    return eventsC;
	}
	
	public events[][] listevents() {
		events[][] listevents = { eventMJR(), eventsS(), eventsA(), eventsB(), eventsC() };
		return listevents;
	}

	
	public String[] WeekGen() {
		String[] week = new String[7]; 
		events[] el = eventsS();
		
		for (int i = 0; i < 7; i++) {
			int rand = new Random().nextInt(3);
			week[i] = "[ " + el[rand].eventabv + " ]";
		}
		
		return week;
	}
	
	
	 /*
	 Intel Extreme Masters - IEM
     ESL PRO League - EPL              
     Blast Premier: World Final - BWF  
     Major - MJR

     Regional Major Qualifiers - RMQ
     Regional Major Ranking - RMR
    
     Intel Extreme Qualifiers - IEQ     
     Intel Extreme PRO - IEP           

     ESL Open Qualifier - ESQ          
     ESL Challenger League - ECL       

     Blast Spring Showdown - BSS       
     Blast Spring Finals - BSF         
     Blast Fall Showdown - BFS          
     Blast Fall Finals - BFF
	
	 IESF World Esports Championship 2022 - WEC    50k
     Tipsport Cup - TSC                            48k                      
     Elisa Invitational - ELI                      45k
     CEE Championship - CEE                        40k
     Thunderpick Bitcoin Series - TBS              35k
     Fantasyexpo Champions - FEC                   32k
     Funspark ULTI - FSU                           30k
     WePLay Academy League - WAL                   28k   
     Gamers Club League - GCL                      25k
	
	 Faceit Pro League - FPL                       4k
     Faceit Challenger League - FCL                1k       
     Advanced Impact Cup - AIC                     2k         
     ESEA Cash Cup - ECC                           3k              
     Gamers Club Ranked - GCR                      1k
     REPUBLEAGUE Community Cup - RLC               2k
     Collectors League - COL                       3k
     */
}
