public class Aluno {
    
    private String matricula;
    private double nota;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String calcularConceito() {
        if (nota >= 0 && nota <= 4.9) {
            return "D";
        } else if (nota >= 5 && nota <= 6.9) {
            return "C";
        } else if (nota >= 7 && nota <= 8.9) {
            return "B";
        } else if (nota >= 9 && nota <= 10) {
            return "A";
        } else {
            return "Nota inválida";
        }
    }
    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nota: " + nota + ", Conceito: " + calcularConceito();
    }
}
