package model.vo.Especialidade;

public class EspecialidadeVO {

    private int codigoEspecialidade;
    private String nomeEspecialidade;
    private String instituicao;

    public EspecialidadeVO() {
    }

    public EspecialidadeVO(int codigoEspecialidade, String nomeEspecialidade, String instituicao) {
        this.codigoEspecialidade = codigoEspecialidade;
        this.nomeEspecialidade = nomeEspecialidade;
        this.instituicao = instituicao;
    }

    public int getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(int codigoEspecialidade) {
        this.codigoEspecialidade = codigoEspecialidade;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return nomeEspecialidade;
    }

}
