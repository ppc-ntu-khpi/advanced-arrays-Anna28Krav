// у файлі src/TestArrays.java

public class TestArrays {
    public static void main(String[] args) {
        // Оголошуємо матрицю для тестування
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        try {
            // Викликаємо метод findSecondLargest з класу Arrays для знаходження другого за величиною числа в матриці
            int secondLargest = Arrays.findSecondLargest(matrix);
            // Виводимо результат на екран
            System.out.println("Друге за величиною число в матриці: " + secondLargest);
        } catch (IllegalArgumentException e) {
            // Виводимо повідомлення про помилку у випадку, якщо метод findSecondLargest кидає виняток IllegalArgumentException
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
