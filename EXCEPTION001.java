import java.util.Scanner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public int add(Amount other) throws Exception {
        if (!this.currency.equals(other.getCurrency())) {
            throw new Exception("Currency doesn't match");
        }
        return this.amount + other.getAmount();
    }
}

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0)
        {
            String[] data = scanner.nextLine().split(" ");
            Amount amount1 = new Amount(data[0], Integer.parseInt(data[1]));
            Amount amount2 = new Amount(data[2], Integer.parseInt(data[3]));
            try 
            {
                System.out.println(amount1.add(amount2));
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }
}