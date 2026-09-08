void main() {
    Scanner input = new Scanner(System.in);

    int n1;
    int n2;
    int n3;

    System.out.print("Digite o primeiro número:");
    n1 = input.nextInt();

    System.out.print("Digite o segundo número:");
    n2 = input.nextInt();

    System.out.print("Digite o terceiro número:");
    n3 = input.nextInt();


    int soma = n1 + n2 + n3;
    System.out.println("Sua soma deu:" + soma);

    double media = (double) soma / 3;
    System.out.println("Sua média deu:" + media);
}
    }

