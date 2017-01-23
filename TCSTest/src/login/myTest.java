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
		for (int i = 0; i <= 2; i++) {
			input.Data(setDriver.set(br.readLine().trim()));
		}

		br.close();

	}
}
