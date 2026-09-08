void main() {
Scanner input = new Scanner(System.in);
double renda;
double prestacao;

    System.out.print("Digite sua renda: R$ ");
    renda = input.nextDouble();
System.out.print("Digite o valor da prestação: R$ ");
    prestacao = input.nextDouble();

    if (prestacao > renda * 0.30) {
        System.out.println("Financiamento negado por alta prestação! ");
    } else if (prestacao > 3000 && renda < 10000) {
        System.out.println("Financiamento negado por baixa renda! ");
        } else  {
        System.out.println("Financiamento aprovado!");



    }
}
// se prestação for maior que 30% da renda acesso é negado.
// caso isso não ocorra e a prestação for mais que R$: 3000 é obrigatório que tenha renda <= a R$: 10000
// e se todas essas questões forem correspondidas o acesso é permitido
