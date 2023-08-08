package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:31:37 PM
 * To change this template use File | Settings | File Templates.
 */

/*
 * Company Member- Main functions
 * Employee extends Generic. Methods- setSalary, setMonthsSpent, setMaxLeaves
 * Generic extends CompanyMember. Methods- Salary, MonthsSpent, ManagerName
 * Manager extends CompanyMember. Methods- Salary, MonthsSpent, ManagementBand
 * Senior extends Generic. Methods- Salary, MonthsSpent, MaxBonus
 */

public class Employee extends GenericEmployee {
    private int maxAllowedLeaves;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        this.monthsSpent = months;
    }

    public void setMaxAllowedLeaves(int leaves) {
        atLeastValidator.validate(new int[]{leaves, 1});
        this.maxAllowedLeaves = leaves;
    }
}

