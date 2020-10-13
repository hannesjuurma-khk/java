package teineylesanne;

import java.util.ArrayList;

public class Burger {
    private String nimetus;
    private String lihaTüüp;
    private String saiaTüüp;
    private double hind;
    
    
    private String lisand1;
    private double hind1;
    private String lisand2;
    private double hind2;
    private String lisand3;
    private double hind3;
    private String lisand4;
    private double hind4;
    
    private ArrayList<String> valitudLisandid;
    private int lisanditeArv;
    
    public Burger(String nimi, String liha, double hind) {
	this(nimi,liha, "teraleib", hind);
    }
    
    public Burger(String nimi, String liha, String sai, double hind) {
	this.nimetus = nimi;
	this.lihaTüüp = liha;
	this.saiaTüüp = sai;
	this.hind = hind;
	
	this.lisanditeArv = 0;
	
	valitudLisandid = new ArrayList<String>();
    }
    
    public void lisaLisandid(String lisand1, double hind1, String lisand2, double hind2, String lisand3, double hind3, String lisand4, double hind4 ) {
	this.lisand1 = lisand1;
	this.hind1 = hind1;
	
	this.lisand2 = lisand2;
	this.hind2 = hind2;
	
	this.lisand3 = lisand3;
	this.hind3 = hind3;
	
	this.lisand4 = lisand4;
	this.hind4 = hind4;
    }
    
    public String burgeriNimetus() {
	return this.nimetus;
    }
    
    public String burgeriLiha() {
	return this.lihaTüüp;
    }
    
    public String burgeriSai() {
	return this.saiaTüüp;
    }
    
    public double burgeriHind() {
	return this.hind;
    }
    
    public String lisand1Nimetus() {
    	return this.lisand1;
    }
    public String lisand2Nimetus() {
    	return this.lisand2;
    }
    
    public String lisand3Nimetus() {
    	return this.lisand3;
    }
    
    public String lisand4Nimetus() {
    	return this.lisand4;
    }
    
    public double hind1 () {
	return this.hind1;
    }
    
    public double hind2 () {
	return this.hind2;
    }
    
    public double hind3 () {
	return this.hind3;
    }
    
    public double hind4 () {
	return this.hind4;
    }
    
    public void kuvaLisandid() {
	System.out.println("Saate valida järgnevate lisandite vahel: " + this.lisand1 + ", " + this.lisand2 + ", " + this.lisand3 + ", " + this.lisand4 + "\n");
    }
    
    public int lisanditeArv() {
	return this.lisanditeArv;
    }
    
    public void valiLisand(String lisand) {
	this.lisanditeArv ++;
	valitudLisandid.add(lisand);
    }
    
    public ArrayList<String> valitudLisandid() {
	return this.valitudLisandid;
    }
    
    public void lisaHinnale(double amount) {
	this.hind += amount;
    }
    
    public double koostaBurger() {
    	return this.hind;
    }
}
