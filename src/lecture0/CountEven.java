package lecture0;

public class CountEven {
    public static int countEven(int[]a){
        int cnt = 0;
        for(int e: a){
            if (e%2 == 0) cnt++;
        }
        return cnt;
    }
}
