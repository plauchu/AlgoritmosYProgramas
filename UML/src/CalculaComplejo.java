/* Rodrigo
 * Sept 2018
 * CalculaComplejo
 */
public class CalculaComplejo {
	private Complejo num1,num2;
	
	public CalculaComplejo(){
	}
	public CalculaComplejo(Complejo num1, Complejo num2){
		this.num1=num1;
		this.num2=num2;
	}
	public Complejo getNum1(){
		return num1;
	}
	public void setNum1(Complejo num1){
		this.num1=num1;
	}
	public Complejo getNum2(){
		return num2;
	}
	public void setNum2(Complejo num2){
		this.num2=num2;
	}
	public Complejo suma(){
		Complejo res;
		double real,imaginario;
		
		real=num1.getReal()+num2.getReal();
		imaginario=num1.getImaginario()+num2.getImaginario();
		res=new Complejo(real,imaginario);
		return res;
	}
	public Complejo resta(){
		Complejo res;
		double real,imaginario;
		
		real=num1.getReal()-num2.getReal();
		imaginario=num1.getImaginario()-num2.getImaginario();
		res=new Complejo(real,imaginario);
		return res;
	}
	public Complejo multiplicacion(){
		Complejo res;
		double real,imaginario;
		
		real=(num1.getReal()*num2.getReal())-(num1.getImaginario()*num2.getImaginario());
		imaginario=(num1.getReal()*num2.getImaginario())+(num1.getImaginario()*num2.getReal());
		res=new Complejo(real,imaginario);
		return res;
	}
	public Complejo division(){
		Complejo res;
		double real,imaginario, div=(Math.pow(num2.getReal(), 2))+(Math.pow(num2.getImaginario(), 2));
		
		if (div==0)
			res=null;
		else{
			real=((num1.getReal()*num2.getReal())+(num1.getImaginario()*num2.getImaginario()))/div;
			imaginario=((num1.getImaginario()*num2.getReal())-(num1.getReal()*num2.getImaginario()))/div;	
			res=new Complejo(real,imaginario);
		}
		return res;
	}
}
