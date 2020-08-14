import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ReadTxt {
    //2020/08/14 14:13~14:58
    public static void main(String[] args) {
        //読み込むファイルを定義
        String pass = "C:\\Exercise\\test.txt";
        //Readメソッドよりtxt読み込み
        List<String> textList = Read(pass);
        //Listの内容を出力
        for (int i = 0; i < textList.size(); i++) {
            System.out.println(textList.get(i));
        }
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
