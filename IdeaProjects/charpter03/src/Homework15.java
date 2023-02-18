public class Homework15 {
    public static void main(String[] args) {
        /*
        已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序
        比如{10,12,45,90},添加23后，数组为{10,12,23,45,90}
        思路分析
        本质数组扩容+定位(加到某一个位置)
        1.我们先确定 添加数应该插入到那个索引
        2.然后扩容

         */
        //先定义原数组
        int[] arr = {10,12,45,90};
        int insertNum = 23;
        int index = -1;//index就是要插入的位置
        //遍历 arr数组，如果发现insertNum <= arr[i],
        //就说明i就是要插入的位置
        //使用index保留index=i;
        //如果遍历完后，没有发现 insertNum <= arr[i],说明index =arr.length
        //即 添加到arr的最后

        for (int i = 0; i < arr.length; i++) {
            if(insertNum <= arr[i]){
                index = i;//index记录i
                break;//找到位置后,就退出
            }
        }
        //判断index的值
        if(index == -1){//说明还没有找到位置
            index = arr.length;
        }
        // System.out.println("index=" + index);
        //扩容  创建一个新的数组 大小arr.length+1
        int[] arrNew = new int[arr.length + 1];
        //将arr的元素拷贝到arrNew,并且要跳过 index位置预留位置
        /*
        分析
        int[] arr = {10,12,45,90};j是arr的下标
        arrNew = {10,12, ,45,90};下标!=2
         */
        //i 控制arrNew的下标 ，j 用来控制arr数组的下标
        for (int i = 0,j = 0; i <arrNew.length ; i++) {
            if(i != index){//说明可以把arr元素拷贝到arrNew
                arrNew[i] = arr[j];
                j++;
            }else{//i这个位置就是要插入的数
                arrNew[i] = insertNum;
            }
        }
        //让arr指向arrNew,原来的数组称为垃圾 就会被销毁
        arr = arrNew;

        System.out.println("\n====插入后,arr数组的元素情况====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}
