/*

A basic approach to this problem would be to convert the input array into a 1D array, and then traverse through it to add values into a new reshaped array.

*/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if((rows*cols)!=(r*c))
            return mat;
        int k=0;
        int[] arr = new int[rows*cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                arr[k++]=mat[i][j];
        }
        k=0;
        int[][] ret = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                ret[i][j]=arr[k++];
        }
        return ret;
    }
}
