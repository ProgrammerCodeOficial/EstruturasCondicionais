<h1 align="center"> 📚 Introdução e Estruturas Condicionais com Java </h1>

<p> As estruturas condicionais possibilitam ao programa tomar decisões
e alterar o seu fluxo de execução de acordo com diferentes situações,
como os valores de variáveis</p></br>

<h2> 🟣 Estruturas condicionais </h2>

<p>
  
  - if e else
  
  - switch case
</p></br>

> <h3> ◽ Estrutura condicional Simples </h3>

<p> A estrutura condicional de decisão simples serve para escolher um comando para execução, caso a condição for verdadeira. </p>

```shell

public class CaixaEletronicoSimples {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 16.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println(saldo);
    }
 }
```

> <h3> ◽ Estrutura condicional Composta  </h3>

<p> A estrutura condicional composta serve para escolher um comando para execução, caso a condição for verdadeira ou falsa</p>

```shell

public class CaixaEletronicoComposto {
    public static void main(String[] args) {
    
      double saldo = 25.0;
      double valorSolicitado = 16.0;
    
      if (valorSolicitado < saldo) {
         saldo = saldo - valorSolicitado;
         System.out.println("Novo saldo: " + saldo);
         } else
         System.out.println("Saldo insuficiente");
    }
}
```

> <h3> ◽ Estrutura condicional Encadeada </h3>

<p> O desvio condicional encadeado (ou aninhado) é usado quando é necessário verificar 
condições sucessivas onde uma ação será executada se um conjunto anterior de ações for
satisfeito. Ou seja, permite executar testes lógicos para decidir qual ação será tomada 
na sequência</p>

```shell

public class ResultadoEscolarEncadeada {
    public static void main(String[] args) {

        int nota = 4;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) // true or false
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
    }
}
```



     

> <h3> ◽ Estrutura condicional Ternário </h3>

<p> É uma expressão (composta de 3 expressões: a condição, a expressão a ser calculada se a condição for verdadeira, 
e a expressão a ser calculada se a condição for falsa. e um "break" não é uma expressão e sim um comando.
</p>

```shell

public class ResultadoEscolarTernario {

    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }

}

```

> <h3> ◽ Switch Case </h3>

<p> É uma estrutura de decisão usada quando precisamos testar condições para determinar qual função será executada em seguinda. Permite substituir múltiplos 
"if else if", tornando o cófigo mais simples, legível e fácil de manter.</p>

```shell
public class SistemadeMedida {
    public static void main(String[] args) {
        String sigla = "H";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
```

</br>


<h2> 🤝 Contribuindo </h2>

<p>
Este repositório foi criado para fins de estudo. Fique a vontade para contribuir!
    
Se te ajudei de alguma forma, ficarei feliz em saber. 😜
    
Caso você conheça alguém que se identifique com esse conteúdo, não deixe de compartilhar.
</br></br>

> <h4>Se possível:</h4>
- ⭐️ Dê Star para o projeto
- 🐛 Encontrar e relatar issues
</p>

---

Disponibilizado 😜 por [Diego Moura dos Santos](https://www.linkedin.com/in/diegomouradossantos/).

