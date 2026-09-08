void main() {
    Scanner input = new Scanner(System.in);
    double gasolina;
    double etanol;

    System.out.println("Digite o valor da gasolina: R$ ");
    gasolina = input.nextDouble();

    System.out.println("Digite o valor do etanol: R$ ");
    etanol = input.nextDouble();

    double proporcao = (gasolina / etanol) * 100;
    System.out.println("A proporção entre eles é de: ");

    if (proporcao <= 70) {
        System.out.println("O etanol é mais vantajoso");

    } else {
        System.out.println("A gasolina é mais vantajosa");

    }
}