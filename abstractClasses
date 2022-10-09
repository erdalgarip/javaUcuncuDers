//GameCalculator

public abstract class GameCalculator {
	
	public abstract void  hesapla(); 
	

	
	public final void gameOver(int tip) {
		System.out.println("Oyun Bitti ");
	}

	
}


//KidsGameCalculator
public class KidsGameCalculator extends GameCalculator {

	@Override
	public void hesapla() {
	
		
	}

}


//ManGameCalculator
public abstract class ManGameCalculator extends GameCalculator {

	public void hesapla(int tip) {
		System.out.println("Puanınız : 80 ");
	}
}


//WomanGameCalculator
public abstract class WomanGameCalculator extends GameCalculator {
	public void hesapla(int tip) {
		System.out.println("Puanınız : 60 ");
	}
}


//Main
public class Main {

	public static void main(String[] args) {

		//		WomanGameCalculator womanGameCalculator = new  WomanGameCalculator();
		//		WomanGameCalculator.hesapla(6);
		//		WomanGameCalculator.gameOver(5);
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	
		
		
		

	}

}
