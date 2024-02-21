public class prac5b {

    public static void main(String[] args) {
        int number = 5; 
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
	System.out.println("Oorvi Bala");
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
