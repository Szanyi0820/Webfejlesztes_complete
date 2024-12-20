package cars;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {

	static String generateLetters( int amount ) {
		String letters = "";
		int n = 'Z' - 'A' + 1;
		for ( int i = 0; i < amount; i++ ) {
			char c = (char) ('A' + Math.random() * n);
			letters += c;
		}
		return letters;
	}

	static String generateDigits( int amount ) {
		String digits = "";
		int n = '9' - '0' + 1;
		for ( int i = 0; i < amount; i++ ) {
			char c = (char) ('0' + Math.random() * n);
			digits += c;
		}
		return digits;
	}

	static String generateLicensePlate( ) {
		String licensePlate;
		String letters;
		String digits = generateDigits( 3 );
		letters = generateLetters( 3 );

		licensePlate = letters + "-" + digits;
		return licensePlate;
	}

	public static Date generateRandomDate( ) {
		long now = System.currentTimeMillis();
		return new Date( ThreadLocalRandom.current()
			.nextLong( 0, now ) );
	}
}
