public class MethodParameter02 {
    public static void main(String[] args) {
        //测试
        BB b = new BB();
        int[] arr = {1, 2, 3};
        b.test100(arr);//调用方法

        System.out.println("main方法的 arr数组");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //测试
        PersonBB p = new PersonBB();
        p.name = "jack";
        p.age = 10;

        b.test200(p);
        //测试题 如果test200 执行的是p = null;下面的结果是10
        //测试题 如果test200 执行的是p = new ....;下面的结果是10
        System.out.println("main 的p.age=" + p.age);//jack 10000
    }
}
 class PersonBB{
    String name;
    int age;
}
 class BB {
    //BB类中编写一个方法test100
    //可以接收一个数组，看看原来的数组是否变化
    public void test100(int[] arr) {
        arr[0] = 200;//修改了一个元素
        //遍历数组
        System.out.println("test100的 arr数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public void test200(PersonBB p) {
        // p.age = 10000;//修改对象属性
        //思考
        //p = null;
        //思考
         p = new PersonBB();
         p.name = "tom";
         p.age = 99;
    }
}