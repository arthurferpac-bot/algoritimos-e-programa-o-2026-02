void main() {
    Scanner input = new Scanner(System.in);
    int idade;


    System.out.print("Digite sua idade:");
    idade = input.nextInt();

    // System.out.println ("sua idade é:" + idade);

    System.out.print("sua idade corresponde a: " + (idade * 12) + "meses");
    }