package ProjetoMV.ProjetoMV;

import java.util.List;
import java.util.Scanner;

import entidade.Sorvete;
import dao.SorveteDAO;
import dao.SorveteDAOimp;

public class App {
	public static void main( String[] args )
    {
        
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		SorveteDAO sorveteDAO = new SorveteDAOimp();
		int opcao = 0;
		while (opcao<5) {

			System.err.println(
					"\n\nESCOLHA OPÇÃO DESEJADA: \n\n1 - ADICIONAR UM SORVETE\n\n2 - EXCLUIR SORVETE\n\n3 - EXIBIR LISTA ");
			opcao = scan.nextInt();

			Sorvete sorvete = new Sorvete();

			if(opcao==1) {

				System.err.println("\n\nADICIONE UM SABOR: ");
				sorvete.setNome(scan.nextLine());
				sorvete.setNome(scan.nextLine());

				System.err.println("\nADICIONE O FABRICANTE: ");
				sorvete.setFabricante(scan.nextLine());

				System.err.println("\nADICIONE OS INGREDIENTES: ");
				sorvete.setIngredientes(scan.nextLine());

				sorveteDAO.inserir(sorvete);

				System.out.println("==== SORVETE INSERIDO COM SUCESSO!!! ===");

			
			}else if(opcao==2) {

				System.err.println("\nDigite o NOME do Sorvete que será removido: ");
				sorvete.setNome(scan.nextLine());

				sorveteDAO.remover(scan.nextLine());

			}else if (opcao==3) {

				List<Sorvete> sorvetes = sorveteDAO.listarTodos();

				System.out.println("\n\n\n\n ");
				for (Sorvete s : sorvetes) {
					System.out.println(" ===  NOME: " + s.getNome() + "  === FABRICANTE: " + s.getFabricante()
							+ "  === INGREDIENTES: " + s.getIngredientes() + "  ===");
				}

				
			

		}
		}
		}
}
