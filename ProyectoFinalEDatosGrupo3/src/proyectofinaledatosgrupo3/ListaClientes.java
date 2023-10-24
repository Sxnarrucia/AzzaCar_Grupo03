package proyectofinaledatosgrupo3;

public class ListaClientes {

    private NodoClientes cabeza;

    public ListaClientes() {
        this.cabeza = null;
    }

    public void inserta(Cliente cDato) {
        //Crear el nuevo nodo a insertar
        NodoClientes nuevo = new NodoClientes(cDato);

        if (cabeza == null) {
            //Lista es vacia
            cabeza = nuevo;

        } else if (cDato.getIdCliente() <= cabeza.getDato().getIdCliente()) {
            //Lista el dato menor o igual a la cabeza
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;

        } else if (cabeza.getSiguiente() == null) {
            //La lista solo tiene un elemento
            cabeza.setSiguiente(nuevo);

        } else {
            //para todos los casos que no se cumpla el if y else if
            NodoClientes aux = this.cabeza;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getIdCliente() < cDato.getIdCliente()) {

                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);

        }
    }

    public boolean existe(int cId) {
        if (cabeza == null) {
            return false;
        } else if (cabeza.getDato().getIdCliente() == cId) {
            return true;
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getIdCliente() <= cId) {
                aux = aux.getSiguiente();
            }
            if (aux.getDato().getIdCliente() == cId) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void modifica(Cliente cliente) {
        if (cabeza.getDato().getIdCliente() == cliente.getIdCliente()) {
            NodoClientes aux = cabeza;
            aux.setDato(cliente);
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getIdCliente() <= cliente.getIdCliente()) {
                aux = aux.getSiguiente();
            }
            if (aux.getDato().getIdCliente() == cliente.getIdCliente()) {
                aux.setDato(cliente);
            } else {
                System.out.println("No existe");
            }
        }
    }

    public void elimina(int id) {
        if (cabeza.getDato().getIdCliente() == id) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente().getDato().getIdCliente() != id) {
                aux = aux.getSiguiente();
            }
            NodoClientes siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }
    }

    @Override
    public String toString() {
        String r = "";
        NodoClientes aux = cabeza;
        while (aux != null) {
            r += aux.toString() + "\n";
            aux = aux.getSiguiente();
        }
        return r;
    }
}
