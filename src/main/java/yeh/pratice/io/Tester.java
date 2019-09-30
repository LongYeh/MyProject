package yeh.pratice.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Tester {
    public static void main(String[] args) {
        File file=new File("data.txt");
        System.out.println(file.exists());//是否存在
        System.out.println(file.getAbsolutePath());//絕對路徑
        try {
            InputStream is = new FileInputStream(file);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message: "+e);
        }
        System.out.println("success");
    }
}
