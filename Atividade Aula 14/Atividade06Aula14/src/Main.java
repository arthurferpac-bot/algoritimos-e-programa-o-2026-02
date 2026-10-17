void main() {
    Scanner input = new Scanner(System.in);
    int numeroSecreto = 67;
    int numero;
    int[] erros = new int[100];
    int qtdErros = 0;
    int tentativas = 0;
    do  {
        System.out.print("Tente adivinhar o numero secreto: ");
        numero = input.nextInt();
        tentativas++;
        if (numero!= numeroSecreto){
            System.out.println("Lamento, você errou!");
            if (numero>67){
                System.out.println("numero secreto é MENOR!");
            }else {
                System.out.println("numero secreto é MAIOR!");
            }
            erros[qtdErros]=numero;
            qtdErros++;
        }
 }while (numero != numeroSecreto);
    System.out.println("Parbéns, você acertou!" );
    System.out.println("Tentativas necessárias: "+tentativas);

if (qtdErros>0){
    System.out.println("Palpites errados:");
    for (int i = 0; i < qtdErros; i++) {
        System.out.println(erros[i]);
    }
}

}