import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class z {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String last = " ";
        try{
            while (true) {
                String[] date = br.readLine().trim().split("/");
                last = date[date.length-1];
                try{
                    if(Integer.parseInt(last) >= 74 && Integer.parseInt(last) <= 99){
                        System.out.println(date[0] + "/" + date[1] +"/" + "19"+last);
                    }else if(Integer.parseInt(last) <= 73 && Integer.parseInt(last) >= 0){
                        System.out.println(date[0] + "/" +  date[1] +"/" + "20"+last);
                    }else{
                        break;
                    }
                }catch (Exception e){
                    break;
                }
            }
        }catch (Exception e){
            System.exit(0);
        }
    }
}
