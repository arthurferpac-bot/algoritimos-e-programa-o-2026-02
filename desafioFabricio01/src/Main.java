void main() {
Scanner input = new Scanner(System.in);
 double valor;
 double porcentagem;

 System.out.print("Valor da conta: R$ ");
    valor = input.nextDouble();
    System.out.print("Taxa de serviço, 15% do valor da conta");
    double valorPorcentagem = valor + (valor * 15/100);

    System.out.print("Valor total: R$ " + valorPorcentagem);















}