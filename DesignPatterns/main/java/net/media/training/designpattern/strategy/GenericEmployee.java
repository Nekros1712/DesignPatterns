package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:27:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericEmployee extends CompanyMember {
    public void setSalary(int salary) {
        super.setSalary(salary);
        atMostValidator.validate(new int[] {salary, 1000});
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
        notEmptyValidator.validate(name);
        this.mgrName = name;
    }

    public void setMonthsSpent(int months) {
        atLeastValidator.validate(new int[] {months, 0});
    }
}
