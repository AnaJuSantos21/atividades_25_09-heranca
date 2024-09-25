package curso25_09_heranca;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		
		//Criando veiculo
		Veiculo veiculo = new Veiculo("Jeep", "Renegade", 2005, "Preto");
		System.out.println("Veiculo: ");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
				
		//criando automovel
		Automovel automovel = new Automovel("Fusca", "Volkswagen", 1980, "Azul", 4, "Potente");
		System.out.println("\n Automovel: ");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Numero de portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
				
				
		//criando uma pessoa juridica
		Moto moto = new Moto("Honda", "XRE 190", 2009, "Branca", 300);
		System.out.println("\n Moto: ");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada());

			}


	}


