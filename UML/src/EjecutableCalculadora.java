/* Rodrigo
 * Sept 2018
 * EjecutableCalculadora
 */
public class EjecutableCalculadora {

	public static void main(String[] args) {
		boolean res;
		String resp;
		int respu;
		double r;
		
		res=Calculadora.estaOrdenCreciente(5, 10);
		System.out.println(res);
		respu=Calculadora.factorial(5);
		System.out.println(respu);
		r=Calculadora.calculaFuncion1(2);
		System.out.println(r);
		r=Calculadora.calculaFuncion2(3);
		System.out.println(r);
		r=Calculadora.calculaFuncion3(3, 2);
		System.out.println(r);
		resp=Calculadora.fibonacci(8);
		System.out.println(resp);
		resp=Calculadora.ullman(5);
		System.out.println(resp);
		respu=Calculadora.multiplica(3, 3);
		System.out.println(respu);
		respu=Calculadora.potencia(2, 3);
		System.out.println(respu);
		resp=Calculadora.CubosNicomaco(5);
		System.out.println(resp);
		respu=Calculadora.calculaMCD(10, 2);
		System.out.println(respu);
		r=Calculadora.calculaSerie2(5, 3);
		System.out.println(r);
		r=Calculadora.calculaSerie3(4);
		System.out.println(r);
		res=Calculadora.div11(111);
		System.out.println(res);
	}
}
