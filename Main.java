import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

        // Solicitar informações do veículo
        System.out.print("Digite a marca do veículo: ");
        String marcaVeiculo = scanner.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modeloVeiculo = scanner.nextLine();
        Veiculo veiculo = new Veiculo(marcaVeiculo, modeloVeiculo);

        // Solicitar tipo de serviço
        System.out.println("Escolha o serviço:");
        System.out.println("1. Lavagem Simples - R$20.0");
        System.out.println("2. Lavagem Completa - R$50.0");
        System.out.print("Digite o número do serviço desejado: ");
        int servicoEscolhido = scanner.nextInt();

        Servico servico;
        if (servicoEscolhido == 1) {
            servico = new LavagemSimples();
        } else if (servicoEscolhido == 2) {
            servico = new LavagemCompleta();
        } else {
            System.out.println("Serviço inválido.");
            scanner.close();
            return;
        }

        // Exibir resumo
        System.out.println("\nResumo do pedido:");
        System.out.println("Cliente: " + cliente.getNome() + ", Telefone: " + cliente.getTelefone());
        System.out.println("Veículo: " + veiculo.getMarca() + " " + veiculo.getModelo());
        System.out.println("Serviço: " + servico.getDescricao() + ", Preço: " + servico.calcularPreco());

        scanner.close();
    }
}
