package com. example;



/*class Main of program */
public class App {
    public static void main(String[] args) {
        boolean match = false;
        String id;
        do {
            input inp = new input();
            try {
                
                id=inp.inp();
                System.out.println("Your id"+id+"is valid");
                match = false;
            } catch (Exception e) {
                
                System.out.println("Your id is invalid");
                match= true;
            }
        } while (match);
    }
}
