// у файлі src/Arrays.java

public class Arrays {
    // Метод для знаходження другого за величиною числа в матриці
    public static int findSecondLargest(int[][] matrix) {
        // Перетворюємо матрицю на одновимірний масив
        int[] nums = java.util.Arrays.stream(matrix).flatMapToInt(java.util.Arrays::stream).distinct().toArray();
        
        // Сортуємо масив у спадаючому порядку
        java.util.Arrays.sort(nums);
        
        // Перевіряємо, чи є в матриці хоча б два унікальних числа
        if (nums.length < 2) {
            throw new IllegalArgumentException("Матриця має недостатньо унікальних чисел");
        }
        
        // Знаходимо друге за величиною число
        return nums[nums.length - 2];
    }
}
