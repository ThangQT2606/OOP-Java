import java.util.Scanner;

class FlightBooking{
    public String flightId="OOP24";
    private static int seatAvailable=180;
    public static void Booking()
    {
        seatAvailable--;
        print_data();
    }
    public static void Confirmed(int id)
    {
        System.out.print("--" + "User " + id + " Confirmed--");
        print_data();
    }
    public static void Cancel()
    {
        seatAvailable++;
        print_data();
    }
    public static void print_data()
    {
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }
    public static void reset()
    {
        seatAvailable = 180;
    }
  }

public class LAB02_FlightBooking 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) 
        {
            FlightBooking.reset();
            String s = sc.nextLine();
            String[] data = s.split(" ");
            int id;
            String status;
            for(int i = 0; i < data.length; i+=2)
            {
                id = Integer.parseInt(data[i]);
                status = data[i+1];
                switch (status) 
                {
                    case "Booking":
                        FlightBooking.Booking();
                        break;
                    case "Confirmed":
                        FlightBooking.Confirmed(id);
                        break;
                    default:
                        FlightBooking.Cancel();
                        break;
                }
            }
            System.out.println();
        }
    }
}
