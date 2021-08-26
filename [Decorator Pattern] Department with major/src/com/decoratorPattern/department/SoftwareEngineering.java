package com.decoratorPattern.department;

public class SoftwareEngineering implements Department {
    @Override
    public String getDepartment() {
        return "Software Engineering";
    }

    @Override
    public double getTotalCost() {
        return 675000;
    }
}
