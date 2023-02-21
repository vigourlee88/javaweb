package com.haspedu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        //给对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法打印输出信息
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();

        NotePad np = new NotePad("mac",8,500,'灰');
        np.printInfo();

    }
}

