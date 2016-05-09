package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		//capitalize
		String ec = scu.capitalize("");
		System.out.println("capitalize(\"\") -> " + ec);
		
		String a = scu.capitalize("a");
		System.out.println("capitalize(\"a\") -> " + a);
		
		String xyz = scu.capitalize("xyz");
		System.out.println("capitalize(\"xyz\") -> " + xyz);
		
		//uncapitalize
		String eu = scu.uncapitalize("");
		System.out.println("uncapitalize(\"\") -> " + eu);
		
		String A = scu.uncapitalize("A");
		System.out.println("uncapitalize(\"A\") -> " + A);
		
		String Xyz = scu.uncapitalize("Xyz");
		System.out.println("uncapitalize(\"Xyz\") -> " + Xyz);
		
		//snakeToCamel
		String abc = scu.snakeToCamelcase("abc");
		System.out.println("snakeToCamelcase(\"abc\") -> " + abc);

		String abc_def = scu.snakeToCamelcase("abc_def");
		System.out.println("snakeToCamelcase(\"abc_def\") -> " + abc_def);
		
		String abc_def_gh = scu.snakeToCamelcase("abc_def_gh");
		System.out.println("snakeToCamelcase(\"abc_def_gh\") -> " + abc_def_gh);
		
		String abc__def___gh = scu.snakeToCamelcase("abc__def___gh");
		System.out.println("snakeToCamelcase(\"abc__def___gh\") -> " + abc__def___gh);

		String _abc_def__ = scu.snakeToCamelcase("_abc_def__");
		System.out.println("snakeToCamelcase(\"_abc_def__\") -> " + _abc_def__);
		
		//camelToSnake
		String Abc = scu.camelToSnakecase("Abc");
		System.out.println("camelToSnakecase(\"Abc\") -> " + Abc);

		String AbcDef = scu.camelToSnakecase("AbcDef");
		System.out.println("camelToSnakecase(\"AbcDef\") -> " + AbcDef);
		
		String AbcDefGh = scu.camelToSnakecase("AbcDefGh");
		System.out.println("camelToSnakecase(\"AbcDefGh\") -> " + AbcDefGh);
	}

}
