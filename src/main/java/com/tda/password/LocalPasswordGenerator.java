package com.tda.password;

import java.util.Random;

public class LocalPasswordGenerator implements PasswordGenerator {

	private static char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
			'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '@', '#', '&', '(', '§', '!',
			')', '{', '}', '[', ']', '$', '*', ';', ':', '/', '?', '.', '=', '+','0','1','2','3','4','5','6','7','8','9' };

	public static int DEFAULT_LENGTH = 18;

	@Override
	public String generatePassword(int length) {
		Random rand = new Random(System.currentTimeMillis());

		int l = (length == 0) ? DEFAULT_LENGTH : length;
		char password[] = new char[l];

		for (int i = 0; i < l; i++) {
			password[i] = ALPHABET[Math.abs(rand.nextInt()) % ALPHABET.length];
		}
		return new String(password);
	}
}
