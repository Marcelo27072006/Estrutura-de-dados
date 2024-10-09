public class dados {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionarInicio("Emily");
        lista.dados();

        lista.adicionarFim(" Yago ");
        lista.dados();

        lista.removerNo("Yago");
        lista.dados();
    }
}
