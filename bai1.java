package File.IO;

import java.io.File;

public class bai1 {
    public static void main(String[] args){
        String path = "C:\\rinnegan";
        File file = new File(path);
        if(file.exists()){
            if(file.isFile()){
                System.out.println("Đây là đường dẫn tới file");
            }
            else if(file.isDirectory()){
                System.out.println("Đây lòa dường dẫn tới thư mục");
            }
            else {
                System.out.println("Đây không phải là đường dẫn tới file hoặc thư mục");
            }
        }
        else {
            System.out.println("Đường dẫn không tồn tại");
        }
    }
}
