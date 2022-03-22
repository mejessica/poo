public class Carro {

	private String nome;
	private int marcha;
	private int marchaAtual;
	private int velocMax;
	private double velocidade;
	private boolean ligado;
	
	
	public Carro() {
		this.ligado=false;
		this.velocidade=0;
	
	}
	
	public Carro(String nome) {
		this();
		this.nome=nome;
	}
	
	public Carro(String nome, int marcha, int marchaAtual, int velocMax) {
		this(nome);
		this.velocMax=velocMax;
		this.marchaAtual=marchaAtual;
		this.marcha=marcha;
		
	}	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public double getVelocidade() {
		return this.velocidade;
	}
	
	public int getVelocMax() {
		return this.velocMax;
	}
	
	public void setVeloMax(int velocMax) {
		if(velocMax>0) this.velocMax =velocMax;
	}
	
	public int getMarchaAtual() {
		return this.marchaAtual;
	}
	
	public int setMarchaAtual() {
		return this.marchaAtual;
	}
	
	public int getMarcha() {
		return this.marcha;
	}
	
	public int setMarcha() {
		return this.marcha;
	}
	
	public double setVelocidade() {
		return this.velocidade;
	}
	
	
	
	public void upMarcha() {
		if(this.marcha<=5) {
			this.marchaAtual += 1;
			this.velocMax = this.velocMax += 20;
			
		}
	}
	
	public void downMarcha() {
		if(this.marcha>=0) {
			this.marchaAtual -= 1;
			this.velocMax = this.velocMax -= 20;
		}
	}	
		
		
	public boolean isLigado() {
		if(this.ligado == true && this.marcha == 0);
		return true;
		
	}
	
		public void liga() {
			if(this.ligado == false && this.marcha == 0) this.ligado = true;
			System.out.println("O carro está ligado\n");
		  }
		
		public void desliga() {
			if(this.ligado == true)this.ligado = false;
			System.out.println("O carro foi desligado\n");
		}
		
		public void acelera(double vel) {
		if(this.ligado == true && this.marcha == 0) {
			if(this.velocidade + vel > this.velocMax) this.velocidade = this.velocMax;
			else this.velocidade = this.velocidade + vel;
		}
		else System.out.println("Ligue o carro");
		}

		
		public void freia(double fre) {
			if(this.ligado == true && this.marcha == 0) {
				this.velocidade -= fre;
				if(this.velocidade - fre < 0) this.velocidade = 0;
			}
			else System.out.println("o carro está parado");
		}
		
	}
		
	
