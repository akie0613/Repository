public class Kaibun {
    //2020/08/14 15:16~16:30
    public static void main(String[] args) {
        //10以上で10進数、8進数、2進数共に回文ならその数値を10進数で出力する
        for (int i = 10;;i++){
            if(KaibunHantei(i)&&KaibunHantei(Integer.parseInt(Integer.toOctalString(i)))&&KaibunHantei(Integer.parseInt(Integer.toBinaryString(i)))) {
                System.out.println(i);
                break;
            }
        }
    }

    //回文判定クラス
    public static boolean KaibunHantei(int num){
        //文字数取得
        int length = String.valueOf(num).length();
        //回文かどうかのフラグ作成
        boolean kaibunFlag = false;
        //文字列の前と後ろを比較するループを作成
        //回文ならflagをtrueにする
        for (int j = 0;j<length;j++){
            if(String.valueOf(num).charAt(j)==String.valueOf(num).charAt(length-j-1)){
                if(j==length-1){
                    kaibunFlag=true;
                    break;
                }
                else {
                    continue;
                }
            }
            else{
                kaibunFlag=false;
                break;
            }
        }
        return kaibunFlag;
    }
}
