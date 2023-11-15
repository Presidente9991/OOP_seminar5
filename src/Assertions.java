public class Assertions {
    public static void assertEquals(double expected, double actual) {
        if (expected == actual) {
            System.out.println("Проверка пройдена!");
        } else {
            System.out.println("Проверка не пройдена! Ожидается: " + expected + ", Фактически: " + actual);
        }
    }
}
