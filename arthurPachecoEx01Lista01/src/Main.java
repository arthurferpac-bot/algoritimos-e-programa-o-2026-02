//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    String nome;
    String sobrenome;

    System.out.print("Digite seu nome:");
    nome = input.nextLine();
    System.out.print("Digite seu sobrenome:");
    sobrenome = input.nextLine();

    System.out.print("Você é:" +nome+" "+sobrenome);
}
