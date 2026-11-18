class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=0;
        for(String s: sentences)
        {
            maxi=Math.max(maxi, s.split(" ").length);
        }
        return maxi;
    }
}