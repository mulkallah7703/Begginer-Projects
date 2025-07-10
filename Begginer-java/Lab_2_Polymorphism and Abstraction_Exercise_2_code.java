package programmingIIlap;
class StaffMember {
    private String staffName;
    private String phoneNo;

    public StaffMember(String staffName, String phoneNo) {
        this.staffName = staffName;
        this.phoneNo = phoneNo;
    }

    public double salary() {
        return 0.0;
    }
}

class Volunteer extends StaffMember {
    public Volunteer(String staffName, String phoneNo) {
        super(staffName, phoneNo);
    }
}

class Employee extends StaffMember {
    private double salaryRate;

    public Employee(String staffName, String phoneNo, double salaryRate) {
        super(staffName, phoneNo);
        this.salaryRate = salaryRate;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public double salary() {
        return salaryRate;
    }
}

class HourlyEmployee extends Employee {
    private int workHours;

    public HourlyEmployee(String staffName, String phoneNo, double salaryRate) {
        super(staffName, phoneNo, salaryRate);
        workHours = 0;
    }

    public void addHours(int moreHours) {
        workHours += moreHours;
    }

    public double salary() {
        double payment = getSalaryRate() * workHours;
        workHours = 0;
        return payment;
    }
}

class Executive extends Employee {
    private double bonusAmount;

    public Executive(String staffName, String phoneNo, double salaryRate) {
        super(staffName, phoneNo, salaryRate);
        bonusAmount = 0;
    }

    public void awardBonus(double execBonus) {
        bonusAmount = execBonus;
    }

    public double salary() {
        double payment = super.salary() + bonusAmount;
        bonusAmount = 0;
        return payment;
    }
}

public class Staff{
    public static void main(String[] args) {
        StaffMember[] staffArray = new StaffMember[4];

        staffArray[0] = new Executive("Ghazi", "860-1490", 1923.07);
        staffArray[1] = new Employee("Turki", "0555-0101", 846.15);
        staffArray[2] = new HourlyEmployee("Thamer", "0555-0690", 8.55);
        staffArray[3] = new Volunteer("Sami", "849-8374");

        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i] instanceof Executive) {
                Executive e = (Executive) staffArray[i];
                e.awardBonus(5000.00);
            } else if (staffArray[i] instanceof HourlyEmployee) {
                HourlyEmployee h = (HourlyEmployee) staffArray[i];
                h.addHours(40);
            }
        }

        System.out.println("The total amount to pay is " + getTotalCost(staffArray));
        
    }

    public static double getTotalCost(StaffMember[] staffList) {
        double totalAmount = 0.0;

        for (int count = 0; count < staffList.length; count++)
            totalAmount += staffList[count].salary();

        return totalAmount;
        
        }
}