package Aulas.Aula_06_05;
public class MapaDispersao<T> {

    private ListaEncadeada<NoMapa<T>>[] info;
    private int quantidade;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
        quantidade = 0;
    }

    private int calcularHash(int chave) {
        return chave % info.length;
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);

        info[indice].inserir(noMapa);
        quantidade++;
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);

            if (no != null) {
                info[indice].retirar(noMapa);
                quantidade--;
            }
        }
    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);

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