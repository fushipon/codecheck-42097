package codecheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
	public static void main(String[] args) throws IOException {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			String apiUrl = "/api/hash";
			URL connectUrl = new URL(apiUrl);
			HttpURLConnection con = (HttpURLConnection)connectUrl.openConnection();
			con.setRequestMethod("GET");
			con.setDoOutput(true);
			con.setInstanceFollowRedirects(true);

			System.out.println("レスポンスヘッダ:");
			System.out.println("レスポンスコード[" + con.getResponseCode() + "] " +
			"レスポンスメッセージ[" + con.getResponseMessage() + "]");
		}
	}
}
