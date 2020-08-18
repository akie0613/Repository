import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertMinute {
    //2020/08/18 13:44~14:16
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        System.out.println("数値を入力してください");
        str = br.readLine();
        int minute = Integer.parseInt(str);
        if(minute<60){
            minute_m(minute);
        }
        else if(minute>=60&&minute<1440){
            //System.out.print(minute/60+"時間");
            hour_m(minute);
        }
        else if(minute>=1440&&minute<100000){
            //System.out.print(minute/60+"時間");
            day_m(minute);
        }
    }
    //分出力メソッド
    public static void minute_m(int minute){
        System.out.print(minute%60+"分");
    }

    //時間出力メソッド
    public static void hour_m(int minute){
        if (minute>=60){
            System.out.print(minute/60+"時間");
        }
        if (minute%60!=0){
            minute_m(minute%60);
        }
    }
    //日出力メソッド
    public static void day_m(int minute){
        System.out.print(minute/1440+"日");
        if (minute%1440!=0){
            hour_m(minute%1440);
        }
    }
}
