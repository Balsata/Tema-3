public class Control {

    public static void main(String[] args) {

        String[] nombres = {"Alex", "Jose", "David", "Alan"};

        for (String name : nombres) {
            String join = name.concat(" ");
            System.out.printf(join);
        }
    }
}
