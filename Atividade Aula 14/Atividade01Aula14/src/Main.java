void main() {
Scanner input = new Scanner(System.in);

  System.out.print("DIgite um número: ");
  int num = input.nextInt();

int fatorial=1;

  for(int i=num;i >=1;i--){
    fatorial= fatorial*i;
int resultado=num*fatorial;


  }
    System.out.println("Fatorial de "+num+" é: "+fatorial);
}
