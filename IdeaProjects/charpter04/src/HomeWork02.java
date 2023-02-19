public class HomeWork02 {
    public static void main(String[] args) {
        String[] strs = {"tom","jack","milan"};
        A02 a02 = new A02();
        int index = a02.find("milan",strs);
        System.out.println("查找的index=" + index);

    }
}
/*
查找某个字符串是否在字符串数组中，并返回索引，
找不到，就返回-1
 */
class A02{
    public int find(String findStr,String[] strs){

        for (int i = 0; i < strs.length; i++) {
            //直接遍历字符串数组，如果找到，则返回索引
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        //遍历完数组，没有找到，就返回-1
        return -1;
    }
}