import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String name;
        Scanner in = new Scanner(System.in);

        Manager m =new Manager("经理A",5000,2);
        System.out.println("经理名字:"+ m.getName()+"  经理工资:"+m.calculateSalary());


        Seller s =new Seller("销售人员A",3000,20000,0.15);
        System.out.println("销售员名字："+s.getName()+"  销售员工资："+s.calculateSalary());

        SalaryService ss = new SalaryService();
        System.out.println("总工资： "+ss.getTotalSalaries(1,m.calculateSalary(),1,s.calculateSalary()));

        int flag = 0;
        System.out.println("输入1更改经理名字，输入2更改销售员名字");
        flag = in.nextInt();
        switch (flag){
            case 1:{
                System.out.println("请输入新经理名");
                name = in.next();
                m.updateName(name);
                System.out.println("修改后的名字");
                m.showName();
                break;
            }
            case 2:{
                System.out.println("请输入新销售员名");
                name = in.next();
                s.updateName(name);
                System.out.println("修改后的名字");
                s.showName();
                break;
            }
        }


    }
}
