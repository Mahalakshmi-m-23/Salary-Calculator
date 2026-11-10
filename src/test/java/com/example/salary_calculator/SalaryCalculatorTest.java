package com.example.salary_calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    @Test
    void testGrossSalary() {
        assertEquals(65000.0, SalaryCalculator.calculateGrossSalary(50000.0));
    }

    @Test
    void testBonusRatingFive() {
        assertEquals(12500.0, SalaryCalculator.calculateBonus(50000.0, 5));
    }

    @Test
    void testBonusRatingLow() {
        assertEquals(0.0, SalaryCalculator.calculateBonus(50000.0, 2));
    }

    @Test
    void testPromotionEligible() {
        assertTrue(SalaryCalculator.isEligibleForPromotion(4, 3));
    }

    @Test
    void testPromotionNotEligible() {
        assertFalse(SalaryCalculator.isEligibleForPromotion(3, 1));
    }
}
