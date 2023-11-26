package batalhaNaval;
import java.util.Scanner;
public class MainBatalhaNaval {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		BatalhaNaval bn = new BatalhaNaval();
		
		boolean resposta = true;
		
		bn.ComecarJogo();
		bn.MostrarCampo();
		
		while(resposta) {
			while(!bn.Jogando()) {
				System.out.print("Digite o número: ");
				int posicaox = sr.nextInt();
				System.out.print("Digite a letra: ");
				char posicaoy =sr.next().charAt(0);
				bn.escolherPosicao(posicaox, posicaoy);
				bn.MostrarCampo();
			}
			System.out.println("Você quer iniciar outro jogo? [S/N]");
			String continuar = sr.next().toUpperCase();
			if(continuar.equals("S")) {
				resposta = true;
				bn.resetarJogo();
				bn.MostrarCampo();
			}
			else {
				resposta = false;
				System.out.println("Programa encerrado!");
			}
			
		}
		sr.close();
		
		
		
		

	}

}
