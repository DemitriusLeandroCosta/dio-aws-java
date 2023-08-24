package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //private List<Pessoa> pessoaList;
    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Ordenação pela idade
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Maria", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Ana", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Xavier 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Dias", 17, 1.56);

        System.out.println("Lista das Pessoas " + ordenacaoPessoa.pessoaList);

        System.out.println("Lista por idade " +ordenacaoPessoa.ordenarPorIdade());

        System.out.println("Lista por altura " + ordenacaoPessoa.ordenarPorAltura());
    }
}

