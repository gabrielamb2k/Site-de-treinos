package aplicativo.treino.Gerador.de.treinos.dto;

/**
 * Classe para receber os dados enviados pelo usuario
 * para podermos gerar um treino conforme
 * as necessidades do usuario
 * Dto -> data transfer object(Objeto de transferencia de dados)
 * @version 1.0
 */
public class WorkoutDto {

    private String tipoDeTreino;
    private String divisaoDeTreino;
    private String duracaoDoTreino;

    public String getTipoDeTreino() {
        return tipoDeTreino;
    }

    public void setTipoDeTreino(String tipoDeTreino) {
        this.tipoDeTreino = tipoDeTreino;
    }

    public String getDivisaoDeTreino() {
        return divisaoDeTreino;
    }

    public void setDivisaoDeTreino(String divisaoDeTreino) {
        this.divisaoDeTreino = divisaoDeTreino;
    }

    public String getDuracaoDoTreino() {
        return duracaoDoTreino;
    }

    public void setDuracaoDoTreino(String duracaoDoTreino) {
        this.duracaoDoTreino = duracaoDoTreino;
    }

    @Override
    public String toString() {
        return "WorkoutPreferencesDTO{" +
                "tipoDeTreino='" + tipoDeTreino + '\'' +
                ", divisaoDeTreino='" + divisaoDeTreino + '\'' +
                ", duracaoDoTreino='" + duracaoDoTreino + '\'' +
                '}';
    }
}
