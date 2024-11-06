package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
      Logger logger = Logger.getLogger(Main.class.getName());

      logger.log(Level.INFO, "Test loging system");

    }
}