/* Rodrigo
 * Sept 2018
 * Complejo
 */
public class Complejo {
	private double real,imaginario;
	public Complejo(){
	}
	public Complejo(double real,double imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}
	public double getReal(){
		return real;
	}
	public void setReal(double real){
		this.real=real;
	}
	public double getImaginario(){
		return imaginario;
	}
	public void setImaginario(double imaginario){
		this.imaginario=imaginario;
	}
	public String toString(){
		StringBuilder res= new StringBuilder();
		
		res.append(real+"+"+imaginario+"i");
		return res.toString();
	}
	public int compareTo(Complejo otro) {
		int resp=-1;
		
		if(real==otro.real && imaginario==otro.imaginario)
			resp=0;
		else
			if(real>otro.real && imaginario>otro.imaginario)
				resp=1;
		return resp;
	}
	public boolean equals(Complejo otro){
		boolean resp=false;
		
		if(real==otro.real && imaginario==otro.imaginario)
			resp=true;
		return resp;
	}
}
