package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	public void PrimedGenerated1To10() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		cut.generatePrimes();		
		Long[] expected = {2L, 3L, 5L, 7L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}


	@Test
	public void PrimedGenerated2To10() {
		PrimeGenerator cut = new PrimeGenerator(2, 10);
		cut.generatePrimes();		
		Long[] expected = {2L, 3L, 5L, 7L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}
	
	@Test
	public void PrimedGenerated3To10() {
		PrimeGenerator cut = new PrimeGenerator(3, 10);
		cut.generatePrimes();		
		Long[] expected = {3L, 5L, 7L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}
	
	@Test
	public void PrimedGenerated2To3() {
		PrimeGenerator cut = new PrimeGenerator(2, 3);
		cut.generatePrimes();		
		Long[] expected = {2L, 3L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}
	
	@Test
	public void PrimedGeneratorWith4To10() {
		PrimeGenerator cut = new PrimeGenerator(4, 10);
		cut.generatePrimes();		
		Long[] expected = {5L, 7L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}
	
	@Test
	public void PrimedGeneratorWith8To10ReturnsEmpty() {
		PrimeGenerator cut = new PrimeGenerator(8, 10);
		cut.generatePrimes();		
		Long[] expected = {};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}

	@Test
	public void PrimedGenerator0To10() {
		try {
			PrimeGenerator cut = new PrimeGenerator(0, 10);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 0 + " to=" + 10);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=0 to=10", ex.getMessage());
		}
	}
	 
	@Test
	public void PrimedGenerator10To1() {
		try {
			PrimeGenerator cut = new PrimeGenerator(10, 1);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 10 + " to=" + 1);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=10 to=1", ex.getMessage());
		}
	}
	
	@Test
	public void PrimedGeneratorNegative10To10() {
		try {
			PrimeGenerator cut = new PrimeGenerator(-10, 10);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + -10 + " to=" + 10);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
		}
	}
	
	@Test
	public void PrimedGenerator100To1() {
		try {
			PrimeGenerator cut = new PrimeGenerator(100, 1);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 100 + " to=" + 1);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=100 to=1", ex.getMessage());
		}
	}
	
	@Test
	public void PrimedGenerator0To1() {
		try {
			PrimeGenerator cut = new PrimeGenerator(0, 1);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 0 + " to=" + 1);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=0 to=1", ex.getMessage());
		}
	}	
	
	@Test
	public void PrimedGenerator0To2() {
		try {
			PrimeGenerator cut = new PrimeGenerator(0, 2);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 0 + " to=" + 2);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=0 to=2", ex.getMessage());
		}
	}	
	
	
	@Test
	public void PrimedGenerator1To0() {
		try {
			PrimeGenerator cut = new PrimeGenerator(1, 0);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 1 + " to=" + 0);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=1 to=0", ex.getMessage());
		}
	}	

	
	@Test
	public void PrimedGenerator1To1() {
		try {
			PrimeGenerator cut = new PrimeGenerator(1, 1);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 1 + " to=" + 1);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=1 to=1", ex.getMessage());
		}
	}	
	
	
	@Test
	public void PrimedGenerator16To16() {
		try {
			PrimeGenerator cut = new PrimeGenerator(16, 16);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 16 + " to=" + 16);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=16 to=16", ex.getMessage());
		}
	}	
	
	@Test
	public void PrimedGeneratorNegative16ToNegative163() {
		try {
			PrimeGenerator cut = new PrimeGenerator(-16, -163);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + -16 + " to=" + -163);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=-16 to=-163", ex.getMessage());
		}
	}	
	
	@Test
	public void PrimedGenerator3ToNegative163() {
		try {
			PrimeGenerator cut = new PrimeGenerator(3, -163);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 3 + " to=" + -163);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=3 to=-163", ex.getMessage());
		}
	}
	
	@Test
	public void PrimedGenerator10To45ExceptionToIsLargerThanFrom() {
		try {
			PrimeGenerator cut = new PrimeGenerator(45, 10);
			cut.generatePrimes();	
		fail("Wrong input values: from=" + 45 + " to=" + 10);
		}
		catch(RuntimeException ex) {
		assertEquals("Wrong input values: from=45 to=10", ex.getMessage());
		}
	}
	@Test
	public void PrimedGeneratorWithLongList1To100() {
		PrimeGenerator cut = new PrimeGenerator(1, 100);
		cut.generatePrimes();		
		Long[] expected = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L,
							37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}
	

	//isEven Tests
	@Test
	public void isEven2() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isEven(2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven12() {
		PrimeGenerator cut = new PrimeGenerator(1, 3);
		boolean actual = cut.isEven(12);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven48() {
		PrimeGenerator cut = new PrimeGenerator(1, 50);
		boolean actual = cut.isEven(48);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven336() {
		PrimeGenerator cut = new PrimeGenerator(1, 336);
		boolean actual = cut.isEven(336);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven1() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isEven(1);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven10() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isEven(10);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven8886() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isEven(8886);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven8885() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isEven(8885);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven8887() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isEven(8887);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven8888() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isEven(8888);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isEven0() {
		PrimeGenerator cut = new PrimeGenerator(13, 20);
		boolean actual = cut.isEven(0);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	
	//isPrime Tests
	@Test
	public void isPrime2() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isPrime(2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void isPrime3() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isPrime(3);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void isPrime4() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isPrime(4);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void isPrime5() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isPrime(5);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime12() {
		PrimeGenerator cut = new PrimeGenerator(1, 3);
		boolean actual = cut.isPrime(12);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime48() {
		PrimeGenerator cut = new PrimeGenerator(1, 50);
		boolean actual = cut.isPrime(48);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime336() {
		PrimeGenerator cut = new PrimeGenerator(1, 336);
		boolean actual = cut.isPrime(336);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime1() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isPrime(1);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime10() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		boolean actual = cut.isPrime(10);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime8886() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(8886);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime8885() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(8885);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime8887() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(8887);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime8888() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(8888);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrime0() {
		PrimeGenerator cut = new PrimeGenerator(13, 20);
		boolean actual = cut.isPrime(0);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrimeNegative1() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-1);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeNegative2() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-2);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeNegative3() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-3);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeNegative4() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-4);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeNegative5() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-5);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeNegative7() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-7);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeNegative179() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(-179);
		boolean expected = false;
		assertEquals(expected, actual);
	}		
	
	@Test
	public void isPrime179() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(179);
		boolean expected = true;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrime983() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(983);
		boolean expected = true;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeCantbeEvenexcept2() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(2);
		boolean expected = true;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeCantbeEvenwith8() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(8);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeCantbeEvenwith10() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(10);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrimeCantbeEvenwith946() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(946);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeCantbeEvenwith550() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(550);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith3() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(3);
		boolean expected = true;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith33() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(33);
		boolean expected = false;
		assertEquals(expected, actual);
	}	

	@Test
	public void isPrimeOnlySomeOddsArePrimeWith15() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(15);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith17() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(17);
		boolean expected = true;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith19() {
		PrimeGenerator cut = new PrimeGenerator(1, 2);
		boolean actual = cut.isPrime(19);
		boolean expected = true;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith21() {
		PrimeGenerator cut = new PrimeGenerator(1, 21);
		boolean actual = cut.isPrime(21);
		boolean expected = false;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith653() {
		PrimeGenerator cut = new PrimeGenerator(1, 21);
		boolean actual = cut.isPrime(653);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPrimeOnlySomeOddsArePrimeWith635() {
		PrimeGenerator cut = new PrimeGenerator(1, 21);
		boolean actual = cut.isPrime(635);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	//Math.sqrt Tests
	@Test
	public void Sqrt36() {
		long actual = (long) Math.sqrt(36);
		long expected = 6;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void Sqrt3() {
		long actual = (long) Math.sqrt(3);
		long expected = 1;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void Sqrt4() {
		long actual = (long) Math.sqrt(4);
		long expected = 2;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void Sqrt100() {
		long actual = (long) Math.sqrt(100);
		long expected = 10;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void Sqrt99() {
		long actual = (long) Math.sqrt(99);
		long expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	public void Sqrt25() {
		long actual = (long) Math.sqrt(25);
		long expected = 5;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void Sqrt35() {
		long actual = (long) Math.sqrt(35);
		long expected = 5;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void Sqrt7463() {
		long actual = (long) Math.sqrt(7463);
		long expected = 86;
		assertEquals(expected, actual);
	}	
	
	@Test
	public void generatePrimes1To10() {
		PrimeGenerator cut = new PrimeGenerator(1, 10);
		cut.generatePrimes();		
		Long[] expected = {2L, 3L, 5L, 7L};
		assertArrayEquals(expected, cut.getPrimes().toArray());
	}
	
	
}


