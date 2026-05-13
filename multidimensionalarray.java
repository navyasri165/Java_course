public class multidimensionalarray {
    public static void main(String[] args) {
        int[][] num = new int[3][4];  // Correct 2D array declaration

        // Fill the array with random numbers between 0–9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int)(Math.random() * 10);
            }
        }

        // Print the array in matrix form
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();  // Move to next row
        }
    }
}