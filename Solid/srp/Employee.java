package solid.live.srp;

public class Employee {    
    private int employeeId;
    private String employeeName;
    private double monthlySalary;
    private int yearsInOrg;
    
    private Employee manager;

    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    private int leavesTaken;
    private int totalLeavesAllowed;
    private int[] leavesLeftPreviously;


    public Employee(int employeeId, double monthlySalary, String employeeName, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
        this.employeeName = employeeName;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {}

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getManagerName() {
        return this.manager.getEmployeeName();
    }
    
    public int getLeavesTaken() {
        return this.leavesTaken;
    }

    public int getTotalLeavesAllowed() {
        return this.totalLeavesAllowed;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public int calculateTotalLeavesLeftPreviously() {
        int years = Math.min(this.yearsInOrg, 3);
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++)
            totalLeaveLeftPreviously += this.leavesLeftPreviously[this.yearsInOrg - i - 1];
        return totalLeaveLeftPreviously;
    }
}

class EmployeeFormatter {
    private final Employee employee;

    public EmployeeFormatter(Employee employee) {
        this.employee = employee;
    }

    public String toHtml() {
        String str = "<div>" +
                        "<h1>Employee Info</h1>" +
                        "<div id='emp" + employee.getEmployeeId() + "'>" +
                        "<span>" + employee.getEmployeeName() + "</span>" +
                        "<div class='left'>" +
                        "<span>Leave Left :</span>" +
                        "<span>Annual Salary:</span>" +
                        "<span>manager:</span>" +
                        "<span>Reimbursable Leave:</span>" +
                    "</div>";
        
        str += "<div class='right'><span>" + (employee.getTotalLeavesAllowed() - employee.getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        
        if (employee.getManagerName() != null)
            str += "<span>" + employee.getManagerName() + "</span>";
        else
            str += "<span>None</span>";
        
        str += "<span>" + employee.calculateTotalLeavesLeftPreviously() + "</span>";
        
        return str + "</div> </div>";
    }
}