import java.math.BigDecimal;
import java.util.Scanner;
public class LAB01_BigDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String[] numbers = scanner.nextLine().split("\\s+");
            BigDecimal sum = BigDecimal.ZERO;

            for (String number : numbers) 
            {
                BigDecimal decimalNumber = new BigDecimal(number);
                BigDecimal fractionalPart = decimalNumber.remainder(BigDecimal.ONE);
                sum = sum.add(fractionalPart);
            }

            if (sum.compareTo(BigDecimal.ZERO) == 0) 
            {
                System.out.println("0");
            }
            else 
            {
                System.out.println(sum);
            }
        }
        scanner.close();
    }
}
