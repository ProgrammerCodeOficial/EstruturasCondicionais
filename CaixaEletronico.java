/* Estrutura Condicional Simples e Composta (está comentada)*/

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 16.0;

        if (valorSolicitado < saldo)

            saldo = saldo - valorSolicitado;
        System.out.println(saldo);

        /*
         * if (valorSolicitado < saldo) {
         * 
         * saldo = saldo - valorSolicitado;
         * System.out.println("Novo saldo: " + saldo);
         * 
         * } else
         * 
         * System.out.println("Saldo insuficiente");
         */
    }

}
