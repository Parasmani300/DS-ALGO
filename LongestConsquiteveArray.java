public class LongestConsquiteveArray{
    static int min(int a,int b)
    {
        return a<b?a:b;
    }

    static int max(int a,int b)
    {
        return a>b?a:b;
    }

    static int maxArray(int[] arr)
    {
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max)
                max  = arr[i];
        }
        return max;
    }
 
    public static int longestConsArray(int[] arr)
    {
        int m = maxArray(arr);
        boolean[] fr = new boolean[m+1];
        int ans = 0;
        for(int left = 0;left < arr.length;left++)
        {
            for(int i = 0;i<=m;i++){
                fr[i] = false;
            }

            int MAX = arr[left];
            int MIN = arr[left];
            for(int right=left;right<arr.length;right++){
                if(fr[arr[right]] == true){
                    break;
                }

                fr[arr[right]] = true;
                MAX = max(MAX,arr[right]);
                MIN = min(MIN,arr[right]);
                if(right - left == MAX-MIN){
                    ans = max(ans,right - left +1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = {6,1,3,4,5,12,7};
        int ans = longestConsArray(arr);
        System.out.println(ans);
    }
}