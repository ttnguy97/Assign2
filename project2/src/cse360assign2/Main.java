package cse360assign2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		cal.add(4);
		cal.subtract(2);
		cal.multiply(2);
		cal.add(5);
		cal.divide(0);
		
		System.out.println(" Total = " + cal.getTotal());
		
		cal.getHistory();
		
	}

}
