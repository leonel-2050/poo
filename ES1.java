pessoa p1 = new pessoa ();
p1.nome= "MARIA";
p1. idade= 18;
p1.sexo='F';
p1. cpf = "124.456.789-00";

pessoa p2 = new pessoa ();
p2.nome= "joao";
p2. idade= 22;
p2.sexo='M';
p2. cpf = "234.567.890-00";

conta c1 = new conta();
c1.numero="1234-5" ;
c1titular = p1; // a pessoa p1 eh titular desta conta!
c1.saldo =100.00;
c1 limite= 200.00;

conta c2 = new conta();
c2.numero="2345-6" ;
c2titular = p2; // a pessoa p1 eh titular desta conta!
c2.saldo =150.00;
c2 limite= 200.00;

System.out.println( c1.saldo);
System.out.println(c1.titular.nome);
System.out.println("saldo da conta " + c2.numero + "; " = c2.saldo);
