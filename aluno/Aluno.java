public class Aluno {
	
	String nome;
	int idade;
	int nota1;
	int nota2;
	int nota3;
	int notasInseridas;
	
	void fazAniversario() {
		this.idade++;
	}
	void insereNota (int nota) {
		if(this.notasInseridas == 0) {
			this.nota1 = nota;
			this.notasInseridas++;
		} else if(this.notasInseridas == 1) {
			this.nota2 = nota;
			this.notasInseridas++;
		} else if(this.notasInseridas == 2) {
			this.nota3 = nota;
			this.notasInseridas++;
		}
 	}
	double calculaMedia() {
		return (this.nota1 + this.nota2 + this.nota3) / (double) this.notasInseridas;
	
	}

}
