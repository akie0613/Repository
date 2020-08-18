import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Uruudosi {
    //2020/08/14 17:30~17:45,2020/08/18 9:00~9:45,
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str="";
        //入力された値が数値かどうかのフラグ
        boolean NumFlag =true;

        while (!str.equals("end")){

            if(NumFlag){
                System.out.println("西暦を入力してください：");
            }
            str = br.readLine();
            //数値以外の値が入力された場合の処理
            if(!isNumber(str)){
                str = str.toLowerCase();
                if(!str.equals("end")){
                    System.out.println("西暦を数値で入力してください：");
                    NumFlag = false;
                }
                continue;
            }
            if(Integer.parseInt(str)>=0 && Integer.parseInt(str)<10000){
                if(Integer.parseInt(str)%400==0){
                    System.out.println("閏年:");
                }
                else if(Integer.parseInt(str)%100==0){
                    System.out.println("平年:");
                }
                else if(Integer.parseInt(str)%4==0){
                    System.out.println("閏年:");
                }
                else {
                    System.out.println("平年:");
                }
            }
        }
    }

//数値かどうかの判定処理
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
