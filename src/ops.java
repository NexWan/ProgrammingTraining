import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String[] n = br.readLine().trim().split("\\s+");
        for(int i = 0 ; i < x ; i++){
            String op = br.readLine();
            for(int j = 0 ; j < op.length() ; j++){
                System.out.println(op.charAt(j));
            }
        }
    }
}