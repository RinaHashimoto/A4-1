package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
}
