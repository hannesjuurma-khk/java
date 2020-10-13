package teineylesanne;

import java.util.ArrayList;

public class Menuu {
    private ArrayList<Burger> burgers = new ArrayList<Burger>();

    public Menuu() {}
    
    public void lisaMenuusse (Burger burger) {
	burgers.add(burger);
    }
    
    public Burger valiBurger(int burgeriNumber) {
	Burger soovitudBurger = burgers.get(burgeriNumber - 1);
	return soovitudBurger;
    }
    
    public ArrayList<Burger> burgeriMenuu() {
	return this.burgers;
    }
}
