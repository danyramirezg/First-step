package ramirez;

class Main {

    public static void main(String[] args) {
        int result1 = minus(8, 4);
        int result2 = minus(10, 5);

        System.out.println("result2 = " + result2);
        System.out.println("result1 = " + result1);

    }

    static int minus(int num1, int num2) {
        return num1 - num2;
    }
}

