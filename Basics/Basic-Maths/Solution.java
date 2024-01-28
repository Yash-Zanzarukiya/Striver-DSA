public class Solution {
  public static int countDigits(int n){
      // Write your code here.
      int temp = n,count=0,digit;
      while(temp!=0){
          digit = temp % 10;
          if(digit != 0 && n % digit == 0)
              count++;
          temp/=10;
      }
      return count;
  }
}