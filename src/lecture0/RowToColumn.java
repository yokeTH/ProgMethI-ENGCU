package lecture0;

public class RowToColumn {
    public static int[][] rowToColumn(int[][]a){
        int[][] ans = new int[a[0].length][a.length];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                ans[j][i] = a[i][j];
            }
        }
        return ans;
    }
}
