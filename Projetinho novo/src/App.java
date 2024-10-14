public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa arrombado = new Pessoa();
        Pessoa professor =new Pessoa();
        Pessoa Coordenador = new Pessoa();

        arrombado.setNome("Samuel");
        professor.setNome("Leonardo");
        Coordenador.setNome("João Vicente");
        System.out.println("O nome do arrombado é "+arrombado.getNome());
    }
}
