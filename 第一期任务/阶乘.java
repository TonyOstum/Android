public class ss {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 9) {
            int i=1;
            int sum=1;
            while (i<=n)
            {sum=sum*i;
            i++;}
            System.out.println(sum);
            n++;
        }
    }
}