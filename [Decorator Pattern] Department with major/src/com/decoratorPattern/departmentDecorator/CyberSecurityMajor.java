package com.decoratorPattern.departmentDecorator;

import com.decoratorPattern.department.Department;

public class CyberSecurityMajor extends MajorDecorator {
    public CyberSecurityMajor(Department department) {
        super(department);
        System.out.println("Enrolled Cyber Security Major.");
    }

    public String getDepartment(){
        return department.getDepartment()+" with Cyber Security Major";
    }

    public double getTotalCost(){
        return department.getTotalCost()+65000;
    }
}
