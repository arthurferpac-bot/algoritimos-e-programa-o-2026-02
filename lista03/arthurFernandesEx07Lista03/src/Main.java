void main() {
Scanner input = new Scanner(System.in);
double nota=999;
int quantAlunos=-1;//para quando digitar -1 ele já subtraia do último valor
//média nota de todos / quantidade de alunos
double soma=0;
    while (nota>=0){
       System.out.print("Digite uma nota:");
    nota= input.nextDouble();
    if (nota>0){
        soma+=nota;
        quantAlunos++;
        }

    }
    System.out.println("Quantidade de alunos: "+ quantAlunos);
    System.out.println("Média aritmética dos alunos: "+soma/quantAlunos);

}

