/* Rodrigo
 * Sept 2018
 * PersonaUML
 */
public class Persona {
	private int numPac;
	private String nom;
	private String apMat;
	private String apPat;
	private int edad;
	private String sexo;
	private double peso;
	private double estatura;
	private int nivAct;
	
	public Persona(int numPac){
		this.numPac=numPac;
	}
	public Persona(int numPac,String nom, String apMat, String apPat, int edad, String sexo, double peso, double estatura, int nivAct) {
		this.numPac=numPac;
		this.nom=nom;
		this.apMat=apMat;
		this.apPat=apPat;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=peso;
		this.estatura=estatura;
		this.nivAct=nivAct;
	}
		
	public int getNumPac() {
		return numPac;	
	}
	public String getNom() {
		return nom;	
	}
	public String getApMat() {
		return apMat;	
	}
	public String getApPat() {
		return apPat;	
	}
	public int getEdad() {
		return edad;	
	}
	public void setEdad(int edad) {
		this.sexo=sexo;
	}
	public double getPeso() {
		return peso;	
	}
	public void setPeso(double peso) {
		this.peso=peso;
	}
	public double getEstatura() {
		return estatura;	
	}
	public int getNivAct() {
		return nivAct;	
	}
	public int calculaIMC(double peso) {
		int resp;
		double imc;
		
		imc=peso/(Math.pow(estatura,2));
		if(imc<20)
			resp=-1;
		else
			if(imc<=25)
				resp=0;
		else
			resp=1;
		return resp;
	}
	public boolean esMayorDeEdad(int edad) {
		boolean resp=true;
		
		if(edad<18)
			resp=false;
		return resp;
	}
	public String recomendar(int calculaIMC, int nivAct) {
		StringBuilder res= new StringBuilder();
		
		if(calculaIMC==1 && nivAct<=2)
			res.append("Debes aumentar tu actividad física");
		else
			if(calculaIMC==1 && nivAct>2)
				res.append("Debes cambiar tu alimentación");
		else
			if(calculaIMC==-1)
			res.append("Debes cambiar tu alimentación");
		else
			res.append("Continúa así");
		return res.toString();
	}
	
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Hola " +nom);
		res.append(" " +apMat);
		res.append(" " +apPat);
		res.append(", de " +edad+ " años de edad");
		res.append(", de sexo " +sexo);
		res.append(", con un peso de " +peso+ "Kg");
		res.append(", de estatura " +estatura+ "m");
		res.append(" y con nivel de actividad física " +nivAct);
		return res.toString();
	}
	public int compareTo(Persona otro){
		int resp;
		if(numPac==otro.numPac)
			resp=0;
		else
			if(numPac<otro.numPac)
				resp=-1;
			else
				resp=1;
		return resp;
	}
	public boolean equals(Persona otro){
		boolean resp=false;
		
		if(numPac==otro.numPac)
			resp=true;
		return resp;
	}
}