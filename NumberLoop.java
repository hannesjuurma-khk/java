package esimeneylesanne;

public class NumberLoop {
    private int height;
    
    public NumberLoop(int height) {
	this.height = height;
    }
    
    public void printNumbers() {
	for (int i = 1; i <= this.height; i++) {
	    printNumbersLine(i);
	}
    }
    
    public void printNumbersLine(int loopCounter) {
	for (int j = this.height - 1; j >= 0; j--) {
	    int rowMaxNumber = this.height - loopCounter;
		
	    if(rowMaxNumber < j) {
		System.out.print(rowMaxNumber);
	    } else {
		System.out.print(j);
	    }
	}  
	System.out.print('\n');
    }
}
