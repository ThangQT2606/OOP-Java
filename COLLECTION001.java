import java.util.HashMap;

class Warehourse
{
    private HashMap<String, Integer> wareh;
    public Warehourse()
    {
        wareh = new HashMap<>();
    }
    public void addProduct(String product, int stock)
    {
        wareh.put(product, stock);
    }

    public void stock(String product)
    {
        if(!wareh.isEmpty())
        {
            for(String x : wareh.keySet())
            {
                if(x.equals(product))
                {
                    System.out.println(product + ": " + wareh.get(product));
                    wareh.remove(product);
                }
            }
        }
        else
        {
            System.out.println(product + ": " + "-99");
        }
    }
}

public class COLLECTION001 {
    public static void main(String[] args) {
        Warehourse w = new Warehourse();
        w.addProduct("milk", 10);
        w.addProduct("coffee", 7);
        System.out.println("prices:");
        w.stock("milk");
        w.stock("coffee");
        w.stock("sugar");
    }
}