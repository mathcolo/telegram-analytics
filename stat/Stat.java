import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Stat {

	public static void main(String[] args) throws IOException {

		String outPath = "data.txt";

		try {
		    Files.createFile(Paths.get(outPath));
		} catch (Exception e) {
		}

		//Test
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String in = null;
		while((in=reader.readLine()) != null) {

			//in

			if(in.contains("online (was")) {
				String datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
				String user = in.substring(8, in.indexOf("online")-1);

				String entry = datetime + "," + user + "\n";

				Files.write(Paths.get(outPath), entry.getBytes(), StandardOpenOption.APPEND);
				
			}



		}

	}


}
