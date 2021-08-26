package com.decoratorPattern.departmentDecorator;

import com.decoratorPattern.department.Department;

public class RoboticsMajor extends MajorDecorator{
    public RoboticsMajor(Department department) {
        super(department);
        System.out.println("Enrolled Robotics Major.");
    }

    public String getDepartment(){
        return department.getDepartment()+" with Robotics Major";
    }

    public double getTotalCost(){
        return department.getTotalCost()+87000;
    }
}
