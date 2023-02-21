package com.haspedu.extend_.improve_;

import com.haspedu.extend_.Graduate;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王~~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();//打印成绩

        System.out.println("==============");
        com.haspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
