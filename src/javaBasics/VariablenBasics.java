package javaBasics;

public class VariablenBasics {

	public static void main(String[] args) {
		
		boolean wahr_oder_falsch;
		wahr_oder_falsch = true;
		System.out.println(wahr_oder_falsch);
		
		wahr_oder_falsch = false;
		System.out.println(wahr_oder_falsch);
		System.out.println("");
		
		// short - 2Byte
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("");
		
		//byte

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("");
		
		//int - 4 byte
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("");
		
		// long
		long grosse_zahl = 123456789;
		System.out.println(grosse_zahl);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println("");
		
		// float
		float kkz = 123.321F; // F ... Float
		System.out.println(kkz);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println("");
		
		// double
		double gkz1 = 123456789.987654321;
		System.out.println(gkz1);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println("");
		
		//char
		char ein_zeichen = 'c';
		System.out.println(ein_zeichen);
		System.out.println("");
		// char mit zwei zeichen geht nicht
		
		// String
		String text = "String";
		System.out.println(text);			
				
	}
	

}
