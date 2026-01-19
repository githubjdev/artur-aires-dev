package artur.pdv.array;

public class Array3 {

	public static void main(String[] args) {

		Aluno[] alunos = new Aluno[3];

		alunos[0] = new Aluno("Alex", 38);
		alunos[1] = new Aluno("José", 25);
		alunos[2] = new Aluno("Artur", 30);
		
		
		for (Aluno aluno : alunos) {
			aluno.mostrar();
		}

	}

}
