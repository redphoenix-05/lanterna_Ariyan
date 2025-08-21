public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
  
    public int continuousAdd(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
  
    public int cube(int a) {
        return a * a * a;
    }

}
