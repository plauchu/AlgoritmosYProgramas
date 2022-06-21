/*
 * Rodrigo
 * AutoEstacionamiento
 * Nov 2018
 */
public class Auto implements Comparable<Auto>{
	
	private String marca;
	private int año;
	private String modelo;
	private String placas;
	private String tipo;
	private int numServ;
	private int horaLlegada;
	private final int MAX_SERVICIOS=12;
	private String color;
	private String [] fechasServicios;
	private String [] serviciosRealizados;
	private Persona dueño;
	
	public Auto(String placas) {
		this.placas = placas;
	}
	

	public Auto(String marca, int año, String modelo, String placas, String tipo,String color, int hora) {
		this.marca = marca;
		this.año = año;
		this.placas=placas;
		this.modelo=modelo;
		this.tipo = tipo;
		this.color=color;
		this.horaLlegada=hora;
		this.numServ=numServ;
		fechasServicios= new String [MAX_SERVICIOS];
		serviciosRealizados= new String [MAX_SERVICIOS];
		numServ=0;
	}

	public String getPlacas() {
		return placas;
	}

	public String getMarca() {
		return marca;
	}

	public int getAño() {
		return año;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getColor() {
		return color;
	}

	public int getNumServ() {
		return numServ;
	}
	

	public Persona getDueño() {
		return dueño;
	}

	public int getHoraLlegada() {
		return horaLlegada;
	}

	public String getUnServicio (String mes) {
		String res= "No hubo servicio en ese mes";
		int pos;
		
		pos=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(fechasServicios, fechasServicios.length, mes);
		if(pos!=-1)
			res=serviciosRealizados[pos];
		return res;
	}

	public String getServsPorFecha (String mes) {
		StringBuilder res= new StringBuilder();
		
		for(int i=0;i<numServ;i++)
			if(fechasServicios[i].equalsIgnoreCase(mes))
				res.append(serviciosRealizados[i]+"");
		return res.toString();
	}
	public void altaDueño(String curp, String nombre, String edoCivil, String dir, String tel) {
		 this.dueño=new Persona(curp, nombre, edoCivil, dir, tel);
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean altaServicio(String mes, String servicio) {
		boolean res= false;
		
		if(numServ<MAX_SERVICIOS)
			fechasServicios[numServ]=mes;
			serviciosRealizados[numServ]=servicio;
			numServ++;
			res=true;
			
		return res;
	}
	public boolean existeServicio(String servicio) {
		boolean res=false;
		int pos;
		
		pos=ManejadorArreglosGenericos.busSecOrd(serviciosRealizados, serviciosRealizados.length, servicio);
		if(pos!=-1)
			res=true;
		return res;
	}
	
	public String toString() {
		StringBuilder res= new StringBuilder ();
		
		res.append("\nDueño: "+dueño);
		res.append("\nMarca: "+marca);
		res.append("\nAño: "+año);
		res.append("\nModelo: "+modelo);
		res.append("\nPlacas: "+placas);
		res.append("\nTipo: "+tipo);
		res.append("\nNúmero de servicios: "+numServ);
		for(int i=0;i<numServ;i++) {
			res.append("\nFechas servicios: "+fechasServicios[i]);
			res.append("\n");
			res.append("Servicios Realizados: "+serviciosRealizados[i]);
		}
		return res.toString();
	}
	public int compareTo(Auto otro) {
		return this.placas.compareTo(otro.placas);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (placas == null) {
			if (other.placas != null)
				return false;
		} else if (!placas.equals(other.placas))
			return false;
		return true;
	}
	
	
	

}
