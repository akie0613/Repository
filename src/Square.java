import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Square {
    //2020/08/14 16:41~17:16
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        System.out.println("正方形の一辺の長さを入力してください");
        try {
            str = br.readLine();
            br.close();
            //入力された数字だけループさせる
            for (int i = 0; i<Integer.parseInt(str);i++){
                //1回目、または最後のループの場合、*を数字分入力する。
                //上記以外のループの場合、数字-2個の空白と両端に*を出力する
                if(i==0||i==Integer.parseInt(str)-1){
                    for (int j = 0; j<Integer.parseInt(str);j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else{
                    System.out.print("*");
                    for (int j = 0; j<Integer.parseInt(str)-2;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("数値を入力してください");
            return;
        }
        System.out.println("入力された文字は「" + str + "」です");
    }
}
