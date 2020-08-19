public class Gyouretu {
    //2020/08/18 16:53~17:45、2020/08/19 9:06~09:26、
    public static void main(String[] args)  {
        //①行列を定義
        char[][] from2Char= {
                {'1','2','3','A'},
                {'4','5','6','B'},
                {'7','8','9','C'}
        };
        //②：配列を出力するメソッドを定義して、そのメソッドで①の配列をコンソールに出力。
        outputcons(from2Char);
        //③：配列の行列を入れ替えるメソッドを定義して、そのメソッドで①で定義した配列の行列を入れ替えた配列を生成する。
        char[][] afterArray =chenge(from2Char);
        //④：③で行列の入れ替えを行った配列を②で作成したメソッドでコンソールに出力。
        outputcons(afterArray);
        //⑤：2次元配列（文字列）を受け取り行の要素を集計するメソッド作成
        int [] sum = sum_gyou(afterArray);
        //⑥：⑤で作成した１次元配列をコンソールに出力。
        outputcons(sum);
        //⑦：⑤のメソッドは行で加算したが、列加算バージョンのメソッドを作成
        int [] sum2 = sum_retu((afterArray));
        //⑧：⑦の結果をコンソールに出力
        outputcons(sum2);
        //⑨：全要素を加算してIntを返すメソッドを作成し、その結果をコンソールに出力。
        System.out.println(sum_all(afterArray));
    }

    //②：配列を出力するメソッドを定義して、そのメソッドで①の配列をコンソールに出力。
    public static void outputcons(char[][] from2Char ){
        for(int i = 0; i<from2Char.length; i++){
            for(int j = 0; j<from2Char[i].length; j++){
                System.out.print(from2Char[i][j] + " ");
            }
            System.out.println();
        }
    }
    //⑥：⑤で作成した１次元配列をコンソールに出力。
    public static void outputcons(int[] from2Char ){
        for(int i = 0; i<from2Char.length; i++){
                System.out.println(from2Char[i]+ " ");
        }
    }

    //③：配列の行列を入れ替えるメソッドを定義して、そのメソッドで①で定義した配列の行列を入れ替えた配列を生成する。
    public static char[][] chenge(char[][] from2Char ) {
        char[][] afterArray = new char[from2Char[0].length][from2Char.length];
        for(int i = 0; i<afterArray.length;i++){
            for(int j = 0; j<afterArray[0].length;j++){
                afterArray[i][j]=from2Char[j][i];
            }
        }
        return afterArray;
    }
    //⑤：2次元配列（文字列）を受け取り行の要素を集計するメソッド作成
    public static int[] sum_gyou(char[][] from2Char ) {
        int[]sum = new int[from2Char.length];
        for(int i = 0; i< sum.length; i++){
            for(int j = 0; j<from2Char[0].length;j++){
                if(Character.isDigit(from2Char[i][j])){
                    sum[i]=sum[i]+Character.getNumericValue(from2Char[i][j]);
                }
            }
        }
        return sum;
    }
    //⑦：⑤のメソッドは行で加算したが、列加算バージョンのメソッドを作成
    public static int[] sum_retu(char[][] from2Char ) {
        int[]sum = new int[from2Char[0].length];
        for(int i = 0; i< sum.length; i++){
            for(int j = 0; j<from2Char.length;j++){
                if(Character.isDigit(from2Char[j][i])){
                    sum[i]=sum[i]+Character.getNumericValue(from2Char[j][i]);
                }
            }
        }
        return sum;
    }
    //⑨：全要素を加算してIntを返すメソッドを作成し、その結果をコンソールに出力。
    public static int sum_all(char[][] from2Char ) {
        int sum =0;
        for(int i = 0; i< from2Char.length; i++){
            for(int j = 0; j<from2Char[0].length;j++){
                if(Character.isDigit(from2Char[i][j])){
                    sum=sum+Character.getNumericValue(from2Char[i][j]);
                }
            }
        }
        return sum;
    }


}
