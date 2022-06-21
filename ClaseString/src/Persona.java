import java.util.Calendar;
import java.util.GregorianCalendar;
/*
 *  ClaseStringPersona
 *  Oct2018
 */
public class Persona {
	private String nombre;
	private String edoCivil;
	private String dir;
	private String tel;
	private String curp;
	private char genero;
	private String lugarNac;
	private final int AHO_ACTUAL=2018;
	
	public Persona(String curp) {
		this.curp=curp;
		lugarNac=curp.substring(11,13).toUpperCase();
		genero= curp.charAt(10);
		
	}
	public Persona(String curp, String nombre, String edoCivil, String dir, String tel) {
		this(curp);
		this.nombre=nombre;
		this.edoCivil=edoCivil;
		this.dir=dir;
		this.tel=tel;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdoCivil() {
		return edoCivil;
	}
	public void setEdoCivil(String edoCivil) {
		this.edoCivil = edoCivil;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCurp() {
		return curp;
	}
	public char getGenero() {
		return genero;
	}
	public int calculaEdad() {
		int ahos;
		int ahoNac, mes, dia;
		int diaHoy, mesHoy;
		String ahoNacStr, mesStr, diaStr;
		Calendar cale= new GregorianCalendar();
		
		ahoNacStr=curp.substring(4,6);
		mesStr=curp.substring(6,8);
		diaStr=curp.substring(8,10);
		
		ahoNac=Integer.parseInt(ahoNacStr);
		if(ahoNac>=18)
			ahoNac+=1900;
		else
			ahoNac+=2000;
		mes=Integer.parseInt(mesStr);
		dia=Integer.parseInt(diaStr);
		
		mesHoy=cale.get(Calendar.MONTH);
		diaHoy=cale.get(Calendar.DAY_OF_MONTH);
		ahos=AHO_ACTUAL-ahoNac;
		if(mesHoy<mes || diaHoy<dia)
			ahos--;
		
		return ahos;
	}
	public int compareTo(Persona otra) {
		return this.curp.compareTo(otra.curp);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		return true;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Curp: "+curp);
		res.append("\nNombre: "+nombre);
		res.append("\nDirección: "+dir);
		res.append("\nTeléfono: "+tel);
		res.append("\nEstado Civil: "+edoCivil);
		res.append("\nGénero: "+genero);
		res.append("\nNacido en: "+lugarNac);
		
		
		return res.toString();
	}
	
	

}
