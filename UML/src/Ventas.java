/* Rodrigo
 * Sept 2018
 * VentasUML
 */
public class Ventas {
	private double precio;
	private String nombre;
	
	public Ventas() {	
	}
	
	public Ventas(double precio, String nombre) {
		this.precio=precio;
		this.nombre=nombre;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public String getNombre(){
		return nombre;
	}
	public String toString(){
		return ("\nVendedor: "+nombre+" vendió: $"+precio);
	}
	public double comision() {
		double com;
		if (precio<1000) 
			com= precio*0.03;
		else
			com= precio*0.05;
		return com;	
	}
	
}
