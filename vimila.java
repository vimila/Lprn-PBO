/**
 * 
 */
package vimila;

/**
 * @author vimila
 *
 */
public class vimila {

	/**
	 * @param args
	 */
	static String Praktikum = "Tugas 1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Laporan 1");
		test();
		biodata();
		penjumlahan();
		pengurangan();
		perkalian();
		pembagian();
		
		
	}
	public static void test()
	{
		System.out.println(Praktikum);
	}
	//pemanggilan biodata
	public static void biodata()
	
	{
		String nama ="Vimila Muntihana";
		String nim  ="60200112088";
		String matakuliah ="PBO";
		String jurusan ="Tekhnik Informatika";
		System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah + "\njurusan "+":"+jurusan);
	}
	//penjumlahan
	public static void penjumlahan()
	{
		int i =23;
		int j =20;
		System.out.print("hasil penjumlahan "  +i + "+" + j + "=");
		System.out.print(i+j);
		
	}
	//pengurangan
	public static void pengurangan()
	{
		int l =16;
		int k =30;
		System.out.print("\nhasil pengurangan "  +l+ "-" +k+ "=");
		System.out.print(l-k);
		
		
	}
	//perkalian
		public static void perkalian()
		{
			int m =34;
			int n =11;
			System.out.print("\nhasil perkalian "  +m+ "*" +n+ "=");
			System.out.print(m*n);
			
			
		}
		//pembagian
		public static void pembagian()
		{
			float g =68;
			float h =20;
			System.out.print("\nhasil pembagian " +g+ "/" +h+ "=");
			System.out.print(g/h);
			
			
		}
}
