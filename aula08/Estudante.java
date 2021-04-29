public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone); // chama Pessoa()
        this.curso = curso;
    }

    @Override
    public String exibir() {
        return super.exibir() + " : " + curso;
    }

    @Override
    public String toString() {
        return super.toString() + " : " +curso;
    }
}
