package filemanagement;

import java.io.FileReader;

public class FileReaderExample {  
    public static void main(String[] args) {  
        try  {  
            FileReader reader = new FileReader("C:/raghu/kaushalya.tech/trainingmaterial/java/programs/workingjava/src/filemanagement/test.txt");  
                      
            int i; 
           
            while ((i = reader.read()) != -1) {  
                System.out.print((char) i);  
            }  
            reader.close();  
            
        } catch (Exception e) {  
            e.getMessage();  
        }  
    }  
}  

