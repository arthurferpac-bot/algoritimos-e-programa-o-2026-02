void main() {
Scanner input = new Scanner(System.in);
String [] dias= {"Segunda", "Terça", "Quarta", "Quinta","Sexta"};
double[] valor  = new double[5];


        for (int i = 0; i < valor.length; i++){
        System.out.print("Digite o valor das vendas de "
                +dias[i]+" R$: ");
        valor[i]=input.nextDouble();
        }

        double total=0;
    for (int i = 0; i < valor.length; i++) {
        total+=valor[i];

    }
    double mediaValor=total/valor.length;
    System.out.println("total das vendas: "+total);
    System.out.printf("Média dos valores: R$ %.2f%n", total);

}


