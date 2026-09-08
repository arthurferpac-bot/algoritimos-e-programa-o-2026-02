//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Digite o primeiro número:");
        n = input.nextInt();

        System.out.print("Digite o segundo número:");
        n = input.nextInt();

        System.out.print("Digite o terceiro número:");
        n = input.nextInt();

        System.out.print("Digite o quarto número:");
        n = input.nextInt();

        int soma = n + n + n + n;
        System.out.println("Sua soma deu:" + soma);

        double media = soma / 4;
        System.out.println("Sua média deu:" + media);
}
