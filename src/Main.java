import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String[] x = br.readLine().trim().split("\\s+");
        String a = x[0];
        String b = x[1];
        int cont = 0;
        String s = "";
        int y = 0,z = 0;
        boolean in = false, in2 = true;
        int n = a.length();
        int m = b.length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(a.charAt(j) == b.charAt(i) && !in){
                    y = i;
                    z = j;
                    in = true;
                }
            }
        }
        in = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == y && !in){
                    System.out.print(a);
                    in = true;
                    break;
                } else if(j != z){
                    System.out.print(".");
                }else{
                    System.out.print(b.charAt(i));
                }
            }
            System.out.println();
        }
    }
}