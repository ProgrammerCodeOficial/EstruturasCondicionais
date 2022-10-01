/* Caso importante para Switch Case qdo for complementar  */

public class PlanoOperadora {

    public static void main(String[] args) {

        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5Gb YouTube");
            }
            case "M": {
                System.out.println("15Gb + Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("20Gb + 100 minutos de ligação para qualquer operadora");
            }
        }

    }

}
