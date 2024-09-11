
import java.util.Scanner;

public class Questao_22 {
	
	private static Scanner Teclado;

	public static void main(String[] args) {

		Teclado = new Scanner(System.in);

		int QntdAlunos, QntdNotas = 4;
		
		float SomaNotas, Maior, Menor;
		
		System.out.printf("Nº de Alunos: ");
		
		QntdAlunos = Teclado.nextInt();
		
		float[][] Planilha = new float[QntdAlunos][QntdNotas];
		
		for(int Aluno = 0; Aluno < QntdAlunos; Aluno++) {
			SomaNotas = 0;
			for(int Nota = 0; Nota < QntdNotas - 2; Nota++) {
				System.out.printf("Av%d: ", Nota+1);
				Planilha[Aluno][Nota] = Teclado.nextFloat();
				SomaNotas = SomaNotas + Planilha[Aluno][Nota];
			}
			
			Planilha[Aluno][3] = SomaNotas / 2;
			
			if(Planilha[Aluno][0] <= Planilha[Aluno][1]) {
				Menor = Planilha[Aluno][0]; // Av1
				Maior = Planilha[Aluno][1]; // Av2
			}else {
				Menor = Planilha[Aluno][1]; // Av2
				Maior = Planilha[Aluno][0]; // Av1	
			}
			
			
			if(Planilha[Aluno][3] >= 6) {
				Planilha[Aluno][2] = 0;
			}else {
				System.out.printf("Av3: ");
				Planilha[Aluno][2] = Teclado.nextFloat(); 
				
				if(Planilha[Aluno][2] >= Menor) {
					Planilha[Aluno][3] = (Maior + Planilha[Aluno][2])/2;
				}else {}
				
			}
			

		}
		
		
					
	}

}
