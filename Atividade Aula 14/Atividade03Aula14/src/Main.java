void main() {
    Scanner input = new Scanner(System.in);
    String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
    double[] temp = new double[5];

    for (int i = 0; i < temp.length/*arredondar*/  ; i++) {
        System.out.print("Digite a temperatura de " + dias[i] + ": ");
        temp[i] = input.nextDouble();
    }
   double soma = 0;
    for (int i = 0; i < temp.length; i++) {
        soma += temp[i];
    }
     double media = soma  /temp.length ;
    System.out.println("\nMédia de temperatura : "+ media);

    System.out.println("\nDia com temperatura acima da média : ");
    for (int i = 0; i < temp.length ; i++) {
        if (temp[i]>media) {
            System.out.println(dias[i]+ ": "+ temp[i]);

        }
     }
  }

