package escola.pessoas;

import escola.cantina.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Merendeiro extends Funcionario {
    private static ArrayList<Produto> estoque;

    public Merendeiro(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario, List<String> registrosPonto) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario, registrosPonto);
    }

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
