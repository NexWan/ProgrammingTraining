import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(esPrimo(n));
    }
    public static int esPrimo(int n){
        int cont = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n%i == 0){
                cont++;
            }
        }
        if(cont == 2){
            return 1;
        }else{
            return 0;
        }
    }
}