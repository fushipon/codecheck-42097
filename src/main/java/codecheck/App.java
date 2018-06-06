package codecheck;

public class App {
	public static void main(String[] args) {
        System.out.println(args);
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
		}
	}
}
