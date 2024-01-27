import java.util.*;

public class Patterns {

    public static void pattern0(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n + i; j++) {
                if (j > n - i && j < n + i)
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - i; j++) {
                if (j >= i && j <= 2 * n - i)
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i <= n / 2) {
                    if (j > (n / 2) - i && j < (n / 2) + i)
                        System.out.print("*" + " ");
                    else
                        System.out.print("  ");
                } else {
                    if ((j + n / 2) >= i && j <= n - (i - n / 2))
                        System.out.print("*" + " ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for(int i=0; i<n;i++){
            for(int j=0; j<=i ;j++){
                System.out.print("* ");
            }
                System.out.print("\n");
        }
    }

    public static void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1;j++){
                if(j>n-i && j<n+i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1;j++){
                if(j>=i && j<=2*n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern10(int n) {
        int star=1;
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=star;j++){
                System.out.print('*');
            }
            if(i < n)
                star++;
            else
                star--;
            System.out.print('\n');
        }
    }

    public static void pattern11(int n) {
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i+j+1)%2+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern12(int n) {
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=(n-1)*2;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern13(int n) {
        int num=1;
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+++" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern14(int n) {
        for(int i=1; i<=n ;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern15(int n) {
        for(int i=1; i<=n ;i++){
            for(char ch='A';ch <= 'A'+n-i ;ch++){
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern16(int n) {
        for(int i=1; i<=n ;i++){

            for(int j=1;j<=i;j++){
                System.out.print((char)(int)('A'+i-1)+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern17(int n) {
        for(int i=1; i<=n ;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            char ch='A';
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch+" ");
                if(j<i)ch++;
                else ch--;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern18(int n) {
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)((int)('A'+n-j))+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern19(int n) {
        int star=n,space=0;
        for(int i=1; i<=2*n ;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            if(i<n){
                star--;
                space+=2;
            }
            else if(i>n){
                star++;
                space-=2;
            }
            System.out.print("\n");
        }
    }

    public static void pattern20(int n) {
        int star=1,space=(n-1)*2;
        for(int i=1; i<=2*n ;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            if(i>=n){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.print("\n");
        }
    }

    public static void pattern21(int n) {
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern22(int n) {
        int k = 2 * n - 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                int x = Math.abs(i - n);
                int y = Math.abs(j - n);
                int currCell = (int)Math.max(x, y)+1;
                System.out.print(currCell+" ");
            }
            System.out.println();
        }
    }

    public static void pattern(int n) {
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        pattern(n);
        sc.close();
    }
}