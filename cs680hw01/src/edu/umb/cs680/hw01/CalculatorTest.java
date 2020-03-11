package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	//multiply Tests
	@Test
	public void multiply3By4() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3, 4);
		float expected = 12;
		assertEquals(expected, actual);
	}

	@Test
	public void multiply0By0() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(0, 0);
		float expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply3By0() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3, 0);
		float expected = 0;
		assertEquals(expected, actual);
	}

	
	@Test
	public void multiply1By1() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(1, 1);
		float expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply7By1() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(7, 1);
		float expected = 7;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply6ByNegative1() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(6, -1);
		float expected = -6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply1ByNegative1() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(1, -1);
		float expected = -1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyNegative1ByNegative1() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(-1, -1);
		float expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply5By3() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(5, 3);
		float expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	public void multiply20By2() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(20, 2);
		float expected = 40;
		assertEquals(expected, actual);
	}

	@Test
	public void multiply4By2() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(4, 2);
		float expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply3Point5By7() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3.5f, 7f);
		float expected = 24.5f;
		assertEquals(expected, actual);
	}

	@Test
	public void multiply10Point20By13Point55() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(10.20f, 13.55f);
		float expected = 138.21f;
		assertEquals(expected, actual);
	}

	@Test
	public void multiply5Point0By6() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(5.0f, 6f);
		float expected = 30.0f;
		assertEquals(expected, actual);
	}

	@Test
	public void multiply9Point0By9Point0() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(9.0f, 9.0f);
		float expected = 81.0f;
		assertEquals(expected, actual);
	}
	
	//doesn't work with 3.01*5.01
	@Test
	public void multiply3Point01By5Point01() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3.01f, 5.10f);
		float expected = 15.351f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyThirtyMillionByTwoQuadrillion() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(30000000f, 2000000000000000f);
		float expected = 6.0E22f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply1500Point15By3Thousand() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(1500.15f, 3000);
		float expected = 4500450f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyNegative20ThousandBy4Thousand() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(-20000, 4000);
		float expected = -8.0E7f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyNegative20ThousandByNegative10Thousan() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(-20000, -10000);
		float expected = 2.0E8f;
		assertEquals(expected, actual);
	}

	@Test
	public void multiplyNegative1234ByNegative12350() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(-1234, -12350);
		float expected = 1.52399E7f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyNegative1234Point1ByNegative12350() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(-1234.1f, -12350);
		float expected = 1.5241135E7f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiply3By4ThenMultiplyResultBy5() {
		Calculator cut = new Calculator();
		float result = cut.multiply(3, 4);
		float actual = cut.multiply(result, 5);
		float expected = 60;
		assertEquals(expected, actual);
	}

	@Test
	public void multiplyNegavtive10By4ThenMultiplyResultBy3() {
		Calculator cut = new Calculator();
		float result = cut.multiply(-10, 4);
		float actual = cut.multiply(result, 3);
		float expected = -120;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyNegavtive2ByNegative2ThenMultiplyResultByNegative3() {
		Calculator cut = new Calculator();
		float result = cut.multiply(-2, -2);
		float actual = cut.multiply(result, -3);
		float expected = -12;
		assertEquals(expected, actual);
	}

	//DIVIDE TESTS
	@Test
	public void divide3By4() {
		Calculator cut = new Calculator();
		float actual = cut.divide(3, 4);
		float expected = 0.75f;
		assertEquals(expected, actual);
	}

	@Test
	public void divide1By1() {
		Calculator cut = new Calculator();
		float actual = cut.divide(1, 1);
		float expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divide0By3() {
		Calculator cut = new Calculator();
		float actual = cut.divide(0, 3);
		float expected = 0;
		assertEquals(expected, actual);
  }
	
	@Test
	public void divide3By0() {
		Calculator cut = new Calculator();
		try {
		 cut.divide(3, 0);
		fail("Division by zero");
		}
		catch(IllegalArgumentException ex) {
		assertEquals("division by zero", ex.getMessage());
		}
	}
	
	
	@Test
	public void divide0By0() {
		Calculator cut = new Calculator();
		try {
		 cut.divide(0, 0);
		fail("Division by zero");
		}
		catch(IllegalArgumentException ex) {
		assertEquals("division by zero", ex.getMessage());
		}
	}
	
	@Test
	public void divideNegative1By0() {
		Calculator cut = new Calculator();
		try {
		 cut.divide(-1, 0);
		fail("Division by zero");
		}
		catch(IllegalArgumentException ex) {
		assertEquals("division by zero", ex.getMessage());
		}
	}

	@Test
	public void divide7By1() {
	    Calculator cut = new Calculator();
	    float actual = cut.divide(7, 1);
	    float expected = 7;
	    assertEquals(expected, actual);
	}

	@Test
	public void divide6ByNegative1() {
	    Calculator cut = new Calculator();
	    float actual = cut.divide(6, -1);
	    float expected = -6;
	    assertEquals(expected, actual);
	}
	
	@Test
	public void divide6Point0By6() {
	    Calculator cut = new Calculator();
	    float actual = cut.divide(6.0f, 6);
	    float expected = 1;
	    assertEquals(expected, actual);
	}

	@Test
	public void divide1ByNegative1() {
	    Calculator cut = new Calculator();
	    float actual = cut.divide(1, -1);
	    float expected = -1;
	    assertEquals(expected, actual);
	}

	@Test
	public void divideNegative1By1() {
	    Calculator cut = new Calculator();
	    float actual = cut.divide(-1, 1);
	    float expected = -1;
	    assertEquals(expected, actual);
	}
	
	@Test
	public void divideNegative1ByNegative1() {
	    Calculator cut = new Calculator();
	    float actual = cut.divide(-1, -1);
	    float expected = 1;
	    assertEquals(expected, actual);
	}

	@Test
	public void divide15By3() {
		Calculator cut = new Calculator();
		float actual = cut.divide(15, 3);
		float expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void divide20By2() {
		Calculator cut = new Calculator();
		float actual = cut.divide(20, 2);
		float expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void divide4By2() {
		Calculator cut = new Calculator();
		float actual = cut.divide(4, 2);
		float expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void divide2By4() {
		Calculator cut = new Calculator();
		float actual = cut.divide(2, 4);
		float expected = 0.5f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divide3Point5By7() {
		Calculator cut = new Calculator();
		float actual = cut.divide(3.5f, 7);
		float expected = 0.5f;
		assertEquals(expected, actual);
	}

	@Test
	public void divide10Point20By13Point55() {
		Calculator cut = new Calculator();
		float actual = cut.divide(10.20f, 13.55f);
		float expected = 0.7527675277f;
		assertEquals(expected, actual);
	}

	@Test
	public void divide20Point0By4() {
		Calculator cut = new Calculator();
		float actual = cut.divide(20.0f, 4);
		float expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void divide9Point0By9Point0() {
		Calculator cut = new Calculator();
		float actual = cut.divide(9.0f, 9.0f);
		float expected = 1.0f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divide3Point01By5Point01() {
		Calculator cut = new Calculator();
		float actual = cut.divide(3.01f, 5.01f);
		float expected = 0.60079837f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divideThirtyMillionByTwoQuadrillion() {
		Calculator cut = new Calculator();
		float actual = cut.divide(30000000f, 2000000000000000f);
		float expected = 1.5E-8f;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divide1500Point15By3Thousand() {
		Calculator cut = new Calculator();
		float actual = cut.divide(1500.15f, 3000);
		float expected = 0.50005f;
		assertEquals(expected, actual);
	}

	@Test
	public void divideNegative20ThousandBy4Thousand() {
		Calculator cut = new Calculator();
		float actual = cut.divide(-20000, 4000);
		float expected = -5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divideNegative20ThousandByNegative10Thousan() {
		Calculator cut = new Calculator();
		float actual = cut.divide(-20000, -10000);
		float expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divideNegative1ThousanByNegative20Thousand() {
		Calculator cut = new Calculator();
		float actual = cut.divide(-1000, -20000);
		float expected = 0.05f;
		assertEquals(expected, actual);
	}

	@Test
	public void divideNegative1234ByNegative12350() {
		Calculator cut = new Calculator();
		float actual = cut.divide(-1234, -12350);
		float expected = 0.0999190283f;
		assertEquals(expected, actual);
	}

	@Test
	public void divide3By4ThenDivideResultBy5() {
	    Calculator cut = new Calculator();
	    float result = cut.divide(3, 4);
	    float actual = cut.divide(result, 5);
	    float expected = 0.15f;
	    assertEquals(expected, actual);
	}

	@Test
	public void divideNegavtive10By4ThenDivideResultBy3() {
	    Calculator cut = new Calculator();
	    float result = cut.divide(-10, 4);
	    float actual = cut.divide(result, 3);
	    float expected = -0.83333333333333f;
	    assertEquals(expected, actual);
	}

	@Test
	public void divideNegavtive2ByNegative2ThenDivideResultByNegative3() {
	    Calculator cut = new Calculator();
	    float result = cut.divide(-2, -2);
	    float actual = cut.divide(result, -5);
	    float expected = -0.2f;
	    assertEquals(expected, actual);
	}


	@Test
	public void multiply5By4ThenDivideResultBy4() {
	    Calculator cut = new Calculator();
	    float result = cut.multiply(5, 4);
	    float actual = cut.divide(result, 4);
	    float expected = 5;
	    assertEquals(expected, actual);
	}

	@Test
	public void divide20By5ThenMultiplyResultBy3() {
	    Calculator cut = new Calculator();
	    float result = cut.divide(20, 5);
	    float actual = cut.multiply(result, 3);
	    float expected = 12;
	    assertEquals(expected, actual);
	}
	
	@Test
	public void divide0By3ThenMultiplyResultBy3() {
	    Calculator cut = new Calculator();
	    float result = cut.divide(0, 3);
	    float actual = cut.multiply(result, 3);
	    float expected = 0;
	    assertEquals(expected, actual);
	}
	
	@Test
	public void divide1ByNegative1ThenMultiplyResultBy1() {
	    Calculator cut = new Calculator();
	    float result = cut.divide(1, -1);
	    float actual = cut.multiply(result, 1);
	    float expected = -1;
	    assertEquals(expected, actual);
	}
	
	@Test
	public void divide0By0ThenMultiplyResultBy0() {
		Calculator cut = new Calculator();
		try {
		    float result = cut.divide(0, 0);
		    cut.multiply(result, 0);
		fail("Division by zero");
		}
		catch(IllegalArgumentException ex) {
		assertEquals("division by zero", ex.getMessage());
		}
	}
	//nested
	@Test
	public void multiply26By0ThenDivideResultBy2() {
	    Calculator cut = new Calculator();
	    float result = cut.multiply(26, 0);
	    float actual = cut.divide(result, 2);
	    float expected = 0;
	    assertEquals(expected, actual);
	}
	
	@Test
	public void multiply8ByNegative62ThenDivideResultBy6() {
	    Calculator cut = new Calculator();
	    float result = cut.multiply(8, 62);
	    float actual = cut.divide(result, 6);
	    float expected = 82.666664f;
	    assertEquals(expected, actual);
	}
	
	//combination
	@Test
	public void multiply1ByNegative2ThenDivideResultByNegative1() {
	    Calculator cut = new Calculator();
	    float result = cut.multiply(1, -2);
	    float actual = cut.divide(result, -1);
	    float expected = 2;
	    assertEquals(expected, actual);
	}
}
