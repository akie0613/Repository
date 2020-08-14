public class table99 {
    //2020/08/14 13:37~13:56
    public static void main(String[] args) {
        //for文で99の表を作成する
        for(int i = 1;i<10;i++){
            for(int j = 1;j<10;j++){
                String ans = String.valueOf(i*j);
                //4を*に置換する
                ans = ans.replace("4","*");
                System.out.print(ans+"\t");
            }
            //改行
            System.out.println();
        }
    }
}

