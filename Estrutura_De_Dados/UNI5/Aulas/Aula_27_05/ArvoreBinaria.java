package UNI5.Aulas.Aula_27_05;

import UNI2.Aulas.Aula04_08.NoArvoreBinaria;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        if (no.getInfo().equals(info)) {
            return no;
        }
        NoArvoreBinaria<T> resultado = buscar(no.getEsquerda(), info);
        if (resultado != null) {
            return resultado;
        }
        return buscar(no.getDireita(), info);
    }

    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz){
        super.setRaiz(raiz);
    }
}
