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
}
