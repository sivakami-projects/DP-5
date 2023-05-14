/*
Time Complexity - O(n ^ 3)
Space Complexity - O(n)
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        if(s == null || s.length() == 0)
            return false;

        Set<String> dict = new HashSet<String>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i = 1; i <= s.length(); i++)
            for(int j = 0; j < i; j++)
                if(dp[j] && dict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }

        return dp[s.length()];
    }
}
