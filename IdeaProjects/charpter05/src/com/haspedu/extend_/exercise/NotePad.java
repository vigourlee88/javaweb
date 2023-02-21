package com.haspedu.extend_.exercise;

public class NotePad extends Computer{

    private char color;

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public NotePad(String cpu, int memory, int disk, char color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void  printInfo(){
        System.out.println("NotePad信息=");
        System.out.println(getDetails()+ " color=" + color);
    }
}
