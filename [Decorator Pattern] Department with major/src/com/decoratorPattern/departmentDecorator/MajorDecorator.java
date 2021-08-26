package com.decoratorPattern.departmentDecorator;

import com.decoratorPattern.department.Department;

public abstract class MajorDecorator implements Department {
    protected Department department;

    public MajorDecorator(Department department) {
        this.department = department;
    }

    public String getDepartment(){
        return department.getDepartment();
    }

    public double getTotalCost(){
        return department.getTotalCost();
    }
}
