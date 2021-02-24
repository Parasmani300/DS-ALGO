public class LongestConsquiteveArray{
    int min(int a,int b)
    {
        return a<b?a:b;
    }

    int max(int a,int b)
    {
        return a>b?a:b;
    }

    int maxArray(int[] arr)
    {
        max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max)
                max  = arr[i];
        }
        return max;
    }

    public static int longestConsArray(int[] arr)
    {

    }
    public static void main(String[] args)
    {

    }
}