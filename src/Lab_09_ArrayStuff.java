import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner pipe = new Scanner(System.in);

        // TASK 1
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];

        // TASK 2
        for (int c = 0; c < dataPoints.length; c++) {
            dataPoints[c] = rnd.nextInt(100) + 1;
        }

        // TASK 3
        for (int dataPoint : dataPoints) {
            System.out.printf("%3d | ", dataPoint);
        }
        System.out.println();

        // TASK 4
        int sum = 0;
        for (int dataPoint : dataPoints) {
            sum = sum + dataPoint;
        }
        int average = sum / dataPoints.length;
        System.out.println("The sum of the data set is " + sum + ".");
        System.out.println("The approximate average of the data set is " + average + ".");

        // TASK 5
        int userInt = SafeInput.getRangedInt(pipe, "Enter value to search for [1-100]", 1, 100);

        // TASK 6
        pipe.nextLine();
        int numTimesFound = 0;
        for (int dataPoint : dataPoints) {
            if (dataPoint == userInt) {
                numTimesFound = numTimesFound + 1;
            }
        }
        if(numTimesFound == 1) {
            System.out.println("Your value, " + userInt + ", was found " + numTimesFound + " time.");
        }
        else if(numTimesFound == 0) {
            System.out.println("Your value " + userInt + ", was not found in the data set.");
        }
        else {
            System.out.println("Your value, " + userInt + ", was found " + numTimesFound + " times.");
        }

        // TASK 7
        userInt = SafeInput.getRangedInt(pipe, "Enter value to search for [1-100]", 1, 100);

        // TASK 6
        boolean foundTarget = false;
        pipe.nextLine();
        for(int c = 0; c < dataPoints.length; c++) {
            if(dataPoints[c] == userInt) {
                foundTarget = true;
                System.out.println("Your value, " + userInt + ", is first found at index " + c + ".");
                break;
            }
        }
        if(!foundTarget) {
            System.out.println("Your value, " + userInt + ", cannot be found in the data set.");
        }

        // TASK 8
        int minimum = dataPoints[0];
        int maximum = dataPoints[0];
        for (int dataPoint : dataPoints) {
            if (minimum > dataPoint) {
                minimum = dataPoint;
            }
            if (maximum < dataPoint) {
                maximum = dataPoint;
            }
        }
        System.out.println("The minimum value is " + minimum + ".");
        System.out.println("The maximum value is " + maximum + ".");

        // TASK 9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    // TASK 9 METHOD
    public static double getAverage(int values[]) {
        Random rnd = new Random();
        Scanner pipe = new Scanner(System.in);

        double [] dataPoints;
        dataPoints = new double[10];
        for (int c = 0; c < dataPoints.length; c++) {
            dataPoints[c] = rnd.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(dataPoints));

        double sum = 0.0;
        for (double dataPoint : dataPoints) {
            sum = sum + dataPoint;
        }
        double average = sum / dataPoints.length;
        return average;
    }
}
