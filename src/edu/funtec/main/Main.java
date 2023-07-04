package edu.funtec.main;
import edu.funtec.vendedor.*;

public class Main {

	public static void main(String[] args) {
		SalesPerson sp1 = new SalesPerson("Jair","Erva", 13.50, 300, 800);
		sp1.calculateTotalSales();
		sp1.calculateTotalSalary();
		sp1.displayResults();

	}

}
