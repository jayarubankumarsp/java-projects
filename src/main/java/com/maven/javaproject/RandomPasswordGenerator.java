package com.maven.javaproject;

import java.util.Random;

/**
 * RandomPasswordGenerator - generates password of length 10 characters that
 * includes at least one character from Capital Case Letters, Lower Case
 * Letters, Numbers and Special Characters
 */
public class RandomPasswordGenerator {
	public static void main(String[] args) {
		// Variable that sets the length of the password
		int pwdlength = 10;
		System.out.printf("Generated Password:\n");

		// Method call to display the generated password to the users
		System.out.println(generateRandomPassword(pwdlength));
	}

	// Method to generate random password of length 10 characters
	private static char[] generateRandomPassword(int length) {
		// String variable to initiate Capital (Upper) Case Alphabets
		String capitalAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// String variable to initiate Lower Case Alphabets
		String lowerCaseAlphabets = "abcdefghijklmnopqrsuvwxxyz";

		// String variable to initiate numbers
		String numbers = "0123456789";

		// String variable to initiate Special Characters
		String specialCharacters = " !\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~";

		// String to concatenate all four literals that includes Capital case Alphabets,
		// Lower case Alphabets, Numbers and Special Characters
		String randomString = capitalAlphabets + lowerCaseAlphabets + numbers + specialCharacters;

		// Object to Random Class
		Random random = new Random();

		// Character array variable with desired length
		char[] password = new char[length];

		// Random generation of Capital case Alphabets, Lower case Alphabets, Numbers
		// and Special Characters
		password[0] = capitalAlphabets.charAt(random.nextInt(capitalAlphabets.length()));
		password[1] = lowerCaseAlphabets.charAt(random.nextInt(lowerCaseAlphabets.length()));
		password[2] = numbers.charAt(random.nextInt(numbers.length()));
		password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

		// For loop to build random password characters bases on character positions
		for (int i = 4; i < length; i++) {
			password[i] = randomString.charAt(random.nextInt(randomString.length()));

		}
		// For loop to shuffle generated password characters
		for (int i = password.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));
			double temp = password[i];
			password[i] = password[j];
			password[j] = (char) temp;
		}

		// Return the shuffled password to the caller
		return password;

	}
}
