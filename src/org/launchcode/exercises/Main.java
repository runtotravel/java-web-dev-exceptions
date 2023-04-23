package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }


    public static void Divide(int x, int y) {
        try {
            int result = x/y;
            System.out.println(result);
        } catch(ArithmeticException ex) {
            throw new ArithmeticException("Integer can't be divided by 0");
        }
    }


    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
    }

}
