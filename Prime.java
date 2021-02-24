public class Prime{
    public static boolean primeNo(int n)
    {
        if(n <=1)
            return false;
        for(int i = 2;i<n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n =2;
        boolean ans = primeNo(n);
        System.out.println(ans);
    }
}