package com.hspedu.encap;

public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("123456");

        account.showInfo();
    }
}
//TestAccount和Accout在同一个包可以相互访问