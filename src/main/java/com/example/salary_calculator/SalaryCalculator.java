package com.example.salary_calculator;

public class SalaryCalculator {
	public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20; // 20% HRA
    }

    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.10; // 10% DA
    }

    public static double calculateGrossSalary(double basicSalary) {
        return basicSalary + calculateHRA(basicSalary) + calculateDA(basicSalary);
    }

    public static double calculateBonus(double basicSalary, int rating) {
        if (rating == 5) return basicSalary * 0.25; // 25% bonus
        if (rating == 4) return basicSalary * 0.15; // 15% bonus
        if (rating == 3) return basicSalary * 0.05; // 5% bonus
        return 0.0;
    }

    public static boolean isEligibleForPromotion(int rating, int yearsOfExperience) {
        return rating >= 4 && yearsOfExperience >= 2;
    }

    public static void main(String[] args) {
        double basicSalary = 50000.0;
        int rating = 4;
        int experience = 3;

        double grossSalary = calculateGrossSalary(basicSalary);
        double bonus = calculateBonus(basicSalary, rating);
        boolean promotion = isEligibleForPromotion(rating, experience);

        System.out.println("Basic Salary : $" + basicSalary);
        System.out.println("Gross Salary : $" + grossSalary);
        System.out.println("Bonus Amount : $" + bonus);
        System.out.println("Promotion    : " + (promotion ? "ELIGIBLE" : "NOT ELIGIBLE"));
    }
}

