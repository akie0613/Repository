import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sosuu {
    //2020/08/19 10:27~10:43
    public static void main(String[] args) throws IOException {
        outputSosuu();
        outputSosuu2();
    }
    //入力された数字以下の素数を求めて全て表示させる
    public static void outputSosuu() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("数字を入力してください。(2-9999)");
        String str;
        while (true){
            str  = br.readLine();
            if(Integer.parseInt(str)<2||Integer.parseInt(str)>9999){
                System.out.println("2-9999の値を入力してください");
            }
            else {
                break;
            }
        }
        //最初に出力される素数の前にカンマをつけないためのフラグ作成
        boolean isfirst = true;
        int inputNum = Integer.parseInt(str);
        //2が入力された場合のみ動きが違う
        if(inputNum == 2){
            System.out.println("2以下の素数は、2です。");
        }
        else{
            System.out.print(inputNum + "以下の素数は、");
            for(int i = 2; i < inputNum; i++){
                boolean isSosuu = true;
                for(int j = 2; j<i ; j++){
                    if(i%j==0){
                        isSosuu = false;
                    }
                }

                if (isSosuu){
                    if(isfirst){
                        System.out.print(i);
                        isfirst = false;
                    }
                    else {
                        System.out.print(","+i);
                    }
                }
            }
            System.out.println("です。");
        }
    }

    //入力される数字を2つに増やす
    //小さい方の数字以上　～　大きい方の数字以下の範囲の素数を表示
    public static void outputSosuu2() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("数字を2つ入力してください。(2-9999)");
        String str1;
        String str2;
        while (true){
            System.out.println("1つめ：");
            str1  = br.readLine();
            if(Integer.parseInt(str1)<2||Integer.parseInt(str1)>9999){
                System.out.println("2-9999の値を入力してください");
                continue;
            }
            System.out.println("2つめ：");
            str2  = br.readLine();
            if(Integer.parseInt(str2)<2||Integer.parseInt(str2)>9999){
                System.out.println("2-9999の値を入力してください");
                continue;
            }
            break;
        }
        int inputNum1;
        int inputNum2;
        //数値の小さいほうをinputNum1、大きいほうをinputNum2とする
        if(Integer.parseInt(str1)<=Integer.parseInt(str2)){
            inputNum1 = Integer.parseInt(str1);
            inputNum2 = Integer.parseInt(str2);
        }
        else {
            inputNum1= Integer.parseInt(str2);
            inputNum2= Integer.parseInt(str1);
        }

        boolean isfirst = true;
        System.out.print(inputNum1+"以上" + inputNum2 +"以下の素数は、");
        for(int i = inputNum1; i <= inputNum2; i++){
            boolean isSosuu = true;
            for(int j = 2; j<i ; j++){
                if(i%j==0){
                    isSosuu = false;
                }
            }
            if (isSosuu){
                if(isfirst){
                    System.out.print(i);
                    isfirst = false;
                }
                else {
                    System.out.print(","+i);
                }
            }
        }
        System.out.print("です。");
    }
}
