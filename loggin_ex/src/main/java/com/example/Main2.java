package com.example;

import java.util.logging.Logger;

public class Main2 {

    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger("Main2");

        try{

            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e){
            logger.warning("_______??___________________?");
        }

        
    }
    
}
