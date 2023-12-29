package Multicode;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		double acumMyRandom = 0;
		for (int i = 0; i < 10000000; i++) {
			
			acumMyRandom = acumMyRandom + (Math.random() - new Random().getRandom());
			//System.out.println(String.format("%.7f",random));
			
		}
		
		System.out.println(acumMyRandom);
		
	}

}


 
