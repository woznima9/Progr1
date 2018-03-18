package pl.gwsoft.structure;

public class ListaJednokierunkowa {
    private Node first;

    public void add(Node e) {
        if(first == null) {
            first = e;
        }else {
            first.addNext(e);
        }
    }

    @Override
    public String toString() {
        return "lista: ...";
    }
}
