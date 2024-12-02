public class App {
    public static void main(String[] args) {
        //Clase genérica Repository
        Repository<User> userRepository = new Repository<>();

        //Agregar elementos
        userRepository.add(new User(1, "Maria"));
        userRepository.add(new User(2, "Jose"));

        //Listar elementos
        System.out.println("Usuarios:");
        userRepository.getAll().forEach(System.out::println);

        //Clase genérica Pair
        Pair<Integer, String> pair = new Pair<>(1, "Un ejemplo");
        System.out.println("\nPair:");
        System.out.println(pair);
    }
}