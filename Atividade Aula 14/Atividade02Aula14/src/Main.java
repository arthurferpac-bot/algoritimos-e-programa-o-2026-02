void main() {
    Scanner input = new Scanner(System.in);
    double somaSalarios = 0;
    int somaFilhos = 0;
    double maiorSalario = 0;
    int contador = 0;
    int contadorAteMinimo = 0;
    double salarioMinimo = 1621.0;


    while (true) {

        System.out.println("Qual Seu salario: ");
        double salario = input.nextDouble();

        System.out.println("Quantos filhos voce tem? ");
        int filhos = input.nextInt();

        somaSalarios += salario;
        somaFilhos += filhos;
        contador++;


        if (salario > maiorSalario) {
            maiorSalario = salario;
        }
        if (salario <= salarioMinimo){
            contadorAteMinimo++;
        }
        System.out.println("===MENU===");
        System.out.println("Deseja continuar?");
        System.out.println("Digite 1 para continuar");
        System.out.println("Digite 2 para sair.");
        int opcao = input.nextInt();

        if (opcao != 1) {
            System.out.println("Saindo...");
            break;
        }
    }

    double mediaSalario = somaSalarios / contador;
    double mediaFilhos = (double) somaFilhos / contador;
    double percentual = (contadorAteMinimo * 100.0) / contador;

    System.out.println("A media do salario é " + mediaSalario);
    System.out.println("A media de filhos é " + mediaFilhos);
    System.out.println("O maior salario é " + maiorSalario);
    System.out.println("Percentual com salario de ate 1 salario minimo: " + percentual + "%");
}
