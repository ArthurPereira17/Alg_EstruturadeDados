package L06;

public class FilaLista<T> implements Fila {
        private ListaEncadeada lista;
        private NoLista inicio;
        private NoLista fim;
        private int tamanho;
    
        public FilaLista(){
            this.lista = new ListaEncadeada();
            this.inicio = null;
            this.fim = null;
            this.tamanho = 0;
        }

        public void inserir(Object valor){
            lista.inserirNoFinal((T)valor);
        }

        @Override
        public boolean estaVazia(){
            return lista.estaVazia();
        }

        public Object peek(){
            if (estaVazia()) {
                throw new FilaVaziaException("Fila está vazia");
            }
            return lista.getPrimeiro().getInfo();
        }

        public Object retirar(){
            if (estaVazia()) {
                throw new FilaVaziaException("Fila está vazia");
            }
            T valor = (T) peek();
            lista.retirar(valor);
            return valor;
        } 

        public void liberar(){
            while (!estaVazia()) {
                retirar();
            }
        }


}
