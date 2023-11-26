package batalhaNaval;
import java.util.Random;
public class BatalhaNaval {
	private Random random = new Random();
	private boolean campoDesmontado;
	private boolean jogando;
	private String[][] campovisivel = {
			{"/","/","/","/"},
			{"/","/","/","/"},
			{"/","/","/","/"},
			{"/","/","/","/"}
	};
	
	
	public String[][] campoinvisivel = {
			{" "," "," "," "},
			{" "," "," "," "},
			{" "," "," "," "},
			{" "," "," "," "}
	};
	
	private int chances;
	
	public BatalhaNaval() {
		setChances(3);
		setCampoDesmontado(true);
	
	}
	
	private void MontarCampo() {
		if(isCampoDesmontado()) {
			setCampoDesmontado(false);
			System.out.println("campo montado com sucesso!");
				int naviosContador = 4;
			
				for (int x =0; x < 4;x++) {
					int aleatoriox = random.nextInt(4);
					int aleatorioy = random.nextInt(4);
					if(naviosContador > 0) {
						if(campoinvisivel[aleatoriox][aleatorioy] == " ") {
							campoinvisivel[aleatoriox][aleatorioy] ="*";
							naviosContador--; }	}}	
				
				
	
				
		}
		else {
			System.out.println("o campo já está montado!");
		}
		
	}
	
	
	private boolean isCampoDesmontado() {
		return campoDesmontado;
	}

	private void setCampoDesmontado(boolean campoDesmontado) {
		this.campoDesmontado = campoDesmontado;
	}
	

	private boolean isJogando() {
		return jogando;
	}

	private void setJogando(boolean jogando) {
		this.jogando = jogando;
	}

	public void ComecarJogo() {
		System.out.println("Você começou um jogo!");
		if(getChances() >=1 && isCampoDesmontado()) {
			setJogando(true);
			MontarCampo();
		}
		else {
			setJogando(false);
			System.out.println("Você já iniciou o jogo!");
		}
		
	}
	
	
	
	
	public void MostrarCampo() {
		if(getChances() >=1) {
			
		if(isCampoDesmontado() == false) {
				System.out.println("Batalha Naval!");
				System.out.println("  A B C D");
				for (int x = 0;x < campovisivel.length;x++) {
					System.out.print(x+1+" ");
					for(int y =0; y < campovisivel[x].length;y++) {
						System.out.print(campovisivel[x][y]+" ");
					}
					System.out.println();
				}
			
		}
		else {
			System.out.println("Você precisa montar o campo!");
		}
		}
		
	}
	
	public void escolherPosicao(int a, char b) {
		if(isJogando() && getChances() >=1) {
			
			char[] vetor = {'A','B','C','D'};
			
			int posicaox = a-1;
			int posicaoy = 0;
			
			for(int x =0; x < vetor.length;x++) {
				if(b == vetor[x]) {
					posicaoy = x;
					break;
				}
			}
			
			if(campoinvisivel[posicaox][posicaoy] =="*") {
				campovisivel[posicaox][posicaoy] ="*";
			}
			else {
				campovisivel[posicaox][posicaoy] ="X";
				setChances(getChances()-1);
			}
			

	
		}
		else {
			System.out.println("Iniciar jogo ou chances acabaram");
		}
		
		

	}

	
	public boolean Jogando() {
		int verificador1 = 0;
		int verificador2 =0;
		for(int x =0; x <campovisivel.length;x++) {
			for(int y =0; y < campovisivel[x].length;y++) {
				if(campoinvisivel[x][y]=="*") {
					verificador1++;
				}
				
			}
		}
		
		for(int x =0; x <campovisivel.length;x++) {
			for(int y =0; y < campovisivel[x].length;y++) {
				if(campovisivel[x][y]=="*") {
					verificador2++;
				}
				
			}
		}
		
		if(getChances() <=0) {
			System.out.println("Você perdeu o jogo!");
			return true;
		}
		else if(verificador1 == verificador2) {
			System.out.println("Você ganhou!");
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public void resetarJogo() {

			setCampoDesmontado(true);
			setChances(3);
			setJogando(false);
			
			
			for(int x =0; x <4;x++) {
				for(int y =0; y < 4;y++) {
					campoinvisivel[x][y] = " ";
				}
			}
			
			for(int x =0; x <4;x++) {
				for(int y =0; y < 4;y++) {
					campovisivel[x][y] = "/";
				}
			}
			
			ComecarJogo();
			
	}



	private int getChances() {
		return chances;
	}

	private void setChances(int chances) {
		this.chances = chances;
	}
}
