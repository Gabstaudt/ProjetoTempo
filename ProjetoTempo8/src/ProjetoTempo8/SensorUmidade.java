package ProjetoTempo8;


import java.util.Scanner; // Importa a classe Scanner para entrada de dados do usuário

public class SensorUmidade extends Thread { // Declaração da classe SensorUmidade, que estende a classe Thread
    
    private double umidade; // Variável para armazenar o valor da umidade
    private boolean dentroDoIntervalo; // Variável booleana para verificar se a umidade está dentro do intervalo normal

    // Construtor da classe SensorUmidade
    public SensorUmidade() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite a umidade (%): "); // Solicita ao usuário que digite a umidade
       
        this.umidade = scanner.nextDouble(); // Lê o valor da umidade fornecido pelo usuário
        this.dentroDoIntervalo = umidade >= 40 && umidade <= 70; // Verifica se a umidade está dentro do intervalo normal
    }

    // Método run, que será executado quando a thread for iniciada
    public void run() {
        if (!dentroDoIntervalo) { // Verifica se a umidade está fora do intervalo normal
            System.out.println("A umidade está fora do normal."); // Imprime mensagem indicando que a umidade está fora do normal
       
        } else {
            System.out.println("A umidade está normal."); // Se estiver dentro do intervalo, imprime mensagem indicando que a umidade está normal
        }
    }

    // Método para verificar se a umidade está dentro do intervalo normal
    public boolean isDentroDoIntervalo() {
        return dentroDoIntervalo; // Retorna true se a umidade estiver dentro do intervalo, false caso contrário
    }
}
