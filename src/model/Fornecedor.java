package model;

public class Fornecedor {
    private int codigoFornecedor;
    private String nomeFornecedor;
    private int cnpjFornecedor;
    private String enderecoFornecedor;
    private String cidadeFornecedor;
    private int telefoneFornecedor;
    private String emailFornecedor;

    public Fornecedor(int codigoFornecedor, String nomeFornecedor, int cnpjFornecedor, String enderecoFornecedor, String cidadeFornecedor, int telefoneFornecedor, String emailFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.cidadeFornecedor = cidadeFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
    }

    public Fornecedor() {
    }
    
    public int getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(int cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public int getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(int telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }
}
