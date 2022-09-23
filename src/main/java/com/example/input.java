package com. example;

import java.util.Scanner;

/*class input */
public class input {

    public String inp() throws Exception{
        Scanner sc =new Scanner(System.in);
        String id="";
        
        System.out.print("Enter your id:");
         id = sc.nextLine();
        // sc.nextLine();
        if(!id.matches("^SE\\d{3}")){
            throw new Exception();
        }
        return  id;
    }
    

}
