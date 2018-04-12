package filemanagement;

import java.io.File;
import java.io.IOException;  
public class FileDemo {  
    public static void main(String[] args) {  
  
        try {  
              	
        	File file = new File("C:/raghu/kaushalya.tech/trainingmaterial/java/programs/workingjava/src/filemanagement/test.txt");
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  

