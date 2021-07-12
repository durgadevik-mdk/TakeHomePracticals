package takehome;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Practical2 {

	public static void main(String[] args) throws IOException {
		
		Practical2 p2 = new Practical2();
		
		p2.doesFileExist("C:\\techfios\\test practical.txt");

	}

	public void doesFileExist(String path) throws IOException {
		
		Path path1 = Paths.get(path);
		
		if (Files.exists(path1)) {
			
			System.out.println("file exsits");
			
		} else if (Files.notExists(path1)) {

			System.out.println("file not exists");

		}

	}

}


