import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class UnUseNum {
    //2020/08/18 15:43~16:47
    public static void main(String[] args) throws IOException {
        //読み込むファイルを定義
        String path = "C:\\Exercise\\test.txt";
        //使われてない数字を出力
        OutUnusedNum(path);
        //使われている数字を出力
        OutUsedNum(path);
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

    //使われていない数字を出力
    public static void OutUnusedNum(String path) throws IOException {
        //Readメソッドよりcsv読み込み
        List<String> textList = Read(path);
        // FileWriterクラスのオブジェクトを生成する
        FileWriter file = new FileWriter("C:\\Exercise\\UnUsedNum.txt");
        // PrintWriterクラスのオブジェクトを生成する
        PrintWriter pw = new PrintWriter(new BufferedWriter(file));
        for (int i = 0; i < textList.size(); i++) {
            String text = textList.get(i);
            pw.print(text + " -> ");
            //数値がすべて使われているかどうかを判別するための変数作成
            int allUseFlag = 0;
            for(int j = 0;j<10; j++ ){
                if(!text.contains(Integer.toString(j))){
                    pw.print(j);
                }
                else{
                    allUseFlag++;
                }
            }
            if(allUseFlag==10){
                pw.print("none");
            }
            pw.println();
        }
        pw.close();
    }

    //使われている数字を出力
    public static void OutUsedNum(String path) throws IOException {
        //Readメソッドよりcsv読み込み
        List<String> textList = Read(path);

        int[] usedNum= new int[10];
        //一文字ずつ数値を読み込み配列の値を加算する。
        for (int i = 0; i < textList.size(); i++) {
            for(int j = 0; j < textList.get(i).length(); j++) {
                if(Character.isDigit(textList.get(i).charAt(j))) {
                    int num_c = Character.getNumericValue(textList.get(i).charAt(j));
                    usedNum[num_c]++;
                }
            }
        }
        //出力
        // FileWriterクラスのオブジェクトを生成する
        FileWriter file = new FileWriter("C:\\Exercise\\UsedNum.txt");
        // PrintWriterクラスのオブジェクトを生成する
        PrintWriter pw = new PrintWriter(new BufferedWriter(file));
        //1～9の数値をカウントする配列を作成
        for (int i = 0; i<10;i++) {
            pw.println(i+"：" + usedNum[i]);
        }
        pw.close();
    }
}
