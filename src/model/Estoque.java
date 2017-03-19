package model;

public class Estoque {
    private int codigoEstoque;
    private boolean categoriaEstoque;
    private String fabricanteEstoque;
    private String descricaoEstoque;
    private float preco_vendaEstoque;
    private float preco_custoEstoque;
    private int quantidadeEstoque;

    public Estoque(int codigoEstoque, boolean categoriaEstoque, String fabricanteEstoque, String descricaoEstoque, float preco_vendaEstoque, float preco_custoEstoque, int quantidadeEstoque) {
        this.codigoEstoque = codigoEstoque;
        this.categoriaEstoque = categoriaEstoque;
        this.fabricanteEstoque = fabricanteEstoque;
        this.descricaoEstoque = descricaoEstoque;
        this.preco_vendaEstoque = preco_vendaEstoque;
        this.preco_custoEstoque = preco_custoEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Estoque() {
    }

    public int getCodigoEstoque() {
        return codigoEstoque;
    }

    public void setCodigoEstoque(int codigoEstoque) {
        this.codigoEstoque = codigoEstoque;
    }

    public boolean isCategoriaEstoque() {
        return categoriaEstoque;
    }

    public void setCategoriaEstoque(boolean categoriaEstoque) {
        this.categoriaEstoque = categoriaEstoque;
    }

    public String getFabricanteEstoque() {
        return fabricanteEstoque;
    }

    public void setFabricanteEstoque(String fabricanteEstoque) {
        this.fabricanteEstoque = fabricanteEstoque;
    }

    public String getDescricaoEstoque() {
        return descricaoEstoque;
    }

    public void setDescricaoEstoque(String descricaoEstoque) {
        this.descricaoEstoque = descricaoEstoque;
    }

    public float getPreco_vendaEstoque() {
        return preco_vendaEstoque;
    }

    public void setPreco_vendaEstoque(float preco_vendaEstoque) {
        this.preco_vendaEstoque = preco_vendaEstoque;
    }

    public float getPreco_custoEstoque() {
        return preco_custoEstoque;
    }

    public void setPreco_custoEstoque(float preco_custoEstoque) {
        this.preco_custoEstoque = preco_custoEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    
}
