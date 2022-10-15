import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class ordenar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String[] x = br.readLine().trim().split("\\s+");
        Arrays.sort(x, Collections.reverseOrder());
        int dup = Integer.parseInt(x[0]);
        boolean entro = false;
        while(true){
            entro = false;
            for (int i = 0; i < x.length; i++) {
                if(dup == Integer.parseInt(x[i])){

                }else{
                    dup = Integer.parseInt(x[i]);
                }
            }
        }
    }
}