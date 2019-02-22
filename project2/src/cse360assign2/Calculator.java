package cse360assign2;

public class Calculator {
private int total;
StringBuffer h ;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		h = new StringBuffer("0"); // initial the string with 0
	}
	
	public int getTotal () {
		
		return total; // return the present value
	}
	
	public void add (int value) {
		total = total + value;  // do add function
		
		h.append(" + " +value); // put "+" sign with the value in the string
		
	}
	
	public void subtract (int value) {
		total = total - value;			// do sudtract function
		h.append(" - " +value); //put "-" sign with the value in the string
	}
	
	public void multiply (int value) {
		
		total = total * value;       // do multiple function
		h.append(" * " +value); 	//put "*" sign with the value in the string
		
	}
	
	public void divide (int value) {
		
		if(value == 0)          // do divide function if input value is zero, the result (toltal) is equalied zero
			total = 0;
		else
			total = total / value;
		
		h.append(" / " +value); 	//put "/" sign with the value in the string
	}
	
	public String getHistory () {
		System.out.println(h.toString()); // print the string the sign of calculator and value out
		
		return " ";
	}
}
