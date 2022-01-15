package phase1Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Phase1 {
	public static final String DIR = "C:\\Users\\Manashwli\\documents";
	public static void main(String[] args) throws IOException {
		File file=new File(DIR);
		
		for(;;)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1.Retrive files from directory");
			System.out.println("2.Add file to directory");
			System.out.println("3.Delete Files");
			System.out.println("4.Search file");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice");
			
			 String choice=sc.nextLine();
			
			 switch(choice) {
			 case"1":{
				 int count=1;
				 String listOfFile[]=file.list();
				 for(String name:listOfFile) {
					 System.out.println(count+"."+name);
					 count++;
					 
				 }
				 break;
			 }
			 case"2":{
				 System.out.println("Enter File name to create");
				 String filename=sc.nextLine();
				 
				 File createNewFileName=new File(DIR+filename);
				 
				 
				 boolean createNewFile=createNewFileName.createNewFile();
				 
				 if(createNewFile) {
					 System.out.println("File created successfully");
	
				 }
				 else
				 {
					 System.out.println("File already exits");
				 }
				 break;
			 }
			 
			 case"3":{
				 System.out.println("Enter file name to delete");
				 String filename=sc.nextLine();
				 
				 File deleteFileName=new File(DIR+filename);
				 boolean delete=deleteFileName.delete();
				 
				 if(delete) {
					 System.out.println("File successfully deleted");
				 }
				 
				 else {
					 System.out.println("file is not present");
				 }
				 break;
			 }
			 
			 case"4":{
				 System.out.println("Enter file name which you wanna search");
				 String filename=sc.nextLine();
				 
				 File deleteFileName=new File(DIR+filename);
				 boolean exists=deleteFileName.exists();
				 if(exists){
					 System.out.println("file is present in directory");
					 
				 }
				 else {
					 System.out.println("File is not present in directory");
				 }
				 break;	 
			 }
			 
			 case"5":{
				 System.out.println("*****Exit*****");
				 System.exit(0);
				 break;
			 }
			 
			 default:
				 throw new IllegalArgumentException("Unexpected value:"+choice);
				 
			 }
			
		}
	}
	

}
