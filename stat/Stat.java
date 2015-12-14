import java.io.*;


public class Stat {

	public static void main(String[] args) throws IOException {

		//Test
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String in = null;
		while((in=reader.readLine()) != null) {
			if(in.contains("online"))
				System.out.println("line captured: " + in);
		}

	}


}
