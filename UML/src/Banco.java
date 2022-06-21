/* Rodrigo
 * Sept 2018
 * BancoUML
 */
public class Banco {
	private int numCuenta;
	private String nomCli;
	private double saldo;
	private static int consecutivo=0001;
	
	public Banco () {
		this.numCuenta=consecutivo;
		consecutivo+=2;
	}
	public Banco(String nom, double sal) {
		this();
		nomCli=nom;
		saldo=sal;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNomCli(String NomCli){
		this.nomCli=nomCli;
	}
	public String getNomCli() {
		return nomCli;
	}
	public double getSaldo() {
		return saldo;
	}
	public String toString(){
		StringBuilder res= new StringBuilder();
		
		res.append("Hola "+nomCli);
		res.append(" Tu número de cuenta es "+numCuenta+"\n");
		res.append(" y cuentas con un saldo de $"+saldo+"\n");
		return res.toString();
	}
	
	public boolean retiro(double cant){
		boolean resp;
		
		resp=false;
		if(cant>0 && saldo>=cant){
			resp=true;
			saldo=saldo-cant;
		}
		return resp;
	}
	public boolean deposito(double cant){
		boolean resp=false;
		
		if(cant>0){
			resp=true;
			saldo= saldo +cant;
		}
		return resp;
	}
	public boolean equals(Banco otro){
		boolean resp=false;;
		
		if(nomCli==otro.nomCli)
			resp=true;
		return resp;
	}
	public int compareTo(Banco otro){
		int resp=1;
		if(numCuenta==otro.numCuenta)
			resp=0;
		else
			if(numCuenta<otro.numCuenta)
				resp=-1;
			
		return resp;
	}
}
