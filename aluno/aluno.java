public class TesteAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "roberta";
		a1.idade = 16;
		a1.nota1 = 0;
		a1.nota2 = 0;
		a1.nota3 = 0;
		a1.notasInseridas = 0;
		
		
		a1.fazAniversario();
		System.out.println("Idade atual agora "+a1.idade);
		System.out.println("Nome: " +a1.nome+ " /Idade: " + a1.idade++);
		a1.fazAniversario();
		a1.fazAniversario();
		System.out.println("Idade atual agora "+a1.idade);
		
		a1.insereNota(8);
		System.out.println("media "+a1.calculaMedia());
		a1.insereNota(10);
		System.out.println("media "+a1.calculaMedia());
		a1.insereNota(4);
		System.out.println("media: "+a1.calculaMedia());
		

		
		
     
	}

}
