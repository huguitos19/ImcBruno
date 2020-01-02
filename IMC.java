
public class IMC {
	
	public static void main (String [] args) {
    	
    	System.out.println("Calculando IMC");
    	
    	double altura1 = 1.71;
    	System.out.println("Minha altura é de " + altura1 + " cm");
    	
    	double peso = 112;
    	System.out.println("Meu peso é de " + peso + " kg");
    	    	
    	double altura2 = altura1 * altura1;
    	double imc = peso / altura2;
    	
    	float imcfinal = (float) imc;
    	
        System.out.println("meu imc é de " + imcfinal);
        
        if (imcfinal < 18.5) {        	
        System.out.println("Abaixo do peso");
        	
        }
        	
        if (imcfinal > 18.5 && imc < 24.9) {
        System.out.println("Peso normal");
            
        }
            
        if (imcfinal > 25 && imc < 29.9) {
        System.out.println("Sobrepeso");
            
        }
            
        if (imcfinal > 29.9 && imc < 35) {
        System.out.println("Obesidade grau 1");
            
        }
            
        if (imcfinal > 35 && imc < 39.9) {
        System.out.println("Obesidade grau 2");
            
        }
            
        if (imcfinal > 40) {
        System.out.println("Obesidade grau 3");
                    	
        }   
    }
}
