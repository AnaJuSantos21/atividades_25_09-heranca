package curso25_09_heranca;

public class Principal {

	public static void main(String[] args) {
		
		//Criando uma pessoa
		Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		//criando uma pessoa fisica
		PessoaFisica pessoaFisica = new PessoaFisica("Julia da Silva", "(11) 8888-8888", "123.456.789", "300.456.789.x");
		System.out.println("\nPessoa física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		//criando uma pessoa juridica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 7777-7777", "98-654-321/9001-23");
		System.out.println("\nPessoa Juridica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());

	}

}
