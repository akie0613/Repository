import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Soinsuu {
    //2020/08/19 13:08~14:24
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("数字を入力してください。(2-9999)");
        int inputNum;
        while (true){
            inputNum  = Integer.parseInt(br.readLine());
            if(inputNum<2||inputNum>9999){
                System.out.println("2-9999の値を入力してください");
            }
            else {
                break;
            }
        }
        //(入力値÷2）以下の素数のリストを取得
        List<Integer>sosuuList = outputSosuuList(inputNum);

        System.out.print(inputNum+" = ");
        //素因数分解のもととなる数字numを新しく定義
        int num = inputNum;

        for (int i=0; i<sosuuList.size(); ++i)
        {
            for(int j=0;;j++){
                //ループ内で、その素数で割れきれる間は割続ける
                if(num%sosuuList.get(i)==0){
                    num = num/sosuuList.get(i);
                }
                //割り切れなくなったら次の素数へ
                else{
                    if(j==0){
                        break;
                    }
                    else{
                        System.out.print(sosuuList.get(i)+"^"+j);
                        if(num!=1){
                            System.out.print("*");
                        }
                        break;
                    }
                }
            }
        }
        //入力値が素数の場合の処理
        if(num!=1){
            System.out.print(num+"^1");
        }
    }

    //(入力値÷2）以下の素数のリストを返すメソッド
    public static List<Integer> outputSosuuList(int num)  {
        List<Integer>sosuuList = new ArrayList<Integer>();

        for (int i = 2; i <= num/2; i++) {
            boolean isSosuu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSosuu = false;
                }
            }
            if (isSosuu) {
                sosuuList.add(i);
            }
        }
        return sosuuList;
    }
}
