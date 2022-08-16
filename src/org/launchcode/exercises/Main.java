package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your divide() function!
        //divide(40, 0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Micho", "");

        // Test out your CheckFileExtension() function!
        System.out.println(checkFileExtension(studentFiles.get("Micho")));
    }

    public static void divide(int x, int y) {
        if(y == 0) {
           try{
               throw new ArithmeticException("You can't divide by 0");
           } catch (ArithmeticException ae) {
               ae.printStackTrace();
           }
        } else {
            System.out.println(x/y);
        }
    }

    public static int checkFileExtension(String fileName) {
        int result = 0;
        if(fileName == null || fileName.isEmpty()) {
            try {
                throw new NullPointerException("File cannot be null");
            } catch (NullPointerException npe) {
                npe.printStackTrace();
                result = -1;
                return result;
            }
        } else if (fileName.endsWith(".java")) {
           result = 1;
            return result;
        }
    return result;
    }

}
