package quintrix01;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Fileio {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File file = new File("/Users/dianewu/quintrix/quintrix01/Alice.txt");
		Scanner scan = new Scanner(file);

		
		String fileContent = "";
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
			
			
		}
		
	}

}
