package edu.funtec.vendedor;

/**
 * The class "SalesPerson" represents a salesperson.
 */
public class SalesPerson {
    private String sellerName;          // Name of the salesperson
    private String product;             // Product being sold
    private double productValue;        // Value of the product
    private int quantitySold;           // Quantity sold
    private double salary;              // Salary
    private double totalQuantitySold;   // Total quantity sold

    /**
     * Constructor for the "SalesPerson" class.
     *
     * @param sellerName      Name of the salesperson
     * @param product         Product being sold
     * @param productValue    Value of the product
     * @param quantitySold    Quantity sold
     * @param salary          Salary
     */
    public SalesPerson(String sellerName, String product, double productValue, int quantitySold, double salary) {
        this.sellerName = sellerName;
        this.product = product;
        this.productValue = productValue;
        this.quantitySold = quantitySold;
        this.salary = salary;
    }

    /**
     * Returns a string representation of the "SalesPerson" object.
     *
     * @return String representation of the "SalesPerson" object
     */
    @Override
    public String toString() {
        return "SalesPerson [Seller Name = " + sellerName + ", Total Quantity Sold = " + totalQuantitySold + ", Salary + Commission = U$ " + this.salary + "]";
    }

    /**
     * Returns the salesperson's name.
     *
     * @return Salesperson's name
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Sets the salesperson's name.
     *
     * @param sellerName New salesperson's name
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * Returns the product being sold.
     *
     * @return Product being sold
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the product being sold.
     *
     * @param product New product being sold
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Returns the value of the product.
     *
     * @return Value of the product
     */
    public double getProductValue() {
        return productValue;
    }

    /**
     * Sets the value of the product.
     *
     * @param productValue New value of the product
     */
    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    /**
     * Returns the quantity sold.
     *
     * @return Quantity sold
     */
    public int getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the quantity sold.
     *
     * @param quantitySold New quantity sold
     */
    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    /**
     * Returns the salary.
     *
     * @return Salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary.
     *
     * @param salary New salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Sets the total quantity sold.
     *
     * @param totalQuantitySold New total quantity sold
     */
    public void setTotalQuantitySold(double totalQuantitySold) {
        this.totalQuantitySold = totalQuantitySold;
    }

    /**
     * Returns the total quantity sold.
     *
     * @return Total quantity sold
     */
    public double getTotalQuantitySold() {
        return totalQuantitySold;
    }

    /**
     * Calculates the total quantity sold.
     */
    public void calculateTotalSales() {
        this.setTotalQuantitySold(this.getProductValue() * this.getQuantitySold());
        System.out.println("The total quantity sold is: " + this.totalQuantitySold);
    }

    /**
     * Calculates the total salary.
     */
    public void calculateTotalSalary() {
        this.salary += (this.totalQuantitySold * 0.15);
    }

    /**
     * Displays the results.
     */
    public void displayResults() {
        System.out.println(toString());
    }
}
