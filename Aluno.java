public class Aluno {

    public String nome;
    public boolean matricula;
    public int idade;
    public double mensalidade;

    public Aluno(String n, boolean ma, int i, double men ) {
        this.nome = n;
        this.matricula = ma;
        this.idade = i;
        this.mensalidade = men;
    }

    public void Desconto(double mensalidade){
        if (this.mensalidade < 1000){
            this.mensalidade = this.mensalidade - (this.mensalidade * 0.15);
        } else {
            this.mensalidade = this.mensalidade - (this.mensalidade * 0.20);
        }

    }
    public void Desconto(){
        System.out.println("Nome: " + nome );
        System.out.println("Matricula: " + matricula );
        System.out.println("idade: " + idade);
        System.out.println("mensalidade: " + mensalidade);

    }
}

