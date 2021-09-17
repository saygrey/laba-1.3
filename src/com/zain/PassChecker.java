package com.zain;

import java.util.Scanner;

public class PassChecker {
    String rightPass= "pass";
    String entPass;
    protected void start(){
        readEntPass();
        if(passEqu(entPass)){
            System.out.println("correct pass");
        }
        else{
            System.out.println("incorrect pass");
        }
    }

    private boolean passEqu(String compToPassStr){
        return compToPassStr.equals(rightPass);
    }

    private void readEntPass(){
        System.out.println("Enter pass:");
        Scanner in=new Scanner(System.in);
        entPass=in.nextLine();

    }
}
