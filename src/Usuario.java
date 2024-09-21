public class Usuario {
  private final String nome;
  private final String cpf;
  private final ContaBancaria conta;

  public Usuario(String nome, String cpf, ContaBancaria conta) {
    this.nome = nome;
    this.cpf = cpf;
    this.conta = conta;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public ContaBancaria getConta() {
    return conta;
  }

  public void depositar(double valor) {
    conta.depositar(valor);
  }

  public void sacar(double valor) {
    conta.sacar(valor);
  }

  public double getSaldo() {
    return conta.getSaldo();
  }

  public void transferir(Usuario destinatario, double valor) {
    conta.sacar(valor);
    destinatario.depositar(valor);
  }
}
