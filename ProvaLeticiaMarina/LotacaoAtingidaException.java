public class LotacaoAtingidaException extends Exception{
    
    public LotacaoAtingidaException (){
        super("A quantidade de alunos inserida exede os limites da turma. Coloque o aluno em uma turma com vagas!");
    }
}
