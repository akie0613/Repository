import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
public class CreateCalendar {
    //2020/08/18 10:46~11:49
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String year;
        String month;
        System.out.println("年を入力してください：");
        year = br.readLine();
        System.out.println("月を入力してください：");
        month = br.readLine();
        Calendar cl = Calendar.getInstance();
        //カレンダークラスに年月日の情報をセット
        cl.set(Calendar.YEAR,Integer.parseInt(year));
        cl.set(Calendar.MONTH,Integer.parseInt(month)-1);
        cl.set(Calendar.DATE,1);
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSTA");

        for (int i = 0; i<cl.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }
        //改行フラグ作成、Calendar.DAY_OF_WEEKは日曜日が1、月曜日2...土曜日7が入る。
        int kaigyou = cl.get(Calendar.DAY_OF_WEEK);
        for (int i = 0; i<cl.getActualMaximum(Calendar.DATE);i++){
            System.out.print((i+1)+"\t");
            //土曜日で改行する。
            if((kaigyou)%7==0){
                System.out.println();
            }
            kaigyou++;
        }
    }
}
