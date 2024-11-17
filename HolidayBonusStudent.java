/*
 * Class: CMSC203 
 * Instructor: Professor Kuijt
 * Description: Project calculates Holiday Bonuses using sales information.
 * Due: 11/16/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nahom Wondimu
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusStudent {

    private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
    private double[][] dataSet2 = { { 3, 6, 2, 3 }, { 9, 1, 3 }, { 4, 2 } };

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculateHolidayBonus() {
        double[] result1 = HolidayBonus.calculateHolidayBonus(dataSet1);
        assertEquals(3000.0, result1[0], .001);
        assertEquals(4000.0, result1[1], .001);
        assertEquals(15000.0, result1[2], .001);

        double[] result2 = HolidayBonus.calculateHolidayBonus(dataSet2);
        assertEquals(12000.0, result2[0], .001);
        assertEquals(11000.0, result2[1], .001);
        assertEquals(4000.0, result2[2], .001);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double total1 = HolidayBonus.calculateTotalHolidayBonus(dataSet1);
        assertEquals(22000.0, total1, .001);

        double total2 = HolidayBonus.calculateTotalHolidayBonus(dataSet2);
        assertEquals(27000.0, total2, .001);
    }
}
