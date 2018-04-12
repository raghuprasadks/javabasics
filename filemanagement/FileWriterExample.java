package filemanagement;
import java.io.FileWriter;

public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:/raghu/kaushalya.tech/trainingmaterial/java/programs/workingjava/src/filemanagement/test.txt");    
           fw.write("Welcome to Java file management.");    
           fw.close();    
          }catch(Exception e)
         {
        	  System.out.println(e);
        }    
          System.out.println("Success...");    
     }    
}  

