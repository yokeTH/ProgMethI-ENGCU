package lecture0;

public class partialArray {
    public static int[] partialArray(int[] a, int i, int j){
        if(a == null || i >= j || i > a.length-1 || j > a.length) return null;
        int[] ans = new int[a.length - j + i];
        int index = 0;
        for(; index < i; index++){
            ans[index] = a[index];
        }
        for(; index < ans.length; index++){
            ans[index] = a[index + j - 1];
        }
        return ans;
    }
}
