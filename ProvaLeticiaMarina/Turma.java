public class Turma {
    
    private String professor;
    private int capacidade;
    private int inseridos;
    private Aluno[] sala;
    private Modalidade modalidade;
    
    public Turma() {
        this.professor = professor;
        this.capacidade = 3;
        this.inseridos = 0;
        this.sala = new Aluno[capacidade];
        this.modalidade = modalidade;
    }

    
    public Turma(String professor, int capacidade, int inseridos, Aluno[] sala, Modalidade modalidade) {
        this.professor = professor;
        this.capacidade = capacidade;
        this.inseridos = inseridos;
        this.sala = sala;
        this.modalidade = modalidade;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Aluno[] getSala() {
        return sala;
    }

    public void setSala(Aluno[] sala) {
        this.sala = sala;
    }

    
    public Modalidade getModalidade() {
        return modalidade;
    }


    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }


    public boolean addAluno(Aluno aluno) throws LotacaoAtingidaException{
        if(inseridos < capacidade){
            sala[inseridos] = aluno;
            inseridos++;
            return true;
        } else {
        throw new LotacaoAtingidaException();
        }
    }
    
}
