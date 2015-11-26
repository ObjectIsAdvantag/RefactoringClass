package extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class Print {

	private Vector<Order> _orders = new Vector<Order>();
	private String _name = "Refactoring Classe";
	
	public static void main(String[] args) {
		new Print().printOwning(100.0);
	}
	
	public void printOwning(double previousAmount) {

		Enumeration<Order> e = _orders.elements();
		double outstanding = previousAmount * 1.2;
		
		// print Banner
		System.out.println("**************************");
		System.out.println("********* Banner *********");
		System.out.println("**************************");
		
		// calculate outstanding
		while (e.hasMoreElements()) {
			Order each = e.nextElement();
			outstanding += each.getAmount();
		}
		
		// print details
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}
	
	public class Order {
		public Order(double _amount) {
			super();
			this._amount = _amount;
		}

		private double _amount = 0.0;

		public double getAmount() {
			return _amount;
		}
	}
}
