void main() {
Scanner input = new Scanner(System.in);
int numero;

    System.out.print("Digite um número: ");
numero = input.nextInt();

 if (numero  %2 == 0) { //% resto,
     System.out.print("Seu número é  par!");
 }else {
     System.out.printf("Seu número é ímpar!");
 }
}

