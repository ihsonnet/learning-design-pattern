package com.decoratorPattern;

import com.decoratorPattern.departmentDecorator.CyberSecurityMajor;
import com.decoratorPattern.department.SoftwareEngineering;
import com.decoratorPattern.departmentDecorator.RoboticsMajor;

public class DIUAdmission {
    public static void main(String[] args) {
        CyberSecurityMajor csMajor = new CyberSecurityMajor(new SoftwareEngineering());

        System.out.println("Department: "+csMajor.getDepartment());
        System.out.println("Total Cost: "+csMajor.getTotalCost()+" TK");

        System.out.println("\n");

        RoboticsMajor roboMajor = new RoboticsMajor(new SoftwareEngineering());

        System.out.println("Department: "+roboMajor.getDepartment());
        System.out.println("Total Cost: "+roboMajor.getTotalCost()+" TK");

        System.out.println("\n"); //double major

        RoboticsMajor doubleMajor = new RoboticsMajor(new CyberSecurityMajor((new SoftwareEngineering())));

        System.out.println("Department: "+doubleMajor.getDepartment());
        System.out.println("Total Cost: "+doubleMajor.getTotalCost()+" TK");
    }
}
