import java.util.ArrayList;
import java.util.List;

// Clase genérica que funciona como un repositorio de datos
public class Repository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}