
public class Main {
    public static void main(String[] args){
        Arquivo<Movie> filmesArq;
        try {
            System.out.println("Teste de Arquivo de Filmes");
            System.out.println("--------------------------");
            filmesArq = new Arquivo<>("filmes.db", Movie.class.getConstructor());
            Movie muitoGrande = new Movie(-1, "testeMuitoGrande", "testeMuitoGrande", 2000);
            Movie grande = new Movie(-1, "testeGrande", "testeGrande", 2000);
            Movie medio = new Movie(-1, "testeMed", "testeMed", 2000);
            Movie medio_atualizado = new Movie(3, "testeMedAA", "testeMedAA", 2000);
            Movie pequeno = new Movie(-1, "teste", "teste", 2000);
            Movie menorGrande = new Movie(-1, "testeGrand", "testGrand", 2000);

            // Exemplificação da otimização de espaço

            filmesArq.create(muitoGrande); // Criando um filme com título e diretor com tamanho muito grande
            filmesArq.create(grande); // Criando um filme com título e diretor com tamanho grande
            filmesArq.create(medio); // Criando um filme com título e diretor com tamanho médio
            filmesArq.create(pequeno); // Criando um filme com título e diretor com tamanho pequeno
            System.out.println("Primeiro teste - Criação");
            System.out.println("");
            filmesArq.listar();
            

            filmesArq.delete(1); // Deletando o filme com título e diretor com tamanho muito grande
            filmesArq.update(medio_atualizado); // Atualizando o filme com título e diretor com tamanho médio para um tamanho maior que o médio mas menor que o muito grande

            System.out.println("Segundo teste - Deleção do muito grande e Atualização do médio para um de tamanho maior que o médio mas menor que o muito grande.");
            System.out.println("");
            filmesArq.listar();
            
            filmesArq.delete(2); // Deletando o filme com título e diretor com tamanho pequeno
            filmesArq.create(menorGrande); // Criando um filme com título e diretor com tamanho menor que o grande que foi deletado
            
            System.out.println("Terceiro teste - Deleção do grande e Criação de um menor que o grande.");
            System.out.println("");
            filmesArq.listar();
            filmesArq.clear(); // Limpar o arquivo para realizar o teste novamente.
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
