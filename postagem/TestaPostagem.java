public class TestaPostagem {

	public static void main(String[] args) {
	
		Postagem P = new Postagem("instagram");
		
		P.getConteudo();
		P.getConteudo();
		P.getDataHora();
		
		System.out.println("Postagem " +P.getConteudo());
		System.out.println("horas dela " +P.getDataHora());
	}

}
