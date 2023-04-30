public class Main {
    public static void main(String[] args) {
        StringBuilder privet =new StringBuilder();
        privet.append("I").append(" ").append("would").append(" ").append("like").append(" ").append("to").append(" ").append("have").append(" ").append("a").append(" ").append("dog");
        String str =privet.toString();
        System.out.println("Uppercase string:" + str.toUpperCase());
    }
}