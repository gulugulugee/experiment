public class Seller extends Employee{
    private double sales;
    private double salesCommission;


    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }


    public Seller(String name, double baseWages, double sales, double salesCommission) {
        super(name, baseWages);
        this.sales = sales;
        this.salesCommission = salesCommission;
    }

    public Seller(double sales, double salesCommission) {
        this.sales = sales;
        this.salesCommission = salesCommission;
    }

    public double calculateSalary(){
        return this.getBaseWages() + this.sales * this.salesCommission;
    }

    public void updateName(String name){
        setName(name);
    }

}
