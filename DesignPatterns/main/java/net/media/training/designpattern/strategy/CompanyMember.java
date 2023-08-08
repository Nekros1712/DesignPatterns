package net.media.training.designpattern.strategy;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class CompanyMember implements EmployeeInterface {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;
    protected Validator atLeastValidator = new AtLeastValidator();
    protected Validator atMostValidator = new AtMostValidator();
    protected Validator notEmptyValidator = new NotEmptyValidator();
    protected Validator lengthValidator = new LengthValidator();

    public void setName(String name) {
        lengthValidator.validate(new Object[]{name, 50});
        this.name = name;
    }

    public void setSalary(int salary) {
        atLeastValidator.validate(new int[]{salary, 1});
    }

    public void setManagerName(String name) {
        lengthValidator.validate(new Object[]{name, 50});
    }
}
