public class CustomException {

    static class YoungerAgeException extends RuntimeException {
        YoungerAgeException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        int age = 10;

        if (age < 18) {
            throw new YoungerAgeException("You are not eligible");
        } else {
            System.out.println("You are eligible");
        }
    }
}