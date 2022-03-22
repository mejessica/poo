public class TesteLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Os segredos da mente milionária", 175,0);
		Livro livro2 = new Livro("aham aham", 50,0);
		String titulo1 = new String("teste");
		String titulo2 = new String("teste");
		
		System.out.println("Lendo...");
		 
		System.out.println("teste livro equals:"+livro1.equals(livro2));
		System.out.println("teste pessoa equals null:"+livro2.equals(null));
		System.out.println("teste pessoa ==:"+(livro2==livro1));
		
		System.out.println("teste string equals:"+titulo1.equals(titulo2));
		System.out.println("teste string ==:"+(titulo1 == titulo2));
		
	} 
}
  
                              
