void main() {
    Scanner input = new Scanner(System.in);
    double[] peso = new double[6];
    double referencia;

    for (int i = 0; i < peso.length; i++) {
        System.out.print("Digite o peso em Kg: ");
        peso[i] = input.nextDouble();
    }

    System.out.print("DIGITE PESO DE REFERÊNCIA: ");
    referencia = input.nextDouble();

    int contador = 0;

    for (int i = 0; i < peso.length; i++) {
        if (peso[i] == referencia) {
            contador++;
        }
    }
        if (contador > 0) {
            System.out.println("Peso encontrado: " + contador +" vez(es).");

        } else {
            System.out.println("Valor não localizado na amostragem!");
        }
    }
