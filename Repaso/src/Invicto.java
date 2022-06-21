/*
 * Rodrigo
 * Dec2018
 * EsInvito
 */
public class Invicto {
	
	public static boolean esInvicto(boolean [] a) {
		boolean res= false;
		int i=0;
		
		while(i<a.length && a[i]) {
			i++;
			if(i==a.length) {
				res=true;
			}

		
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		boolean[] a= {true, true, true, true, true, true};
		boolean[] b= {true, true, false, true, true, true};
		boolean[] c= {false, true, false, true, true, true};
		boolean[] d= {false, true, false, true, true, false};
		
		System.out.println(esInvicto(a));
		System.out.println(a.length);
	}
}
