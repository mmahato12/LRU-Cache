import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LRUCache_Main {
	public static void Read_Write() throws IOException
	{
		if (System.getProperty("ONLINE_JUDGE") == null) {
			// Redirecting the I/O to external files

			// as ONLINE_JUDGE constant is not defined which
			// means

			// the code is not running on an online judge

			PrintStream ps
				= new PrintStream(new File("output.txt"));
			InputStream is
				= new FileInputStream("input.txt");

			System.setIn(is);
			System.setOut(ps);
		}
	}
	
	public static void main(String[] args) throws IOException{
//		Read_Write();
		Scanner scanner = new Scanner(System.in);
		LRUCache cache = new LRUCache(2);
		System.out.println("System Started");
		
		while(scanner.hasNext()) {
			String cmdString = scanner.nextLine();
			String[] cmd = cmdString.split(" ");
			System.out.println(cmdString);
			switch(cmd[0])
			{
				case "put": {
					int key = Integer.valueOf(cmd[1]);
					int value = Integer.valueOf(cmd[2]);
					cache.put(key, value);
					break;
				}
				case "get": {
					int key = Integer.valueOf(cmd[1]);
					System.out.println(cache.get(key));
					break;
				}
				default:
					System.out.println("Invalid Cammand");
			}
		}
	}
}
