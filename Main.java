
public class Main {
    public static void main(String[] args){
        Arquivo<Movie> filmesArq;
        try {
            System.out.println("Teste de Arquivo de Filmes");
            filmesArq = new Arquivo<>("filmes.db", Movie.class.getConstructor());
            Movie primeiro = new Movie(-1, "testeGRANDE", "testeGRANDE", 2000);
            Movie segundo = new Movie(-1, "testeMed", "testeMed", 2000);
            Movie segundo2 = new Movie(2, "testeMedAA", "testeMedAA", 2000);
            Movie terceiro = new Movie(-1, "teste", "teste", 2000);

            filmesArq.create(primeiro);
            filmesArq.create(segundo);
            filmesArq.create(terceiro);
            filmesArq.delete(1);
            filmesArq.update(segundo2);

            filmesArq.listar();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
