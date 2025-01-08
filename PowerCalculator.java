import java.util.*;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        int result = (int) Math.pow(base, exponent);
        System.out.println(result);
        
    }
}