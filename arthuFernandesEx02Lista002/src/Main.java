void main() {
    Scanner input = new Scanner(System.in);
    double energia;

    System.out.print("Digite quanto de energia foi consumida: ");
    energia = input.nextDouble();

    double energia1 = energia * 0.50;
    double energia2 = energia * 0.70;
    double energia3 = energia * 0.90;


    if (energia <= 100) {
        System.out.print("O valor da sua conta de energia ficou em: R$ " + energia1);
    }else if ( energia <= 200) {
        System.out.print("O valor da sua conta de energia ficou em: R$ " + energia2);
    } else
        System.out.print("O valor da sua conta ficou em: R$ " + energia3);

}