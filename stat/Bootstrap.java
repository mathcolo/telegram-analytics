public class Bootstrap {

	public static void main(String[] args) {

		try {

			Thread.sleep(7000);
			System.out.println("contact_list");

			for(;;) {
				Thread.sleep(30000);
			}

		}
		catch(InterruptedException e) {
			System.exit(1);
		}

	}


}
