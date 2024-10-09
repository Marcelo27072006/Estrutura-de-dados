public class ListaEncadeada<T> {
    private No<T> cabeça;

    private static class No<T> {
        T no;
        No<T> proximoNo;

        No(T no) {
            this.no = no;
            this.proximoNo = null;
        }
    }

    public ListaEncadeada() {
        cabeça = null;
    }

    public void adicionarInicio(T no) {
        No<T> novoNo = new No<>(no);
        novoNo.proximoNo = cabeça;
        cabeça = novoNo;
    }

    public void adicionarFim(T no) {
        No<T> novoNo = new No<>(no);
        if (cabeça == null) {
            cabeça = novoNo;
        } else {
            No<T> noAtual = cabeça;
            while (noAtual.proximoNo != null) {
                noAtual = noAtual.proximoNo;
            }
            noAtual.proximoNo = novoNo;
        }
    }

    public boolean removerNo(T no) {
        if (cabeça == null) return false;

        if (cabeça.no.equals(no)) {
            cabeça = cabeça.proximoNo;
            return true;
        }

        No<T> noAtual = cabeça;
        No<T> noAnterior = null;

        while (noAtual != null && !noAtual.no.equals(no)) {
            noAnterior = noAtual;
            noAtual = noAtual.proximoNo;
        }

        if (noAtual != null) {
            noAnterior.proximoNo = noAtual.proximoNo;
            return true;
        }

        return false;
    }

    public boolean contem(T no) {
        No<T> noAtual = cabeça;
        while (noAtual != null) {
            if (noAtual.no.equals(no)) {
                return true;
            }
            noAtual = noAtual.proximoNo;
        }
        return false;
    }

    public void dados() {
        No<T> noAtual = cabeça;
        while (noAtual != null) {
            System.out.print(noAtual.no);
            noAtual = noAtual.proximoNo;
        }
        System.out.println(" null ");
    }
}