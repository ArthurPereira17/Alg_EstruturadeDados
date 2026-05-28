package UNI5.Aulas.Aula_27_05;

import UNI2.Aulas.Aula04_08.NoArvoreBinaria;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinaria<T> {

    public void inserir(T info) {
        NoArvoreBinaria<T> novoNo = new NoArvoreBinaria<>(info);
        if (estaVazia()) {
            setRaiz(novoNo);
        } else {
            inserir(getRaiz(), novoNo);
        }
    }

    private void inserir(NoArvoreBinaria<T> atual, NoArvoreBinaria<T> novo){
        
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }

}
