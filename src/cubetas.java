import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cubetas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int z = 0;
        int y = 1;
        String[] arr = br.readLine().trim().split("\\s+");
        for (int i = 1; i <= m ; i++) {
            z = 0;
            for (int j = 0; j < n; j++) {
                if(Integer.parseInt(arr[j]) == i){
                    z++;
                }
            }
            System.out.println(y + ": " + z);
            y++;
        }
    }
}