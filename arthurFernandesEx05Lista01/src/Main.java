void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite sua altura em metros: ");
    double altura = input.nextDouble();

    System.out.print("Digite seu peso em Kg: ");
    double peso = input.nextDouble();

    double imc = peso / (altura * altura);
    System.out.printf("Seu IMC é: " + imc);

}



