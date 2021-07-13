
public class RekursifFonk {
	
	static int f(int x) {
		
		if(x==1) {
			return 1;
		}
		 return x*f(x-1);
	}
	
	public static void main(String []args) {
		
		System.out.println(f(5));
		
		/* 5 i yazdýrmak için 5*f(4) yapacak sonra f(4) ü bilmediðin için tekrar kendini
		 * çaðýrýp 4*f(3) yapacak sonra bu sefer de 3 için çaðýrýp daha sonra 2 için ve 
		 * en son 1 için çaðýrýp 1 in deðerini bildiði için aþaðýdan yukarýya doðru hesaplayýp 
		 * sonucu bulup yazdýrýyor
		 */
		
		
	}

}
