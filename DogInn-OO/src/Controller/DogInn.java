package Controller;
import java.util.Scanner;

public class DogInn {
	public static void main(String[] args) {
//		=================================================================================================
//		
//		=================================================================================================
//		
//		=================================================================================================
//		
//		=================================================================================================
//		
//		=================================================================================================
//		
//		=================================================================================================
	}
	
	public static void cadastrarCliente() {
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o nome: ");
		cliente.nomeCliente = ler.nextLine();
		
		System.out.println("Digite o sobrenome: ");
		cliente.sobrenomeCliente = ler.nextLine();
		
		System.out.println("Digite o email: ");
		cliente.emailCliente = ler.nextLine();
		
		System.out.println("Digite o endereco: ");
		cliente.enderecoCliente = ler.nextLine();
		
		System.out.println("Digite a senha: ");
		cliente.senhaCliente = ler.nextLine();
		
		System.out.println("Digite o numero de celular: ");
		cliente.telefoneCliente = ler.nextLine();
	}
	
	public static void cadastrarPet() {
		Scanner ler = new Scanner(System.in);
		Pet pet = new Pet();
		
		System.out.println("Digite a raca do pet: ");
		pet.raca = ler.nextLine();
		
		System.out.println("Digite o tamanho do pet: ");
		pet.tamanho = ler.nextLine();
		
		System.out.println("Digite o sexo do pet: ");
		pet.sexo = ler.nextLine();
		
		System.out.println("Digite o nome do pet: ");
		pet.nome = ler.nextLine();
		
		System.out.println("Digite o peso do pet: ");
		pet.peso = ler.nextDouble();
	}
	
	public static void cadastrarCartao() { 
		Scanner ler = new Scanner(System.in);
		PagamentoCartaoDeCredito pagCred = new PagamentoCartaoDeCredito();
		
		System.out.println("Digite a bandeira do cartao: ");
		pagCred.bandeiraCartao = ler.nextLine();
		
		System.out.println("Digite o numero do cartao: ");
		pagCred.numeroCartao = ler.nextLine();
		
		System.out.println("Digite a data de validade: ");
		pagCred.dataValidade = ler.nextLine();
		
		System.out.println("Digite o nome do titular do cartao: ");
		pagCred.titularCartao = ler.nextLine();
		
		System.out.println("Digite o codigo de seguranca do cartao: ");
		pagCred.codigoSeguranca = ler.nextLine();
	}
	
	public static void cadastrarSitter() {
		Scanner ler = new Scanner(System.in);
		PetSitter babaPet = new PetSitter();
		
		System.out.println("Digite o nome do sitter: ");
		babaPet.nomePetSitter = ler.nextLine();
		
		System.out.println("Digite o sobrenome do sitter: ");
		babaPet.sobrenomePetSitter = ler.nextLine();
		
		System.out.println("Digite o email do sitter: ");
		babaPet.emailPetSitter = ler.nextLine();
		
		System.out.println("Digite o endereco do sitter: ");
		babaPet.enderecoPetSitter = ler.nextLine();
		
		System.out.println("Digite a senha: ");
		babaPet.senhaPetSitter = ler.nextLine();
		
		System.out.println("Digite o numero de celular do sitter: ");
		babaPet.telefonePetSitter = ler.nextLine();
	}
	
	public static void cadastrarChavePIX() { 
		Scanner ler = new Scanner(System.in);
		PagamentoPIX pagPIX = new PagamentoPIX();
		int escolhaChave;
		
		do {
			System.out.println("Cadastro de Chave PIX");
			System.out.println("1 - CPF/CNPJ");
			System.out.println("2 - E-mail");
			System.out.println("3 - Celular");
			System.out.println("4 - Chave aleatoria");
			System.out.println("Insira o numero da chave que deseja usar: ");
			escolhaChave = ler.nextLine();
		
			switch(pagPIX.pix) {
			case 1:
				System.out.println("Insira o seu CPF/CNPJ: ");
				pagPIX.pix = ler.pix();
				break;
			case 2:
				System.out.println("Insira o seu E-mail: ");
				pagPIX.pix = ler.pix();
				break;
			case 3:
				System.out.println("Insira o seu celular: ");
				pagPIX.pix = ler.pix();
				break;
			case 4:
				System.out.println("Insira a sua chave aleatoria: ");
				pagPIX.pix = ler.pix();
				break;
			}
		} while(escolhaChave > 0 && escolhaChave < 5);
	}
	
}