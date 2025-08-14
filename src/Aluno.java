public class Aluno {
    public String nome;
    public double nota;

    public String verificarStatus() {
        if (nota >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }

    }
}
