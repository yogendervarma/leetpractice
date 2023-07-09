class Solution {

    /**
     * Function to find the smallest positive number missing from the array.
     *
     * @param arr The array of numbers
     * @param size The size of the array
     * @return The smallest positive number missing from the array
     */
    public static int missingNumber(int[] arr, int size) {

        // Initialize count of positives as 0
        int countOfPositives = 0;

        // Create a hashmap to store the positive numbers in the array
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < size; i++) {

            // If the number is greater than 0
            if (arr[i] > 0) {

                // Increment the count of positives
                countOfPositives++;

                // Add the number to the hashmap
                hm.put(arr[i], 1);
            }
        }

        // Iterate from 1 to the count of positives
        for (int i = 1; i <= countOfPositives; i++) {

            // Check if the number is in the hashmap
            if (!hm.containsKey(i)) {

                // Return the number
                return i;
            }
        }

        // If the code reaches the end of the loop without returning a number
        return countOfPositives + 1;
    }
}
