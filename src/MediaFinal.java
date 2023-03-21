public class MediaFinal {
    public static void main(String [] args) {
        int media = 6;

        System.out.println(calcularMedia(media));


    }

    public static String calcularMedia(int media){
        String result="";

        if (media < 6){
            result = "reprovado";
        } else if (media == 6){
            result = "PROVA MINERVA";
        }else if (media > 6){
            result = "APROVADO";
        }

        return "Resultado do aluno".concat(" ").concat(result);
    }
}
