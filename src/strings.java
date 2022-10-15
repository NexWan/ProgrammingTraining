import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            String s = "";
            for(int i = 0 ; i < n ; i++){
                String x = br.readLine();
                System.out.print("\n\"" + x + "\" " + "tiene " + x.length() + " caracteres");
            }
        }catch (Exception e){
            System.out.println("Salida");
        }

    }
}