package easy;
/*
Problem: 997 - Find the Town Judge

Approach:
- Use score array to track trust
- Decrease for outgoing trust
- Increase for incoming trust
- Judge will have score = n - 1

Time Complexity: O(n + m)
Space Complexity: O(n)
*/

public class FindTownJudge997 {

    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        int[] score = new int[n+1];
        for(int[] t : trust){
            score[t[0]]--;
            score[t[1]]++;
        }
        for(int i=1; i<=n; i++){
            if(score[i] == n-1){
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] trust = {{1,3}, {2,3}};
        FindTownJudge997 obj = new FindTownJudge997();
        int result = obj.findJudge(n, trust);
        System.out.println("Judge: " + result);
    }
}
