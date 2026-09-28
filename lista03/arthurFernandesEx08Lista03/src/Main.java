void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a quantidade de doações: ");
    int quantidade = input.nextInt();

    double total = 0;
    double maior = 0;
    double menor = 0;

    for (int i = 1; i <= quantidade; i++) {

        System.out.print("Digite o valor da doação " + i + ": R$ ");
        double valor = input.nextDouble();

        total = total + valor;

        if (i == 1) {
            maior = valor;
            menor = valor;
        } else {

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }
    }

    System.out.println("--- Resultado ---");
    System.out.println("Total arrecadado: R$ " + total);
    System.out.println("Maior doação: R$ " + maior);
    System.out.println("Menor doação: R$ " + menor);

    
}
}