package main;


//import main.java.RPNCalc;
import junit.framework.TestCase;

public class TestRpn extends TestCase {
	
	public void testRPN1() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(5, calc.calculate("2 3 +"));
		
	}
	
	public void testRPN2() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(55, calc.calculate("22 33 +"));
		
	}
	
	public void testRPN3() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(1, calc.calculate("4 3 -"));
		
	}
	
	public void testRPN4() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(11, calc.calculate("44 33 -"));
		
	}
	
	public void testRPN5() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(6, calc.calculate("3 2 *"));
		
	}
	
	public void testRPN6() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(12, calc.calculate("3 4 *"));
		
	}
	
	public void testRPN7() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(5, calc.calculate("3 4 + 2 -"));
		
	}
	
	public void testRPN8() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(2, calc.calculate("12 6 /"));
		
	}
	
	public void testRPN9() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(3, calc.calculate("9 3 /"));
		
	}
	
	public void testRPN10() {
		RPNCalc calc = new RPNCalc();
		// 9 / 0 = #DIV	
		try{ 
		    calc.calculate("9 0 /");
		    fail("Exception not thrown");
		}catch(Exception e){
		    assertTrue(true);
		}
		//assertEquals(3, calc.calculate("9 0 /"));
		
	}
	public void testRPN11() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(-4, calc.calculate("1 2 3 + -"));
		
	}
	
	public void testRPN12() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(4, calc.calculate("6 2 * 3 /"));
		
	}
	
	public void testRPN13() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(14, calc.calculate("5 1 2 + 4 * + 3 -"));
		
	}
	
	public void testRPN14() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(16, calc.calculate("4 2 ^"));
		
	}
	
	public void testRPN15() {
		RPNCalc calc = new RPNCalc();
		
		assertEquals(27, calc.calculate("3 3 ^"));
		
	}
	
	
	
}
