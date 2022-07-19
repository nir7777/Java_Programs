// sum of first 1000 natural numbers

public class C_for_loop {
    public static void main(String[] args)
    {
        int sum=0;
        int n=1000;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
