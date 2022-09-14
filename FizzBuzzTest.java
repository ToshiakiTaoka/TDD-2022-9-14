package tddbc;
/*import static org.junit.jupiter.api.assertions.*;
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
	
	private Fizzbuzz fizzbuzz;
	
	@BeforeEach //前処理
	void _準備() {
	//準備
	fizzbuzz = new Fizzbuzz();
	/*void test() {
	//	fail("Not yet implemented");//
	//	fail("Not yet implemented");
		fail("これは失敗するはず。");
	}
//	*/
	}
	@Test
	void _1を渡すと文字列1を返す() throws Exception {
	/*	fail("Not yet implemented");*/
	//	fail("Not yet implemented");
		
		/*
		//準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		//実行
		String actual = fizzbuzz.convert(1);
		//検証
		assertEquals("1",actual);
		
		*/
		
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		//実行&検証
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		assertEquals("1",fizzbuzz.convert(1));
		//assertEquals("2",fizzbuzz.convert(2));
	}
	@Test
	void _2を渡すと文字列2を返す() throws Exception {
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		assertEquals("2",fizzbuzz.convert(2));
	}
	@Test
	void _3を渡すと文字列Fizzを返す() throws Exception {
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		assertEquals("Fizz",fizzbuzz.convert(3));
	}
	@Test
	void _4を渡すと文字列4を返す() throws Exception {
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		assertEquals("4",fizzbuzz.convert(4));
	}
	@Test
	void _5を渡すと文字列Buzzを返す() throws Exception {
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		assertEquals("Buzz",fizzbuzz.convert(5));
	}
	@Test
	void _15を渡すと文字列FizzBuzzを返す() throws Exception {
		//準備
		//Fizzbuzz fizzbuzz = new Fizzbuzz();
		assertEquals("FizzBuzz",fizzbuzz.convert(15));
	}
	
}
