package com.githmi.android.android_testing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    // Calculator
    Calculator calculator = new Calculator();

    // ADDITION
    @Test
    public void test_fun_add() {
        assertEquals(8, calculator.fun_add(5, 3), 0.001);
        assertEquals(2, calculator.fun_add(5, -3), 0.001);
        assertEquals(-2, calculator.fun_add(-5, 3), 0.001);
        assertEquals(-8, calculator.fun_add(-5, -3), 0.001);
    }

    @Test
    public void test_fun_sub() {
        assertEquals(4, calculator.fun_sub(8, 4), 0.001);
        assertEquals(12, calculator.fun_sub(8, -4), 0.001);
        assertEquals(-4, calculator.fun_sub(-8, 4), 0.001);
        assertEquals(-12, calculator.fun_sub(-8, -4), 0.001);
    }

    @Test
    public void test_fun_mul() {
        assertEquals(12, calculator.fun_mul(4, 3), 0.001);
        assertEquals(-12, calculator.fun_mul(4, -3), 0.001);
        assertEquals(-12, calculator.fun_mul(-4, 3), 0.001);
        assertEquals(12, calculator.fun_mul(-4, -3), 0.001);
    }

    @Test
    public void test_fun_div() {
        assertEquals(10, calculator.fun_div(110, 11), 0.001);
        assertEquals(-10, calculator.fun_div(110, -11), 0.001);
        assertEquals(-10, calculator.fun_div(-110, 11), 0.001);
        assertEquals(10, calculator.fun_div(-110, -11), 0.001);
    }


    // Student
    Student student1 = new Student();
    Student student2 = new Student();

    @Test
    public void test_stu_details() {
        String stu1 = null;
        String stu2 = student1.stu_details(14, "John", 24);
        String stu3 = student2.stu_details(14, "John", 24);
        String stu4 = student2.stu_details(200, "Selena", 26);
        String stu5 = student1.stu_details(200, "Selena", 26);

        assertNull(stu1);
        assertNotNull(stu2);

        assertSame(stu3, stu3);
        assertNotSame(stu2, stu3);
        assertNotSame(stu3, stu4);

        assertEquals(stu4, stu5);
    }
}