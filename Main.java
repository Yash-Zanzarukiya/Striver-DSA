import java.util.*;
public class Main {

  public static void main(String[] args) {
      // Write your code here
      Scanner sc = new Scanner(System.in);
      char ch = sc.nextLine().charAt(0);

      if(ch<'A' || ch>'z')
          System.out.print("-1");
      else if(ch<='a')
          System.out.print("1");
      else
          System.out.print("0");
  }
}