import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String[][] m = new String[3][3];
        int mI[][] = new int[3][3];
        int z = 0;

        for(int i = 0 ; i < 3 ; i++){
            String[] mS = br.readLine().trim().split("\\s+");
            m[i] = mS;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mI[i][j] = Integer.parseInt(m[i][j]);
            }
        }
        int aux = m.length-1;
        boolean vdd = false;
        int eq = mI[0][0];
        int eq2 = mI[0][2];
        for (int i = 0; i < mI.length; i++) {
            for (int j = 0; j < mI.length; j++) {
                if(i == j && j == j-aux){
                    if(mI[i][j] == eq && mI[i][j-aux] == eq2){
                        vdd = true;
                    }else{
                        vdd = false;
                    }
                }
            }
            aux--;
        }
        if(vdd)
            System.out.println("Tesoro encontrado");
        else
            System.out.println("Sigue buscando");
    }
}