public class YangHui {
    public static void main(String[] args) {
        /*
        使用二维数组打印一个10行杨辉三角
        1
        11
        121
        1331
        14641
        15101051
        ....
        提示
        1.第1行有1个元素，第n行有个元素
        2.每一行的第1个元素和最后一个元素都是1
        3.从第三行开始，对于非第一个元素和最后一个元素的元素的值arr[i][j]
        必须找到这个规律
        arr[i][j] = arr[i-1][j] +arr[i-1][j-1];
         */
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {

            //给每个一维数组(行)开空间
            yangHui[i] = new int[i+1];
            //给每个一维数组(行)赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是1
                if(j ==0 || j == yangHui[i].length-1){
                    yangHui[i][j] = 1;
                }else{//中间的元素 上一行的同一列+上一行前一列的值
                    yangHui[i][j] = yangHui[i-1][j] +yangHui[i-1][j-1];
                }
            }
        }
       //输出杨辉三角
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
