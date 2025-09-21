import java.net.SocketPermission;
import java.util.Scanner;
public class FactorySalaryCalculator  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter worker type is permanent/contract/Intern: ");
        String workerType= sc.nextLine().trim();

        System.out.print("Enter experience (in years): ");
        int  experience = sc.nextInt();

        System.out.print("Enter the number of projects completed: ");
        int projectsCompleted = sc.nextInt();
        
        System.out.print("Enter performance score (0-100): ");
        int performancescores = sc.nextInt();

        int basesalary =0;
        int bonus = 0;
        int allowance =0;
        
        if (workerType.equalsIgnoreCase("Permanent")){
            if (experience >=10){
                basesalary =100000;
            }else if(experience >= 5){
                    basesalary =70000;
            } else {
                basesalary =50000;
            }
            if (projectsCompleted >5){
                allowance = 5000;
            }
        } else if (workerType .equalsIgnoreCase("Contract")){
            if (experience >= 5){
                basesalary =60000;
            }
            else {
                basesalary =40000;
            }
            if (projectsCompleted> 3){
                allowance =3000;
            }

        } else if (workerType.equalsIgnoreCase("Intern")){
            basesalary =20000;
            allowance=0;
        } else {
            System.err.println("Invalid worker type");
            return;
        }
        
        if (performancescores >= 90){
            bonus = (int)(0.20 *basesalary);
        } else if (performancescores >= 75){
            bonus = (int)(0.10 * basesalary);
        }

        int totalSalary= basesalary+ bonus+ allowance;
        System.out.println("base salary: " + basesalary);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Allowance: "+ allowance);
        System.out.println("Totla salary: "+ totalSalary);
    }
    
}
