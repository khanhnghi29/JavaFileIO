package File.IO;

import java.io.File;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String directoryPath = sc.nextLine();
        File directory = new File(directoryPath);
        if(directory.isDirectory()){
            File[] files = directory.listFiles();
            for(File file : files){
                if(file.isFile() && file.getName().endsWith(".java")){
                    System.out.println(file.getName());
                }
            }
        }
        else {
            System.out.println("Đường dẫn không phải là một thư mục");
        }
    }
}
