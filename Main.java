import java.util.Scanner; // Aqui estou importando a classe Scanner, que já existe no java e serve para ler dados digitados pelo usuário,sem isso o java não reconhece o Scanner. 

public class Main {

    public static void main(String[] args) // Método principal do java. O java procura esse método para iniciar o programa.
    {
        Scanner tela = new Scanner(System.in); //criando o scanner. (System.in) significa entrada do usuario

        System.out.println("=== CALCULADORA ===");

            System.out.println("Digite o primeiro número: ");
                 double n1 = tela.nextDouble(); // next\double é o metodo da classe Scanner, serve para ler um número decimal digitado pelo usuário ou numero inteiro

            System.out.println("Digite o segundo número");     
                 double n2 = tela.nextDouble(); 

        System.out.println("\nEscolha a operação:");   // Mostrar as operações 
        System.out.println("+");      
        System.out.println("-");      
        System.out.println("*");      
        System.out.println("/");    
        
        System.out.println("Operação: ");
            String op = tela.next(); //Criando uma variavel do tipo string, pois +-*/ são Strings, e mostro que o valor digitado vai para a variavel op. chamo meu scanner pra isso que nomeei de Tela. next() é um metodo que lê uma palavra até espaco ou enter. no caso esperamos + ou - ou * ou / e digitamos enter. por isso ele alí

            Operacao operacao = null; // Criando uma variavel do tipo da interface. Ela ainda não guarda nenhum objeto, por isso null.

            switch(op){
                case "+":
                    operacao = new Soma();
                    break;

                case "-":
                    operacao = new Subtracao();
                    break;

                case "*":
                    operacao = new Multiplicacao();
                    break;
                    
                case "/":
                    operacao = new Divisao();
                    break;
                    
                default:
                    System.out.println("Operação inválida.");  
                        tela.close(); // fecha o scanner. é boa pratica para liberar recurso da memoria
                            return;  // encerra o metodo principal

                        }
                
                double resultado = operacao.calcular(n1,n2);
                
                System.out.println("Resultado: " + resultado);

                tela.close();



        



    }
    
}
