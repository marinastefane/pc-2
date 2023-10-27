public class Teste {
    public static void main(String[] args) throws LotacaoAtingidaException{

        Aluno aluno1 = new Aluno("Roberto Cleyson");
        Aluno aluno2 = new Aluno("Sonia");
        Aluno aluno3 = new Aluno("Ruth");
        Aluno aluno4 = new Aluno("Sandra");
        

        Modalidade aerobica = new Modalidade("Aerobica", "SEG", "14:00");
        Modalidade zumba = new Modalidade("Zumba", "TER", "15:00");
        
        Turma turma1 = new Turma("Larissa Manoela", 3, 3, null, zumba);
        
        Turma turma11 = new Turma();
        turma11.addAluno(aluno4);
        turma11.addAluno(aluno3);
        turma11.addAluno(aluno2);
        
        
        //prints
        System.out.println();
        System.out.println("Turma 1: " + turma1.getProfessor() + ", " + zumba.getNome() + ", " + zumba.getDia() + ", " + zumba.getHora());
        System.out.println("Alunos da turma 1: " + aluno4.getNome() + ", " + aluno3.getNome() + ", " + aluno2.getNome());
        System.out.println();

        Turma turma2 = new Turma("Maisa Silva", 3, 4, null, aerobica);

        System.out.println("Turma 2: " + turma2.getProfessor() + ", " + aerobica.getNome() + ", " + aerobica.getDia() + ", " + aerobica.getHora());
        System.out.println("Alunos da turma 1: " + aluno4.getNome() + ", " + aluno3.getNome() + ", " + aluno2.getNome() + ", " + aluno1.getNome());
        System.out.println();

        Turma turma12 = new Turma();
        turma11.addAluno(aluno4);
        turma11.addAluno(aluno3);
        turma11.addAluno(aluno2);
        turma1.addAluno(aluno1); //aluno a mais
    }

}
