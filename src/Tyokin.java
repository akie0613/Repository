import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class Tyokin {
    //2020/08/19 9:40~10:14
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("初期残高を入力してください");
        String str  = br.readLine();

        //初期残高
        int initial = Integer.parseInt(str);
        //合計金額
        int sum = initial;
        //日数
        int days = 1;
        //三桁毎にカンマ区切り
        DecimalFormat df = new DecimalFormat( "#,###" );

        while (sum<=100000){
            sum = sum + (int) Math.pow(2, days-1);
            System.out.print(days+"日目までの合計金額 "+df.format(sum)+"円\t");
            System.out.print("本日の貯金額 " + df.format((int) Math.pow(2, days-1)) + "円\t");
            System.out.println("貯金総額 " + df.format(sum - initial)+ "円");
            days++;
        }
    }
}
