public class ClimbingStairs_70{
    public int climbStairs(int n){
        int[] dp = {1, 1};
        for(int i = 2; i <= n; i++)
            dp[i % 2] = dp[0] + dp[1];
        return dp[n % 2];
    }

    public static void main(String args[]){
        System.out.println(new ClimbingStairs_70().climbStairs(6));
    }
}
