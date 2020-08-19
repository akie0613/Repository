import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sosuu {
    //2020/08/19 10:27~11:43　修正20分
    public static void main(String[] args) throws IOException {
        outputSosuu();
        outputSosuu2();
    }

    //入力された数字以下の素数を求めて全て表示させる
    public static void outputSosuu() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("数字を入力してください。(2-9999)");
        int inputNum;
        while (true){
            inputNum = Integer.parseInt(br.readLine());
            if(inputNum<2||inputNum>9999){
                System.out.println("2-9999の値を入力してください");
            }
            else {
                break;
            }
        }
        System.out.print(inputNum + "以下の素数は、");
        outputSosuuList(2,inputNum);
        System.out.println("です。");
    }

    //入力される数字を2つに増やす
    //小さい方の数字以上　～　大きい方の数字以下の範囲の素数を表示
    public static void outputSosuu2() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("数字を2つ入力してください。(2-9999)");
        int inputNum1;
        int inputNum2;
        while (true){
            System.out.println("1つめ：");
            inputNum1 = Integer.parseInt(br.readLine());
            if(inputNum1<2||inputNum1>9999){
                System.out.println("2-9999の値を入力してください");
                continue;
            }
            System.out.println("2つめ：");
            inputNum2 = Integer.parseInt(br.readLine());
            if(inputNum2<2||inputNum2>9999){
                System.out.println("2-9999の値を入力してください");
                continue;
            }
            break;
        }

        //数値の小さいほうをinputNum1、大きいほうをinputNum2とする
        if(inputNum1>=inputNum2){
            int temp = inputNum1;
            inputNum1 = inputNum2;
            inputNum2 = temp;
        }
        System.out.print(inputNum1+"以上" + inputNum2 +"以下の素数は、");
        outputSosuuList(inputNum1,inputNum2);
        System.out.print("です。");
    }

    //2つの引数の範囲内の素数を出力する
    //出力例：2,3,5,7,11,13,17,19
    public static void outputSosuuList(int num1 , int num2) throws IOException {
        boolean isfirst = true;
        for(int i = num1; i <= num2; i++){
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
    }
}
