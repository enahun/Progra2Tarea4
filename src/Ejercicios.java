import java.util.ArrayList;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
}

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try //Inicio de bloque try para captura de errores
		{
			return a/b; //captura error aritmetico 
		}
		catch(Exception e) //Tratamiento que se le da a la posible excepcion
		{
			System.out.println("Operacion indefinida");
		}
		return 0; //retorna 0
		
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		try //Inicio de bloque try para captura de errores
		{
		return arreglo[pos];//captura error en posicion del arreglo
		}
		catch(Exception e)  //Tratamiento que se le da a la posible excepcion
		{
			System.out.println("Fuera de posicion del arreglo");
		}
		return 0; //retorna 0
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try //Inicio de bloque try para captura de errores
		{
			return mi_clase.x; //Captura de la clase tipo null
		}
		catch(NullPointerException e)    //se investigo la excepcion NullPointerException en: http://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html
		{                                										//Tratamiento que se le da a la posible excepcion
			System.out.println("Clase null"); 
		}
		return 0; //retorna 0
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	//Uso de referencias para el uso de Arraylist
	//http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html
	//http://www.coderanch.com/t/436596/java/java/Calculate-average-ArrayList
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		int promedio=0; //inicializacion variable promedio 
		for(int i=0;i<mi_lista.size();i++) //ciclo que recorre las posiciones del arreglo
		{
			promedio += mi_lista.get(i); //Suma los valores de cada posicion del arreglo
		}
		return promedio/mi_lista.size(); //calcula la suma del variable promedio entre el tamaño del arreglo
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	
	//Referencia: 	http://stackoverflow.com/questions/20585702/find-smallest-integer-value-in-array-list-in-java-without-arrays-sort
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		int menor=Integer.MAX_VALUE; //Inicializa variable menor como el numero mayor
	
		for(int i=1;i<mi_lista.size();i++) //Inicio de ciclo para recorrer el arreglo
		{
			if(menor > mi_lista.get(i)) //Compara variable menor con el valor en la posicion i
			{
				menor=mi_lista.get(i);  //asigna el valor a la variable menor
			
			}
			
		}
		
		return menor; //retorna la variable menor
	}
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
		int tmp=0; //inicializa la variable tmp
		for(int i=0;i<mi_lista.size();i++) //Inicio de ciclo que recorre el areglo
		{
			if(str==mi_lista.get(i)) //Compara si el String str es igual al valor de la posicion i del arreglo
			{
				tmp++; //suma 1 a la variable tmp cada vez que encuentra el mismo valor
			}
		}
		
		return tmp; //retorna la variable tmp
	}
	
	public static void main(String[] args)
	{ 
	}

}
