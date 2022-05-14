public class Manager extends Employee {


    private int level;


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Manager(String name, double baseWages, int level) {
        super(name, baseWages);
        this.level = level;
    }

    public double calculateSalary(){
        return this.getBaseWages() * 1.8;
    }

    public Manager(int level) {
        this.level = level;
    }

    public void updateName(String name){
        setName(name);

    }


}
