import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Ransuu {
    //2020/08/18 14:24~15:02
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str1="";
        String str2="";
        boolean numcheckflag = false;


        while (!numcheckflag) {
            System.out.println("一つ目の値を入力してください");
            str1 = br.readLine();
            System.out.println("二つ目の値を入力してください");
            str2 = br.readLine();
            numcheckflag = numcheck(str1,str2);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(create_randomNum(Integer.parseInt(str1), Integer.parseInt(str2)));
        }

    }
    //乱数生成メソッド
    public static int create_randomNum(int num1,int num2){
        Random rand = new Random();
        int num = rand.nextInt(num2-num1+1) + num1;
        return num;
    }

    //入力値チェックメソッド
    public static boolean numcheck(String str1, String str2){
        if(!isNumber(str1)){
            System.out.println("入力された値が不正です");
            return false;
        }
        if(!isNumber(str2)){
            System.out.println("入力された値が不正です");
            return false;
        }
        if (Integer.parseInt(str2)-Integer.parseInt(str1)<=0){
            System.out.println("入力された値が不正です");
            return false;
        }
        return true;
    }

    //数値かどうかの判定メソッド
    public static boolean isNumber(String str){
        boolean result = true;
        for(int i = 0; i < str.length(); i++) {

            //i文字めの文字についてCharacter.isDigitメソッドで判定する
            if(Character.isDigit(str.charAt(i))) {
                //数字の場合は次の文字の判定へ
                continue;
            }else {

                //数字でない場合は検証結果をfalseに上書きする
                result =false;
                break;
            }
        }
        return result;
    }
}
