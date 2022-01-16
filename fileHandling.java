import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
	public static void main(String[] args) {
		try {
			String data="Hey,Good Morning";
			File f1=new File("D:\\java\\Greetings.txt");
			if(!f1.exists()) {
				f1.createNewFile();
			}
			
			FileWriter fileWriter=new FileWriter(f1.getName(),true);
			BufferedWriter bw=new BufferedWriter(fileWriter);
			
			bw.write(data);
			bw.close();
			System.out.println("Done");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
