public class Pilha {
    private Listaligada lista;

    public Pilha(){
        this.lista = new Listaligada();
    }

    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }

    public void remover(){
        this.lista.remover(this.get());
    }

    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
