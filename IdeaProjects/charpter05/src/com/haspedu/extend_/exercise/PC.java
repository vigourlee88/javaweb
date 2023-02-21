package com.haspedu.extend_.exercise;

public class PC extends Computer {

    private String brand;

    //这里IDEA 根据继承的规则，自动把构造器的调用写好
    //体现 继承设计的基本思想
    //父类的属性由父类的构造器初始化
    //子类的属性由子类的构造器初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //使用方法打印并输出信息
    public void printInfo(){
        System.out.println("PC信息=");
  //      System.out.println(getCpu() + getDisk()+getMemory());
        //直接调用父类的getDetails()方法，得到相关属性信息
        System.out.println(getDetails()+ " brand=" + brand);
    }
}
