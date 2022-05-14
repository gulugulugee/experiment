public class SalaryService {
    public double getTotalSalaries(int managerNum,double managerWages,int sellerNum,double sellerWages){
        return managerNum *managerWages + sellerNum *sellerWages;
    }
}
