public class FizzBuzz {
    //2020/08/14　11:25~11:50
    public static void main(String[] args) {
        //1~40の数字が入った配列を作成
        int[] num =new int[40];
        for (int i=1;i<41; i++){
            num[i-1] = i;
        }

        //配列をstringに変換、3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、両方で割り切れるなら"FizzBuzz"を代入する
        String [] num_s = new  String[40];
        for (int i=1;i<41; i++){
            if(num[i-1] % 15 == 0){
                num_s[i-1] = "FizzBuzz";
            }
            else if(num[i-1] % 3 == 0){
                num_s[i-1] = "Fizz";
            }
            else if(num[i-1] % 5 == 0){
                num_s[i-1] = "Buzz";
            }
            else{
                num_s[i-1] = String.valueOf(num[i-1]);
            }
        }
        //出力
        for (int i=0;i<40; i++){
            System.out.println(num_s[i]);
        }
    }
}
