public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("John Doe", "11111111111", new ContaBancaria());

        usuario.depositar(1000);

        System.out.println(usuario.getSaldo());

        usuario.sacar(500);

        System.out.println(usuario.getSaldo());

        Usuario destinatario = new Usuario("Jane Doe", "22222222222", new ContaBancaria());

        usuario.transferir(destinatario, 250);

        System.out.println(usuario.getSaldo());
        System.out.println(destinatario.getSaldo());
    }
}
