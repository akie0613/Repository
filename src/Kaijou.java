import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kaijou {
    //2020/08/18 9:51~10:10
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        System.out.println("数値を入力してください");
        str = br.readLine();
        long num = Long.parseLong(str);
        long ans = 1;
        while (num>0){
            ans = ans*num;
            num--;
        }
        System.out.println(ans);
    }
}
