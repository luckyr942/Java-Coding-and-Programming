class Calculator {
    public int add(int a, int b) {
        int r = a + b;
        return r;
    }
}

public class class1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int num = cal.add(4, 5);
        System.out.println(num);
    }
}