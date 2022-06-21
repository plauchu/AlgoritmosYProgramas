/* Rodrigo
 * Sept 2018
 * Círculos
 */
public class Circulo {
	private double radio;
	
	public Circulo() {
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
		return radio;
	}
	public double area(){
		double a;
		a= Math.PI*Math.pow(radio, 2);
		return a;
	}
	public double circunferencia(){
		double c;
		c= Math.PI* radio*2;
		return c;
	}
	public String toString(){
		StringBuilder cad;
		cad= new StringBuilder();
		cad.append("Círuclo con radio: "+radio);
		return cad.toString();
	}
	public boolean compareTo(Circulo otro) {
		boolean res;
		
		if(this.radio==otro.radio)
			res=true;
		else
			res=false;
			
		return res;
	}
	public boolean equals(Circulo otro) {
		boolean resp;
		if (radio == otro.getRadio())
			resp=true;
		else
		resp=false;
		return resp;
		}
}
