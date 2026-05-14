package Aulas.Aula_13_05;

public class NoMapa<K, T> {
    private K chave;
    private T valor;

    public K getChave() {
        return chave;
    }
    public void setChave(K chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if (getClass() != obj.getClass())
        return false;
    
    NoMapa other = (NoMapa) obj;
    if (!chave.equals(other.chave))
        return false;
    
    return true;
    }

    @Override
    public int hashCode() {
        return chave.hashCode();
    }
}
