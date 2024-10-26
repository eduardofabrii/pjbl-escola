package escola.pessoas;

import escola.cantina.Produto;

import java.util.ArrayList;

public class Merendeiro extends Funcionario {
    private static ArrayList<Produto> estoque;

    public void criarNovoProduto(String nomeProduto, String descricaoProduto) {
        estoque.add(new Produto(nomeProduto, descricaoProduto, 0));
    }

    public void registrarEntradaProduto(Produto produto) {
        try {
            produto.setUnidadesProduto(produto.getUnidadesProduto() + 1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void registrarSaidaProduto(Produto produto) {
        try {
            produto.setUnidadesProduto(produto.getUnidadesProduto() - 1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void imprimirEstoque() {
        for (Produto p : estoque) {
            System.out.println(p.getNomeProduto() + " : " + p.getUnidadesProduto());
        }
    }

    public void gerarRelatorioConsumo() {

    }
}