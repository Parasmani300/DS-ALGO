public class FastExpo{
    public static int fastExpo(int a,long n,int MOD)
    {
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            return fastExpo(a*a,n/2,MOD);
        }
        return a*fastExpo(a,n-1,MOD);
    }

    public static int fastExpoIterative(int a,long n,int MOD)
    {
        int ans = 1;
        while(n != 0)
        {
            if(n%2 == 0)
            {
                a = (a*a)%MOD;
                n = n/2;
            }else{
                ans = (a*ans)%MOD;
                n = n-1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println(fastExpoIterative(2,10,100003));
    }
}