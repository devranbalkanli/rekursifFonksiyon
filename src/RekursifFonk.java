
public class RekursifFonk {
	
	static int f(int x) {
		
		if(x==1) {
			return 1;
		}
		 return x*f(x-1);
	}
	
	public static void main(String []args) {
		
		System.out.println(f(5));
		
		/* 5 i yazd�rmak i�in 5*f(4) yapacak sonra f(4) � bilmedi�in i�in tekrar kendini
		 * �a��r�p 4*f(3) yapacak sonra bu sefer de 3 i�in �a��r�p daha sonra 2 i�in ve 
		 * en son 1 i�in �a��r�p 1 in de�erini bildi�i i�in a�a��dan yukar�ya do�ru hesaplay�p 
		 * sonucu bulup yazd�r�yor
		 */
		
		
	}

}
