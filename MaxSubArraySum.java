public class MaxSubArraySum{
    public static int greedySum(int[] arr)
    {
        int n = arr.length;
        int maxSum = arr[0];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum+= arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0)
                sum = 0;
        }

        return maxSum;
    }

    public static int maxPartialSum(int[] arr)
    {
        int[] S = new int[arr.length];
        S[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            S[i] = S[i-1] + arr[i];
        }

        int ans = 0;
        int minSum = 0;
        for(int i = 0;i<arr.length;i++){
            if(S[i] - minSum > ans)
            {
                ans = S[i] - minSum;
            }

            if(S[i] < minSum){
                minSum = S[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,-6,3,4,-2,3,-3};
        int max = greedySum(arr);
        int max2 = maxPartialSum(arr);
        System.out.print(max2);   
    }
}