package engine;

import java.util.Scanner;

import util.MyApplicationUtils;

public class ApplicationStarter {

	private Scanner scanner;
	private String[] args;

	public ApplicationStarter() {
		scanner = new Scanner(System.in);

	}

	public ApplicationStarter(String[] args) {
		this.args = args;
	}

	public boolean start() {
		boolean local = false;
		if (MyApplicationUtils.checkPassword(scanner, args)) {
			local = true;

		}
		return local;
	}

}
