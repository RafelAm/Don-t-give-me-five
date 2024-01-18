
          
public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
        int start = 1;
        int end = 1000;
        int num1 = 0;
    
        for (int i = start; i <= end; i++) {
            String num= i+"";
            if (!num.contains("5")) {
                num1 ++;
            }
        }
    
    return num1;
  }
}
