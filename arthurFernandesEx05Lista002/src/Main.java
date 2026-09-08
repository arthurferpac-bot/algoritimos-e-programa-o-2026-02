void main() {
    Scanner input = new Scanner(System.in);
    double celsius;
    int opcao;

    System.out.print("Digite a temperatura em Celsius: ");
    celsius = input.nextDouble();

    System.out.println("Escolha a unidade de conversão :");
    System.out.println("1 = Fahrenheit");
    System.out.println("2 = Kelvin");
    opcao = input.nextInt();

    double resultadoFahrenheit = (celsius * 1.8 + 32);
    double resultadoKelvin = (celsius + 273.15);

    if (opcao == 1) {
        System.out.print("Temperatura em Fahrenheit: " + resultadoFahrenheit + "ºF");
    } else {
        System.out.print("Temperatura em Kelvin: " + resultadoKelvin + "K");


    }
}
    // void main() {
        // Scanner input = new Scanner(System.in);
        // double celsius;

        // System.out.print("Digite a temperatura em Celsius: ");
        // celsius = input.nextDouble();

    // System.out.print("Você quer converter em Fahrenheit? (true/false): ");
   // boolean fahrenheit = input.nextBoolean();

    // if (fahrenheit) {
    // double resultado = (celsius * 1.8 + 32);
    // System.out.print("Temperatura em Fahrenheit: "+ resultado + "ºF");

    // }else {
       // double resultadoKel = (celsius + 273.15);
       // System.out.print("Você quer converter para Kelvin! temperatura em Kelvin: "+resultadoKel+"K");
//  }
//}