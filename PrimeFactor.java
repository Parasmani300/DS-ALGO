public class PrimeFactor{
    public static void primeFactor(int n){
        // int sq = (int) Math.sqrt(n);
        int[] num = new int[n];
        int[] exp = new int[n];

        int d = 2;
        int len = 0;
        while(n > 1 && d*d <= n){
            int k = 0;
            while(n%d == 0){
                n = n/d;
                k++;
            }

            exp[len] = k;
            num[len] = d;
            len++;
            d++;
        }

        if(n > 1)
        {
            len++;
            exp[len] = 1;
            num[len] = n;
        }

        for(int i = 0;i<exp.length;i++){
            if(exp[i] != 0)
                System.out.print(num[i]+"^"+exp[i]+",");
        }
    }

    public static void main(String[] args){
        int n =23;
        primeFactor(n);
    }
}