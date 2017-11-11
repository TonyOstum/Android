public class oo {
    public static void main(String[] args) {
        int m = 3;
        int n = 1;
        for (n=1;n<=7;n+=2,m-=1) {
            int i1 =1;
            while (i1<=m){
                System.out.print("  ");
                i1++;
            }
            int i2 = 1;
            while (i2 <= n) {
                System.out.print("* ");
                i2++;
            }
            System.out.println();
        }
}}
