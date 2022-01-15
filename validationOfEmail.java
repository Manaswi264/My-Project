
package validationOfEmail;
import java.util.*;
import java.util.regex.*;
public class validationOfEmail {
	 
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("yourname@domain.com");  
	        emails.add("my.domain@domain.co.in");  
	        emails.add("manaswimohan264@gmail.com");
	        emails.add("develp@co.edu.com");
	        emails.add("hibernate.concepts@domain.co.in");
	        
	        
	        
	        //Regular Expression   
	        String regex = "^(.+)@(.+)com"; 
	       String regex1 = "//d[10]";
	      
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);
	        Pattern pattern1 = Pattern.compile(regex1);
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	           
	            System.out.println("Email Id : " + email +" is valid = "+ matcher.matches()+"\n" );  
	        } 
	       
	    }  
	 }

