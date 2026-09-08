void main() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o código do produto: ");
            int codigo = sc.nextInt();

            System.out.print("Digite a quantidade comprada: ");
            int quantidade = sc.nextInt();

            double precoUnitario;

            // Determina o preço unitário conforme a Tabela I
            if (codigo >= 1 && codigo <= 10) {
                precoUnitario = 10.00;
            } else if (codigo >= 11 && codigo <= 20) {
                precoUnitario = 15.00;
            } else if (codigo >= 21 && codigo <= 30) {
                precoUnitario = 20.00;
            } else if (codigo >= 31 && codigo <= 40) {
                precoUnitario = 30.00;
            } else {
                System.out.println("Código inválido!");
                sc.close();
                return;
            }

            double precoTotal = precoUnitario * quantidade;
            double percentualDesconto;

            // Determina o percentual de desconto conforme a Tabela II
            if (precoTotal <= 250.00) {
                percentualDesconto = 5;
            } else if (precoTotal > 250.00 && precoTotal <= 500.00) {
                percentualDesconto = 10;
            } else {
                percentualDesconto = 15;
            }

            double valorDesconto = precoTotal * (percentualDesconto / 100);
            double precoFinal = precoTotal - valorDesconto;

            System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
            System.out.printf("Preço total da nota: R$ %.2f%n", precoTotal);
            System.out.printf("Desconto aplicado: %.0f%% (R$ %.2f)%n", percentualDesconto, valorDesconto);
            System.out.printf("Preço final da nota: R$ %.2f%n", precoFinal);

            sc.close();
        }




