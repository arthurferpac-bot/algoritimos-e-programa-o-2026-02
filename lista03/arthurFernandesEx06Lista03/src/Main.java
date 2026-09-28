void main() {
    Scanner input = new Scanner(System.in);

    String senha="0";
    String senhapermanente = "2026";
    int numerosDeTentativas = 0;

    while (!senha.equals(senhapermanente)) {//.equals para comandos String
        System.out.print("Digite a senha: ");
        senha = input.nextLine();
numerosDeTentativas++;

        if (senha.equals(senhapermanente)) {
            System.out.println("Acesso aprovado!");
            System.out.println("Número de tentativas: " + numerosDeTentativas);

        } else {
            System.out.println("Senha Incorreta!Tente novamente");

        }

    }
}

