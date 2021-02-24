import java.util.*;


public class PartialSum{
    public static void partialsum(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[arr.length];
        S[0] = arr[0];

        for(int i = 1;i<arr.length;i++)
            S[i] = S[i-1] + arr[i];

        int x  = sc.nextInt();
        int y = sc.nextInt();

        if(x != 0){
            System.out.println(S[y]-S[x-1]);
        }else{
            System.out.println(S[y]); 
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,-3,6,11,5,-4,3,-4,2};
        partialsum(arr);
    }
}