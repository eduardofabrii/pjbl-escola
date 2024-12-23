package escola.sala;

import escola.minibanco.salas.GerenciarDadosSalas;

public class SalaBiblioteca extends Sala {
    int quantidadeLivros;

    public SalaBiblioteca(int id, String nome, int capacidade, int quantidadeLivros) {
        super(id, nome, capacidade);
        this.quantidadeLivros = quantidadeLivros;
        new GerenciarDadosSalas().gravarSalaBiblioteca(this);
    }
  
    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    @Override
    public boolean verificarDisponibilidade() {
        return true;
    }

    @Override
    public void reservarSala() {
        System.out.println("Sala Biblioteca: " + getNome() + "Capacidade: " + getCapacidade() + "Quantidade de livros: " +getQuantidadeLivros());
    }
}
