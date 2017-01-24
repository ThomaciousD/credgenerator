package com.tda.password;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tda.password.LocalPasswordGenerator;
import com.tda.password.PasswordGenerator;

public class LocalPasswordGeneratorTest {

	PasswordGenerator passwordGenerator = new LocalPasswordGenerator();

	@Test
	public void testZeroLength() {
		testValidPassword(passwordGenerator.generatePassword(0), LocalPasswordGenerator.DEFAULT_LENGTH);
	}

	private void testValidPassword(String password, int length) {
		assertNotNull("Password is empty", password);
		assertTrue("Password length do not match", password.length() == length);
	}

}
