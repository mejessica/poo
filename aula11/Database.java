import java.util.ArrayList;

public class Database{

    static ArrayList<CD> cds = new ArrayList<>();
    static ArrayList<DVD> dvds = new ArrayList<>();

    static void ImprimeLista(ArrayList hehe) {
        for (int i = 0; i <hehe.size(); i++){
            System.out.println(hehe.get(i));
        }
    }
    public static void main (String[] args){
        CD cdzinho = new CD ("ela partiu", "tim maia", 897, "4:32");

        cds.add(cdzinho);
        ImprimeLista(cds);

        DVD dvdzinho = new DVD ("10 cavalos", "Pedro sampaio", 24, "5:24");
        dvds.add(dvdzinho);
        ImprimeLista(dvds);
    }
}
