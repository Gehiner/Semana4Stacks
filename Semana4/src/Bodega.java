import java.util.*;

public class Bodega {
    private int maxContenedoresPorPila;
    private int maxPilas;
    private ArrayList<Stack<Contenedor>> pilas;

    public Bodega(int maxContenedoresPorPila, int maxPilas) {
        this.maxContenedoresPorPila = maxContenedoresPorPila;
        this.maxPilas = maxPilas;
        this.pilas = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor c) {
        for (Stack<Contenedor> pila : pilas) {
            if (pila.size() < maxContenedoresPorPila) {
                pila.push(c);
                System.out.println("Contenedor agregado a pila existente.");
                return;
            }
        }

        if (pilas.size() < maxPilas) {
            Stack<Contenedor> nuevaPila = new Stack<>();
            nuevaPila.push(c);
            pilas.add(nuevaPila);
            System.out.println("Contenedor agregado en nueva pila.");
        } else {
            System.out.println("No hay espacio para más contenedores.");
        }
    }

    public void retirarContenedor(int id) {
        for (int i = 0; i < pilas.size(); i++) {
            Stack<Contenedor> pila = pilas.get(i);
            Stack<Contenedor> temporal = new Stack<>();
            boolean encontrado = false;

            while (!pila.isEmpty()) {
                Contenedor c = pila.pop();
                if (c.getId() == id) {
                    System.out.println("Contenedor retirado: " + c);
                    encontrado = true;
                    break;
                } else {
                    temporal.push(c);
                }
            }

            if (encontrado) {
                reubicarContenedores(temporal, pila);
                return;
            } else {
                while (!temporal.isEmpty()) {
                    pila.push(temporal.pop());
                }
            }
        }
        System.out.println("Contenedor no encontrado.");
    }

    private void reubicarContenedores(Stack<Contenedor> temporal, Stack<Contenedor> pilaOriginal) {
        while (!temporal.isEmpty()) {
            Contenedor c = temporal.pop();
            boolean colocado = false;

            for (Stack<Contenedor> otraPila : pilas) {
                if (otraPila.size() < maxContenedoresPorPila) {
                    otraPila.push(c);
                    colocado = true;
                    break;
                }
            }

            if (!colocado) {
                System.out.println("No hay espacio para reubicar los contenedores. Se perdieron: " + c);
            }
        }
    }

    public void mostrarBodega() {
        System.out.println("Estado actual de la bodega:");
        for (int i = 0; i < pilas.size(); i++) {
            System.out.println("Pila " + (i + 1) + ": " + pilas.get(i));
        }
    }
}
