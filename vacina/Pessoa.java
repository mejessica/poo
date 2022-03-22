import java.time.LocalDate;

public class Pessoa {
	// atributos

	private final String nome;
	private int idade;
	private boolean grupoPrioritario;
	private DoseAplicada primeiraDose;
	private DoseAplicada segundaDose;

	// construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		if (this.idade > 59) {
			this.grupoPrioritario = true;
		}
		this.primeiraDose = null;
		this.segundaDose = null;
	}

	// metodos

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public DoseAplicada getPrimeiraDose() {
		return this.primeiraDose;
	}

	public DoseAplicada getSegundaDose() {
		return this.segundaDose;
	}

	public boolean isGrupoPrioritario() {
		return this.grupoPrioritario;
	}

	public void setGrupoPrioritario(boolean prioridade) {
		if (idade < 60)
			this.grupoPrioritario = prioridade;
	}

	public boolean vacina(String fabricante, LocalDate data) {

		if (getPrimeiraDose() != null && getSegundaDose() != null) {
			return false;
		} else if (getPrimeiraDose() != null && getPrimeiraDose().getFabricante().equals("Janssen")) {
			return false;
		} else if (getPrimeiraDose() != null && fabricante.equals("Janssen"))
			return false;

		else {
			if (primeiraDose == null) {
				this.primeiraDose = new DoseAplicada(fabricante, data);
			} else if (segundaDose == null)
				this.segundaDose = new DoseAplicada(fabricante, data);

		}
		return true;
	}

	public boolean vacina(String fabricante) {
		return this.vacina(fabricante, LocalDate.now());
	}

	// toString

	@Override
	public String toString() {
		if (primeiraDose != null && segundaDose == null) {
			return String.format("%s (%d anos) - vacina covid: dose 1: " + this.primeiraDose.getFabricante(), 
					this.nome,this.idade);
		}
		if (primeiraDose != null && segundaDose != null) {
			return String.format("%s (%d anos) - vacina covid: dose 1: " + this.primeiraDose.getFabricante()
					+ ", dose 2: " + this.segundaDose.getFabricante(), this.nome, this.idade);
		}
		return String.format("%s (%d anos) - vacina covid: não vacinado", this.nome, this.idade);
	}

