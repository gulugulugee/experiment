public class Employee implements Workable{
    private String name;
    private double baseWages;

    public Employee(String name, double baseWages) {
        this.name = name;
        this.baseWages = baseWages;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseWages() {
        return baseWages;
    }

    public void setBaseWages(double baseWages) {
        this.baseWages = baseWages;
    }
    public void showName(){
        System.out.println(getName());
    }

}
