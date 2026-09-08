void main() {
    Scanner input = new Scanner(System.in);
    int numero1;
    int numero2;
    int numero3;

    System.out.print("Digite o primeiro número: ");
    numero1 = input.nextInt();

    System.out.print("Digite o segundo número: ");
    numero2 = input.nextInt();

    System.out.print("Digite o terceiro número: ");
    numero3 = input.nextInt();

    if (numero1 > numero2 && numero1 >numero3){
        System.out.print("Seu número maior é:"+ numero1);
    }else if (numero2 > numero1 && numero2 > numero3){
        System.out.print("Seu número maior é: "+ numero2);
    }else {
        System.out.print("Seu número maior é: "+ numero3);
    }
}
