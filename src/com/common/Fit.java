package com.common;

public class Fit {
    public static double manWeight(double height) {
        double weight = (height - 100) * 1.15D;
        return weight;
    }

    public static double womanWeight(double height) {
        double weight = (height - 110) * 1.15D;
        return weight;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(170);
        System.out.println("Suitable weight for men height 170 - " + man);
        System.out.println("Suitable weight for women height 170 - " + woman);
    }
}
