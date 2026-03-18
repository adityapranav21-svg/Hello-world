public class UC3 {
    public static void main(String[] args) {
        String userName;

        if (args.length > 0) {
            userName = args[0];
        } else {
            userName = "World";
        }

        System.out.println("Hello " + userName + "!");
    }
}