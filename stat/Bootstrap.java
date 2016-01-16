public class Bootstrap {

	public static void main(String[] args) {

		int count = 0;

		try {

			Thread.sleep(7000);
			System.out.println("contact_list");

			for(;;) {
				Thread.sleep(60000); //Wait a minute
				count++;

				//Every 6 hours
				if(count % 360 == 0) {
					System.out.println("contact_list");
				}
			}

		}
		catch(InterruptedException e) {
			System.exit(1);
		}

	}


}
