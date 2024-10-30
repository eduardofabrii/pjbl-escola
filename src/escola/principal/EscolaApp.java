package escola.principal;

import escola.MiniBanco.ArquivoTxt;
import escola.administracao.Disciplina;
import escola.administracao.Escola;
import escola.administracao.Turma;
import escola.pessoas.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EscolaApp {
    public static void main(String[] args) {
        Professor marina = new Professor("Marina de Lara", "1234567890", LocalDate.of(1998, 4, 12), "Rua das Flores", 1, 14900);
        Faxineiro carlos = new Faxineiro("Carlos Oliveira", "12345678900", LocalDate.of(1985, 5, 10), "Rua das Flores, 100", 1,1500.0);

        ArquivoTxt arquivo = new ArquivoTxt("funcionarios.txt");

        try {
            arquivo.salvarFuncionario(marina);
            arquivo.salvarFuncionario(carlos);
            System.out.println("Funcionários salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionários: " + e.getMessage());
        }

    }
}
