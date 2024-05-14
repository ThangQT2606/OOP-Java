import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LAB01_TwoSum 
{
        public static void twoSum(int[] nums, int target) 
        {
        // Tạo một HashMap để lưu trữ giá trị của mỗi phần tử và chỉ số của nó
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean check = false;
        // Duyệt qua mảng nums
        for (int i = 0; i < nums.length; i++) 
        {
            // Tính toán giá trị cần tìm cho mỗi phần tử nums[i]
            int complement = target - nums[i];
            
            // Nếu giá trị cần tìm đã tồn tại trong map, tức là đã tìm được cặp số
            if (map.containsKey(complement)) 
            {
                // Trả về chỉ số của hai phần tử
                System.out.println(map.get(complement) + " " + i);
                check = true;
            }
            
            // Nếu không, ta lưu chỉ số của phần tử vào map
            map.put(nums[i], i);
        }
        
        // Nếu không có cặp số nào thỏa mãn, trả về mảng rỗng
        if(!check)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            twoSum(a, target);
    
        }    
    }    
}
