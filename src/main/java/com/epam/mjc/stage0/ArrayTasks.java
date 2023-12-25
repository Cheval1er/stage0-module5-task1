package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] arr = {"Winter", "Spring", "Summer","Autumn" };
        return arr;

    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        if (length <= 0) {
            // Handle invalid input (length should be greater than 0)
            return new int[0]; // Return an empty array in case of invalid input
        }

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;

        // Iterate through the array and accumulate the sum
        for (int value : arr) {
            sum += value;
        }

        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i; // Found the number, return its index
            }
        }

        // If the number is not found in the array, return -1
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reversedArray = new String[arr.length];

        // Populate the reversedArray in reverse order
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        return reversedArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        // Count the number of positive numbers to determine the size of the new array
        int countPositive = 0;
        for (int value : arr) {
            if (value > 0) {
                countPositive++;
            }
        }

        // Create a new array to store positive numbers
        int[] positiveNumbers = new int[countPositive];

        // Populate the positiveNumbers array with positive values
        int index = 0;
        for (int value : arr) {
            if (value > 0) {
                positiveNumbers[index] = value;
                index++;
            }
        }

        return positiveNumbers;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    // Swap inner arrays
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort values within each inner array using bubble sort
        for (int[] innerArray : arr) {
            for (int i = 0; i < innerArray.length - 1; i++) {
                for (int j = 0; j < innerArray.length - i - 1; j++) {
                    if (innerArray[j] > innerArray[j + 1]) {
                        // Swap values
                        int temp = innerArray[j];
                        innerArray[j] = innerArray[j + 1];
                        innerArray[j + 1] = temp;
                    }
                }
            }
        }

        return arr;
    }
    }

