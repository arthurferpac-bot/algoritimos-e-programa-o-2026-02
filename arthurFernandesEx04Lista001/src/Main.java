void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor: R$ ");
  // double comando parecido com int, só que  para números que possuem casa decimais
    double valor = input.nextDouble();

    double desconto = valor * 0.10;
    double valorFinal = valor - desconto;


    System.out.print("Valor com 10% de desconto: R$ "+ valorFinal);

}