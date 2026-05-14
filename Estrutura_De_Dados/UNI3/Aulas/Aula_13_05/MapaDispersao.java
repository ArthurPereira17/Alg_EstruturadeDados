package Aulas.Aula_13_05;

public class MapaDispersao<K, T> {

    private ListaEncadeada<NoMapa<K, T>>[] info;
    private int quantidade;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
        quantidade = 0;
    }

    private int calcularHash(K chave) {
        return Math.abs(chave.hashCode()) % info.length;
    }

    public void inserir(K chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<K, T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);

        info[indice].inserir(noMapa);
        quantidade++;
    }

    public void remover(K chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<K, T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<K, T>> no = info[indice].buscar(noMapa);

            if (no != null) {
                info[indice].retirar(noMapa);
                quantidade--;
            }
        }
    }

    public T buscar(K chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<K, T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<K, T>> no = info[indice].buscar(noMapa);

            if (no != null) {
                return no.getInfo().getValor();
            }
        }

        return null;
    }

    public double fatorCarga() {
        return (double) quantidade / info.length;
    }
}