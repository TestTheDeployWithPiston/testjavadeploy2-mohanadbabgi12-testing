public class CalculatorTest {

    public void testAdd() {
        int result = Calculator.add(2, 3);
        if (result != 5)
            throw new RuntimeException("Expected 5 but got " + result);
    }

    public void testSubtract() {
        int result = Calculator.subtract(10, 4);
        if (result != 6)
            throw new RuntimeException("Expected 6 but got " + result);
    }
}