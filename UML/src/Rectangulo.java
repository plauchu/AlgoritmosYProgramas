/* Rodrigo
 * Sept 2018
 * Rectángulo
 */
public class Rectangulo {
	private double largo;
	private double ancho;
	
	public Rectangulo() {
	}
	
	public Rectangulo(double largo, double ancho) {
		this.largo=largo;
		this.ancho=ancho;
	}
	
	public void setLargo(double largo) {
		this.largo=largo;
	}
	
	public double getLargo() {
		return largo;
	}
	public void setAncho(double ancho) {
		this.ancho=ancho;
	}
	
	public double getAncho() {
		return ancho;
	}
	public double area(){
		double a;
		a=largo*ancho;
		return a;
	}
	
	public double perimetro(){
		double p;
		p=2*largo+2*ancho;
		return p;
	}
	
	public boolean equals(Rectangulo otroRectangulo) {
		boolean resp;
		if (largo == otroRectangulo.getLargo() && ancho== otroRectangulo.getAncho())
			resp=true;
		else
		resp=false;
		return resp;
		}
	public int compareTo(Rectangulo otroRectangulo) {
		int resp;
		if (largo== otroRectangulo.getLargo() &&
		ancho== otroRectangulo.getAncho())
		resp=0;
		else
		if (largo> otroRectangulo.getLargo() &&
		ancho> otroRectangulo.getAncho())
		resp=1;
		else
		resp=-1;
		return resp;
		}
		public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Rectangulo con:\n");
		sb.append(" Ancho "+ancho+"\n");
		sb.append(" Largo "+largo+"\n");
		return sb.toString();
		}	
}
