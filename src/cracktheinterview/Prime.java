package crackintreview;

import java.io.*;
import java.util.*;

public class Prime {

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
             int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  prime(ele);
              }
    }
     static void prime(int ele){
        boolean flag = false;
        for(int i = 2; i <= Math.sqrt(ele);i++){
            if(ele%i==0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }
        
    }
}