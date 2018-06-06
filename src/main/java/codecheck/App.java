package codecheck;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class App {
	public static void main(String[] args) throws IOException {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			try {
				URL url = new
				           URL("/api/hash");
				HttpsURLConnection urlConn = (HttpsURLConnection) url.openConnection();
				urlConn.setRequestMethod("GET");
				java.io.InputStream ist = urlConn.getInputStream();
			} catch (MalformedURLException e) {
				System.out.println(e);
			}
		}
	}
}
