package br.com.mgs;

public class Funcionario {
    private String nome;
    private String cargo;
    private String alergias;
    private String problemasMedicos;
    private String telefone;
    private String email;

    // Construtor
    public Funcionario(String nome, String cargo, String alergias, String problemasMedicos, String telefone, String email) {
        this.nome = nome;
        this.cargo = cargo;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefone = telefone;
        this.email = email;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Alergias: " + alergias);
        System.out.println("Problemas Médicos: " + problemasMedicos);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}