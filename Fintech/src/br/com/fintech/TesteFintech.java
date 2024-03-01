package br.com.fintech;

public class TesteFintech {

	public static void main(String[] args) {
		
		System.out.println("TESTE USUARIO PF" + "\n");
		
		
		
		
		UsuarioPF userpf = new UsuarioPF();
		
		userpf.setCpf("12345678900");
		userpf.setDataNasc("09/07/2004");
		userpf.setNomeUser("Kaue Meurer");
		userpf.setSexo("M");
		userpf.setCodUser(1);
		
		System.out.println("Seu CPF seria: " + userpf.getCpf());
		System.out.println("Seu nome é: " + userpf.getNomeUser());
		System.out.println("Seu sexo é: " + userpf.getSexo());
		System.out.println("Seu código é: " + userpf.getCodUser());
		
		System.out.println("---------------------------------");
		
		UsuarioPF userpf2 = new UsuarioPF();
		
		userpf2.setCodUser(2);
		userpf2.setCpf("123466897");
		userpf2.setNomeUser("Luiz Borges");
		
		System.out.println ("Seu código é: " + userpf2.getCodUser());
		System.out.println("Seu CPF seria: " + userpf2.getCpf());
		System.out.println("Seu nome é: " + userpf2.getNomeUser());
		
		
		
		
		
		System.out.println("---------------------------------" + "\n");
		
		System.out.println("TESTE USUARIO PJ");

		
		UsuarioPJ userpj = new UsuarioPJ();
		
		userpj.setCnpj("123456000145");
		userpj.setCodUser(3);
		userpj.setNomeFantasia("InfoServic");
		userpj.setNomeUser("Rodrigo Dafre");
		userpj.setEmail("digo@infoservic.com.br");
		userpj.setSenha("telecom123");
		
		System.out.println("Seu CNPJ é: " +userpj.getCnpj());
		System.out.println("O código do cliente é: " + userpj.getCodUser());
		System.out.println("O nome da empresa seria: " + userpj.getNomeFantasia());
		System.out.println("Já seu dono seria: " + userpj.getNomeUser());
				
		System.out.println("---------------------------------");
				
		UsuarioPJ userpj2 = new UsuarioPJ();
		
		userpj2.setCnpj("123456000148");
		userpj2.setCodUser(4);
		userpj2.setNomeFantasia("Cyber Telecom");
		userpj2.setNomeUser("Edilson Fuchter");
		userpj2.setEmail("fuchter@cyber.com.br");
		userpj2.setSenha("Cyber123");
		
		System.out.println("Seu CNPJ é: " +userpj2.getCnpj());
		System.out.println("O código do cliente é: " + userpj2.getCodUser());
		System.out.println("O nome da empresa seria: " + userpj2.getNomeFantasia());
		System.out.println("Já seu dono seria: " + userpj2.getNomeUser());
		System.out.println("Seu Email seria: "+ userpj2.getEmail());
		

		
		
		
		System.out.println("---------------------------------" + "\n");
		
		System.out.println("TESTE CONTATO");
		
		
		
		Contato contatoUser = new Contato ("46999827114", "46999711484", "08006421835", "kaue@fiap.com");
		
		System.out.println(contatoUser);
		
		
		
		System.out.println("---------------------------------" + "\n");
		
		System.out.println("TESTE ENDEREÇO");
		
		
		
		Endereco endereco = new Endereco ("8567000", "Cidade B","Rua a", "Bairro B", 8, "Casa azul");
		
		System.out.println(endereco);
		
		System.out.println("---------------------------------");
		
		Endereco endereco2 = new Endereco ();
		
		endereco2.setCep("123456789");
		endereco2.setCidade("São Paulo");
		endereco2.setEnderecoRua("Rua 8");
		
		System.out.println("O cep é: " + endereco2.getCep());
		System.out.println("O nome da cidade seria: " + endereco2.getCidade());
		System.out.println("O endereço seria: " + endereco2.getEnderecoRua());
		
		
		
		System.out.println("---------------------------------"+"\n");
		

		System.out.println("TESTE METAS" + "\n");
		
		Meta meta = new Meta ();
		meta.setMetaDesejada("Celular novo");
		meta.setValorMeta(4000.00);
		meta.depositar(500);
		meta.retirar(300);
		
		System.out.println("Sua metá é: " + meta.getMetaDesejada() + "\n" + "Já o valor de sua meta seria: " + meta.getValorMeta() 
		+ "\n" + "Você já arrecadou: " +  meta.getArrecadado() + " Parabéns!");
		
		
		
		System.out.println("---------------------------------"+"\n");

		System.out.println("TESTE INVESTIMENTOS" + "\n");
		
		Investimento investimento = new Investimento();
		investimento.setDescInvestimento("PETROBRAS");
		investimento.quantidade(15);
		investimento.vlInvestido(1500.50);
		investimento.vlInvestido(500);
		investimento.vlretirado(100.50);
		investimento.retirada(5);
		
		System.out.println("Você possui ações da: "+ investimento.getDescInvestimento() + "\n" + "E possui um total de: " + investimento.getQuantInvestimento() + " Ações"
				+ "\n" + "Você possui um valor de: " + investimento.getValorInvestido() + " Investidos nesta ação");
		
		
		System.out.println("---------------------------------"+"\n");

		System.out.println("TESTE RECEITA" + "\n");
		
		Receita receita = new Receita();
		receita.setDescReita("Salario");
		receita.entrada(1500);
		receita.entrada(500);
		receita.entrada(500);
		
		System.out.println("Até o momento você recebeu um total de: "+ receita.getValorReceita() + " Que seria referente ao seu: "
		+ receita.getDescReita() );
		
		System.out.println("---------------------------------"+"\n");

		System.out.println("TESTE GASTO" + "\n");
		
		Gasto gasto = new Gasto();
		gasto.setTipoGasto("Compras do mercado");
		gasto.saida(350);
		gasto.saida(150);
		
		System.out.println("Seu gasto do mês é de: " + gasto.getVlGasto() + " Que é referente a: " + gasto.getTipoGasto());
		
				

	}

}
