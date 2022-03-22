public class TestarCarro {
	
	public static void main(String[] args) {
		
		Carro car = new Carro("Suv");
		
		
		car.liga();
		
		car.desliga();
		
		car.liga();
		car.isLigado();
		
		
		car.upMarcha();
		System.out.println("Você está na marcha " +car.getMarchaAtual());
		
		car.acelera(30);
		car.acelera(30);
		System.out.println("sua velocidade atual é " +car.getVelocidade());
		
		car.upMarcha();
		car.upMarcha();
		System.out.println("Você está na marcha " +car.getMarchaAtual());
		
		car.downMarcha();
		System.out.println("Você está na marcha " +car.getMarchaAtual());
		
		car.freia(20);
		System.out.println("sua velocidade atual é " +car.getVelocidade());
	
		
	}
	
}
