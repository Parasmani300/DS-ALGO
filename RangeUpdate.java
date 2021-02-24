public class RangeUpdate{
    public static void update(int[] B,int x,int y,int val)
    {
        try {
            B[x] += val;
            B[y+1] -=val;   
        } catch (Exception e) {
            //TODO: handle exception
            // Do Nothing
        }
    }

    public static void finalArray(int[] A,int[] B,int[] S)
    {
        S[0] = B[0];
        for(int i = 1;i<A.length;i++)
        {
            S[i] = S[i-1] + B[i];
            A[i] += S[i];
        }
    }
    public static void main(String[] args) {
        int[] A = {1,2,-3,6,11,5,-4,3,-4,2};

        int[] B = new int[A.length];
        int[] S = new int[A.length];

        update(B,2,6,4);
        update(B,3,7,5);
        update(B,4,8,1);

        finalArray(A,B,S);

        for(int i : A){
            System.out.print(i+" ");
        }
    }
}