public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Silva";

        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}