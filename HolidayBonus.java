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

/*public class HolidayBonus {

    private static final double HIGHEST_BONUS = 5000.0;
    private static final double LOWEST_BONUS = 1000.0;
    private static final double REGULAR_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];

        for (int i = 0; i < data.length; i++) {
            double temp = 0;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j)) {
                    temp += HIGHEST_BONUS;
                } else if (data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j)) {
                    temp += LOWEST_BONUS;
                } else {
                    temp += REGULAR_BONUS;
                }
            }
            bonuses[i] = temp;
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double[] bonuses = calculateHolidayBonus(data);
        double totalBonus = 0;
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }
        return totalBonus;
    }
}
*/


public class HolidayBonus {

    private static final double HIGHEST_BONUS = 5000.0;
    private static final double LOWEST_BONUS = 1000.0;
    private static final double REGULAR_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];

        for (int i = 0; i < data.length; i++) {
            double temp = 0;
            for (int j = 0; j < data[i].length; j++) {
                double value = data[i][j];
                if (value < 0) continue; // Ignore negative sales values

                if (value == getHighestNonNegativeInColumn(data, j)) {
                    temp += HIGHEST_BONUS;
                } else if (value == getLowestNonNegativeInColumn(data, j)) {
                    temp += LOWEST_BONUS;
                } else {
                    temp += REGULAR_BONUS;
                }
            }
            bonuses[i] = temp;
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double[] bonuses = calculateHolidayBonus(data);
        double totalBonus = 0;
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }
        return totalBonus;
    }

    /**
     * Finds the highest non-negative value in a column.
     */
    private static double getHighestNonNegativeInColumn(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] >= 0 && row[col] > max) {
                max = row[col];
            }
        }
        return max;
    }

    /**
     * Finds the lowest non-negative value in a column.
     */
    private static double getLowestNonNegativeInColumn(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] >= 0 && row[col] < min) {
                min = row[col];
            }
        }
        return min;
    }
}
