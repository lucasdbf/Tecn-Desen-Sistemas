package enums;

public enum TamanhoRoupa {
    PEQUENO(40),
    MEDIO(42),
    GRANDE(44),
    EXTRA_GRANDE(50);

    private Integer numero;

    TamanhoRoupa(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
