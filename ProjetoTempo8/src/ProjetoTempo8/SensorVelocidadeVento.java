package ProjetoTempo8;



import java.util.Scanner; // Importa a classe Scanner para entrada de dados do usuário

public class SensorVelocidadeVento extends Thread { // Declaração da classe SensorVelocidadeVento, que estende a classe Thread
    
    private double velocidadeVento; // Variável para armazenar o valor da velocidade do vento
    private boolean dentroDoIntervalo; // Variável booleana para verificar se a velocidade do vento está dentro do intervalo normal

    // Construtor da classe SensorVelocidadeVento
    public SensorVelocidadeVento() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite a velocidade do vento (m/s): "); // Solicita ao usuário que digite a velocidade do vento
       
        this.velocidadeVento = scanner.nextDouble(); // Lê o valor da velocidade do vento fornecido pelo usuário
        this.dentroDoIntervalo = velocidadeVento >= 5 && velocidadeVento <= 10; // Verifica se a velocidade do vento está dentro do intervalo normal
    }

    // Método run, que será executado quando a thread for iniciada
    public void run() {
        if (!dentroDoIntervalo) { // Verifica se a velocidade do vento está fora do intervalo normal
            System.out.println("A velocidade do vento está fora do normal."); // Imprime mensagem indicando que a velocidade do vento está fora do normal
       
        } else {
            System.out.println("A velocidade do vento está normal."); // Se estiver dentro do intervalo, imprime mensagem indicando que a velocidade do vento está normal
        }
    }

    // Método para verificar se a velocidade do vento está dentro do intervalo normal
    public boolean isDentroDoIntervalo() {
        return dentroDoIntervalo; // Retorna true se a velocidade do vento estiver dentro do intervalo, false caso contrário
    }
}
