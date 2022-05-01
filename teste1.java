

public class Aluno{

    private String nome;
    private int turma;
    private int nota; 

    public Aluno (String nome, int turma, int nota){
        this.nome=nome;
        this.turma=turma;
        this.nota=nota;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setTurma(int turma){
        this.turma=turma;
    }
    public void setNota(int nota){
        this.nota=nota;
    }
    public int getNome(){
        return this.nome;
    }
    public int getTurma(){
        return this.turma;
    }
    public int getNota(){
        return this.nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + ", turma=" + turma + "]";
    }
}

