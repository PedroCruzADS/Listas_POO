package cdg;

import java.util.Scanner;

public class scan {
	private Scanner scanner;
	
	public scan() {
		this.scanner = new Scanner(System.in);
	}
	
	public int opcao() {
		int op = scanner.nextInt();
		return op;
	}
	
	public String texto() {
		String t = scanner.nextLine();
		return t;
	}
	
	@Override
	protected void finalize() throws Throwable{
		scanner.close();
	}

}
