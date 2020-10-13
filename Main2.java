package teineylesanne;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    
    private static double koguHind;
    private static int lisandeidBurgeris;
    
    public Main2() {
	this.koguHind = 0;
	this.lisandeidBurgeris = 0;
    }
    
    public static void printText(String text) {
	System.out.println(text);
    }

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	// Kõigepealt koostan burgerid ja lisandite valiku.
	Burger chickenBurger = new Burger("Chicken Burger", "kanaliha", "valge sai", 4.50);
	chickenBurger.lisaLisandid("juust", 0.5, "salat", 0.7, "tomat", 1, "majonees", 0.5);
	
	Burger oldFashionCheeseburger = new Burger("Old Fashion Cheeseburger", "loomaliha", "valge sai", 3.00);
	oldFashionCheeseburger.lisaLisandid("peekon", 1.50, "kurk", 0.5, "sibul", 0.25, "peekoni kaste", 0.5);
	
	Burger newYorkBurger = new Burger("New York Burger", "sealiha", 6.00);
	newYorkBurger.lisaLisandid("ananass", 0.5, "tomat", 1, "kurk", 0.5, "sibul", 0.25);

	// Lisan burgerid menüüsse.
	Menuu burgeriteMenuu = new Menuu();
	
	burgeriteMenuu.lisaMenuusse(chickenBurger);
	burgeriteMenuu.lisaMenuusse(oldFashionCheeseburger);
	burgeriteMenuu.lisaMenuusse(newYorkBurger);
	
	// Kuvan külastajale menüü.
	printText("Tere tulemast minu burgeriputkasse! \n");
	printText("Tänane menüü on järgnev");

	ArrayList<Burger> burgers = new ArrayList<Burger>();
	int burgeriNumber = 1;
	
	for (Burger burger : burgeriteMenuu.burgeriMenuu()) {
	    printText(burgeriNumber + ". " + burger.burgeriNimetus() + " - " + burger.burgeriLiha() + ", " + burger.burgeriSai());
	    burgeriNumber ++;
	}
	
	while (true) {
	    // Lasen valida burgeri
	    System.out.print("\nMillist burgerit te soovite? (Kirjuta 0 lõpetamiseks): ");
	    int burgeriValik = Integer.parseInt(userInput.nextLine());
		
	    if (burgeriValik == 0) {
		break;
	    }
	    
	    Burger kliendiBurger = burgeriteMenuu.valiBurger(burgeriValik);
	    
	    burgers.add(kliendiBurger);
	    // Kuvan valitud burgeri võimalikud lisandid
	    kliendiBurger.kuvaLisandid();
		
	    while (true) {
		System.out.print("Millist lisandit soovite? (Jätke tühjaks kui enam ei soovi): ");
		String lisand = userInput.nextLine();
		    
		if (lisand.isEmpty()) {
		    break;
		}
		
		kliendiBurger.valiLisand(lisand);
		
		if (kliendiBurger.lisand1Nimetus().equals(lisand)) {
		    kliendiBurger.lisaHinnale(kliendiBurger.hind1());
		} else if (kliendiBurger.lisand2Nimetus().equals(lisand)) {
		    kliendiBurger.lisaHinnale(kliendiBurger.hind2());
		} else if (kliendiBurger.lisand3Nimetus().equals(lisand)) {
		    kliendiBurger.lisaHinnale(kliendiBurger.hind3());
		} else if (kliendiBurger.lisand4Nimetus().equals(lisand)) {
		    kliendiBurger.lisaHinnale(kliendiBurger.hind4());
		}
	    }
	    
	    koguHind += kliendiBurger.koostaBurger();
	    lisandeidBurgeris += kliendiBurger.lisanditeArv();
	    printText("Hetkene hinnaseis: " + koguHind + ", lisandeid " + lisandeidBurgeris);
	}
	printText("\nTeie tsekk:");
	for (Burger burger : burgers) {
	    printText(burger.burgeriNimetus() + " - "+ burger.burgeriHind());
	}
	printText("\nHind, mis tuleks tasuda: " + koguHind);
    }

}
