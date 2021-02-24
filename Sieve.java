public class Sieve{
    public static boolean isPrime(int n)
    {
        if(n <= 1){
            return false;
        }
        for(int i = 2;i*i <= n;i++){
            if(n%i == 0)
                return false;
        }

        return true;
    }
    public static void sieveOfErasothenes(int n)
    {
        boolean[] num = new boolean[n+1];
        for(int i = 0;i<=n;i++){
            num[i] = true;
        }
        num[0] = false;
        num[1] = false;

        for(int i = 2;i<n/2;i++){
            if(isPrime(i))
            {
                for(int j = 2*i;j<=n;j+=i)
                    num[j] = false;
            }
        }

        for(int i = 0;i<=n;i++){
            if(num[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        sieveOfErasothenes(1);
    }
}