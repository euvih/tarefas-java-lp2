public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int anoFabricacao, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = velocidadeAtual < 0 ? 0 : velocidadeAtual;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            System.out.println("Acelerando " + valor + " km/h.");
        } else {
            System.out.println("Erro: o valor para acelerar deve ser positivo.");
        }
    }

    public void frear(int valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor para frear deve ser positivo.");
        } else {
            velocidadeAtual = Math.max(0, velocidadeAtual - valor);
            System.out.println("Freando " + valor + " km/h.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Carro ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
