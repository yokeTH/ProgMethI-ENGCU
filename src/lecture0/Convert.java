package lecture0;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.File;

public class Convert {
    public static String[] convert(String[] s) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("src/lecture0/mapping.txt"));
        Map<String, String> data = new HashMap<String, String>();
        String[] ans = new String[s.length];

        while(fileScanner.hasNext()){
            Scanner line = new Scanner(fileScanner.nextLine());
            line.useDelimiter(",");
            String data1 = line.next().trim();
            String data2 = line.next().trim();
            data.put(data2, data1);
            data.put(data1, data2);
        }
//        System.out.println(data);
        for(int i = 0; i<s.length; i++){
            if(data.containsKey(s[i])){
                ans[i] = data.get(s[i]);
            }
            else{
                ans[i] = "No match";
            }
        }
        return  ans;
    }
}
