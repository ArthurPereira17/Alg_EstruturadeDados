package UNI5.ListaExercicios.L12;
public abstract class BuscaAbstract<T> {
    private T[] info;

    public BuscaAbstract(){
        this.info = null;
    }

    public T[] getInfo() {
        return info;
    }
    public void setInfo(T[] info) {
        this.info = info;
    }

    public abstract int buscar(T valor);
}
