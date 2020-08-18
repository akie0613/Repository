import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class MaxMinAvg {
    //2020/08/18 13:02~13:30
    public static void main(String[] args){
        //読み込むファイルを定義
        String path = "C:\\Exercise\\minmaxave.csv";
        //Readメソッドよりcsv読み込み
        List<String> textList = Read(path);
        int max = 0;
        int min = 0;
        double avg;
        //double sum = 0;
        int sum = 0;
        for (int i = 0; i < textList.size(); i++) {
            int num = Integer.parseInt(textList.get(i));
            //ループ1回目のとき変数maxとminにそのまま値を入れる
            if(i==0){
                max = num;
                min = num;
            }
            else{
                if(max<num){
                    max = num;
                }
                if(min>num){
                    min = num;
                }
            }
            sum = sum + num;
        }
        //avg = sum/ textList.size();
        avg = (double)sum/ textList.size();
        //少数第三位で四捨五入
        avg = ((double)Math.round(avg * 100))/100;

        System.out.println("最大値："+ max);
        System.out.println("最小値："+ min);
        //System.out.println("平均値："+ String.format("%.2f", avg));
        System.out.println("平均値："+  avg);

    }
    //ファイルを読込むメソッド
    public static List<String> Read(String path_s){
        List<String> textList = new ArrayList<>();
        try{
            Path path = Paths.get(path_s);
            textList = Files.readAllLines(path, StandardCharsets.UTF_8);

            //指定したファイルが存在しない、アクセスできない場合、エラーメッセージを出力
        } catch (FileNotFoundException e) {
            System.out.print("ファイル読込みに失敗しました");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.print("ファイル読込みに失敗しました");
            e.printStackTrace();
        }
        return textList;
    }
}
