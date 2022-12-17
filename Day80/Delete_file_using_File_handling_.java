//DELETE FILE USING (FILE HANDLING IN JAVA) 

import java.io.File;   
import java.util.*;

class DeleteFile {  

  public static void main(String[] args) {  
    
   //Creating object and locating the file using its path
    File f0 = new File("C:\\Users\\91989\\Desktop\\Filedemo1.txt"); 

   	//.delete() function deletes the file from its location
    if (f0.delete())  
   		 
       {   
    //Prints if file deleted Successfuly
     System.out.println(f0.getName()+ " file is deleted successfully.");   
    	
    	}

 		else
     	{  
      //Prints if file is not deleted Successfuly    	
      	System.out.println("Unexpected error found in deletion of the file."); 
   		
   		 }   
  }

  }   

