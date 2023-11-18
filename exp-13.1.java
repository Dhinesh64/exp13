/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberprocessor;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read numbers
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Display the numbers
        System.out.println("Entered numbers: " + numbers);

        // Calculate average
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

        // Find highest and lowest numbers
        int highest = findHighest(numbers);
        int lowest = findLowest(numbers);
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);

        // Filter out even numbers
        ArrayList<Integer> oddNumbers = filterEvenNumbers(numbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    private static double calculateAverage(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    private static int findHighest(ArrayList<Integer> numbers) {
        return Collections.max(numbers);
    }

    private static int findLowest(ArrayList<Integer> numbers) {
        return Collections.min(numbers);
    }

    private static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
}
