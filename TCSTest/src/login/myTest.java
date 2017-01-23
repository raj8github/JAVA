package login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class myTest {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(new File("./src/browsers.txt"));
		BufferedReader br = new BufferedReader(fr);

		//Read a Text file containing browser names and set the drivers accordingly and do the actions.
		//setDriver.set - This sets the driver according to browser name and returns the driver.
		//input.Data - This basically does the navigation and inputs all the data.
		for (int i = 0; i <= 2; i++) {
			input.Data(setDriver.set(br.readLine().trim()));
		}

		br.close();

	}
}
