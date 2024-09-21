public class ContaBancaria {
  private double saldo = 0;

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor) {
    saldo += valor;
  }

  public void sacar(double valor) {
    saldo -= valor;
  }
}
