public class Main {
    static LivroBaseDeDados livroBaseDeDados = new LivroBaseDeDados();
    public static void main(String[] args) {
        DBManager.createDatabase();
        TelaMenuLivro telaMenuLivro = new TelaMenuLivro();
        //TelaMenuUsr telaMenuUsuario = new TelaMenuUsr();
    }
}
