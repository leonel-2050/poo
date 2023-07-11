public class Main{
  public static void main(String[] args){
		System.out.println("O Banco está aberto!");
		Pessoa p1= new Pessoa("Luiza", "6456345634", new Data (13, 3, 2019), 'F');
		Pessoa p2= new Pessoa("Emerson", "6456345634", new Data (13, 3, 2019), 'M');
    Pessoa p3= new Pessoa("Maria", "6456345634", new Data (23, 6, 2018), 'F');
		Gerente g1 = new Gerente ("Maria","16732733788", new Data (13, 3, 2019) , 'F', "323606", "dfghj");
		Gerente g2 = new Gerente ("Joao", "16732733788", new Data (13, 3, 2019) , 'F', "323606", "dfghj");
    Gerente g3 = new Gerente ("Fabio", "16732733945", new Data (16, 9, 2012) , 'M', "323606", "dfghj");
		ContaCorrente c1 = new ContaCorrente ("1234-5", p1, g1, new Data(12, 3, 2019));
    ContaCorrente c3 = new ContaCorrente ("1234-5", p1, g1, new Data(12, 3, 2019));
		Poupanca c2 = new Poupanca ("2345-6", p2, g2, new Data (13, 3, 2019));
    c1.depositar(500);
    c1.extrato();
    c1.sacar(187);
    c1.transferir(206,c2);
    c3.depositar(898);
    c3.extrato();
    c3.sacar(579);
    c3.transferir(134.98,c2);
	}
}
