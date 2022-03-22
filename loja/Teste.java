public class Teste {
	public static void main(String[] args) {

		Shopping sp = new Shopping("Pre porte te", "NO seu coração");
		
		Loja lj = new Loja("Balengiaca", "Roby", "Roupas", 50);
		Loja gc = new Loja ("Gucci", "harold", "sapatos", 28);

		System.out.println(lj.getNome().equals("Balengiaca"));
		System.out.println(lj.getProprietario().equals("Roby"));
		System.out.println(lj.getLojaTipo().equals("Roupas"));
		System.out.println(lj.getNumero() == 50);
		System.out.println(lj.toString());
		
		System.out.println(gc.getNome().equals("Gucci"));
		System.out.println(gc.getProprietario().equals("harold"));
		System.out.println(gc.getLojaTipo().equals("sapatos"));
		System.out.println(gc.getNumero() == 28);
		System.out.println(gc.toString());

		System.out.println(sp.getNome().equals("Pre porte te"));
		sp.setNome("balenciaga");
		System.out.println(sp.getNome().equals("balenciaga"));
		System.out.println(sp.getEndereco().equals("NO seu coração"));
		sp.setEndereco("frança");
		System.out.println(sp.getEndereco().equals("frança"));
		sp.addLoja(lj);
		System.out.println(sp.getTotalLojas().equals("Número de lojas: 1"));
		sp.addLoja(gc);
		System.out.println(sp.getTotalLojas().equals("Número de lojas: 2"));
		sp.removeLojaD(lj);
		System.out.println(sp.getTotalLojas().equals("Número de lojas: 1"));
	}
}
