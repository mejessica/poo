import java.time.LocalDate;

public class DoseAplicada {

	// atributos
	private final String fabricante;
	private final LocalDate dataAplicacao;

	// construtores
	public DoseAplicada(String fabricante, LocalDate dataAplicacao) {
		this.fabricante = fabricante;
		this.dataAplicacao = dataAplicacao;

	}

	// metodos
	public String getFabricante() {
		return this.fabricante;
	}

	public LocalDate getDataAplicacao() {
		return this.dataAplicacao;
	}

	@Override

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o.getClass().isInstance(this)))
			return false;
		if (this == o)
			return true;

		DoseAplicada param = (DoseAplicada) o;
		return (this.fabricante == param.fabricante && this.dataAplicacao.equals(param.dataAplicacao));

	}
}
