void main() {
Scanner input = new Scanner(System.in);
    System.out.printf("Digite seu salário atual: R$ ");
    double salario = input.nextDouble();


    System.out.print("Digite qual a porcentagem de aumento: ");
    double porcentagem = input.nextDouble();

double novoSalario = salario + (salario * porcentagem / 100);
    System.out.print("Seu novo salário é de: R$ " + novoSalario);

}