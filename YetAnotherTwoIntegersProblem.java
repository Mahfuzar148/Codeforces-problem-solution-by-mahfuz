import java.math.BigInteger;
import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        BigInteger A,B,S;
        int t;
        Scanner in = new Scanner(System.in);
        t=in.nextInt();
        while(t>0)
        {
            t--;
            int a,b;
            a=in.nextInt();
            A=BigInteger.valueOf(a);
            b=in.nextInt();
            B=BigInteger.valueOf(b);
            if(A.compareTo(B)>0)
            {
                S=A.subtract(B);
            }
            else
            {
                S=B.subtract(A);
            }
            BigInteger r=S.remainder(BigInteger.valueOf(10));
            BigInteger c = BigInteger.valueOf(0);
            if(r.compareTo(c)==0)
            {
                System.out.println(S.divide(BigInteger.valueOf(10)));
            }
            else
            {

                System.out.println(S.divide(BigInteger.valueOf(10)).add(BigInteger.valueOf(1)));

            }
        }
    }
}
