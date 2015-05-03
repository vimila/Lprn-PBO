/**
 * 
 */
package vimila;

/**
 * @author Fajri
 *
 */
public class laporan {
	static boolean bool;
	static byte by;
	static float f;
	static String \u0073\u0074\u0072 = "Praktikum nilai default dan Unicode Nita";
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				if (str == null) {		
					System.out.println("nilai default boolean " + bool);	
					System.out.println("nilai default Byte " + by);
					System.out.println("nilai default Float " + f);
					System.out.println(str);
					
				}
				else {
					Boolean refBoolean = new Boolean(true);
					boolean bool = refBoolean.booleanValue();		
					System.out.println("bool " + bool);
					
					Byte refByte = new Byte((byte) 123);
					byte b = refByte.byteValue();		
					System.out.println("Byte " + b);
					
					Float refFloat = new Float(12.3F);
					float f = refFloat.floatValue();
					System.out.println("Float " + f);
					
					System.out.println(str);
					
				}		
			}
		

	}


