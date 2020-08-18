import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class saiten {
    //2020/08/18 10:17~10:36
    public static void main(String[] args){
        //読み込むファイルを定義
        String pass = "C:\\Exercise\\score.csv";
        //Readメソッドよりcsv読み込み
        List<String> textList = Read(pass);

        //評価リスト作成
        int yuu=0;
        int ryou=0;
        int ka=0;
        int tuikakadai=0;
        int hosyuu=0;

        //csvを一行ずつ読み込み、評価リストに振り分ける
        for (int i = 0; i < textList.size(); i++) {
            int num = Integer.parseInt(textList.get(i));
            if(80<=num&&num<=99){
                yuu++;
            }
            else if(60<=num&&num<=79){
                ryou++;
            }
            else if(46<=num&&num<=59){
                ka++;
            }
            else if(21<=num&&num<=45){
                tuikakadai++;
            }
            else if(0<=num&&num<=20){
                hosyuu++;
            }
        }
        System.out.println("優：" + yuu + "人");
        System.out.println("良：" + ryou + "人");
        System.out.println("可：" + ka + "人");
        System.out.println("追加課題：" + tuikakadai + "人");
        System.out.println("補習：" + hosyuu + "人");

    }
    //ファイルを読込むメソッド
    public static List<String> Read(String pass){
        List<String> textList = new ArrayList<>();
        try{
            File file = new File(pass);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String text;
            //txtの内容をlistに追加
            while ((text = br.readLine()) != null) {
                textList.add(text);
            }

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
