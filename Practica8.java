
public class P8 {

	public static void main(String[] args){
	
	double numAzar;
	
	
	numAzar = (double) Math.random()*100;
	
	System.out.println("El numero aleataorio es: "+numAzar);
	
	
	
	
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println(numAzar--);
	}

	numAzar = numAzar +11;
	
	if (numAzar % 2 == 0) {
		System.out.println(" El numero  par es: "+numAzar);
	
		}	
	}
	
}
