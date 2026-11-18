class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> lis = new ArrayList<>();
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                lis.add(matrix[row][col]);
            }
        }
        Collections.sort(lis);
        return lis.get(k-1);
    }
}