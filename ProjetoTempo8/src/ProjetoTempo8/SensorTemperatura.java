package ProjetoTempo8;




import java.util.Scanner; // Importa a classe Scanner para entrada de dados do usuário

public class SensorTemperatura extends Thread { // Declaração da classe SensorTemperatura, que estende a classe Thread
    
    private double temperatura; // Variável para armazenar o valor da temperatura
    private boolean dentroDoIntervalo; // Variável booleana para verificar se a temperatura está dentro do intervalo normal

    // Construtor da classe SensorTemperatura
    public SensorTemperatura() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite a temperatura (°C): "); // Solicita ao usuário que digite a temperatura
       
        this.temperatura = scanner.nextDouble(); // Lê o valor da temperatura fornecido pelo usuário
        this.dentroDoIntervalo = temperatura <= 30; // Verifica se a temperatura está dentro do intervalo normal
    }

    // Método run, que será executado quando a thread for iniciada
    public void run() {
        if (!dentroDoIntervalo) { // Verifica se a temperatura está fora do intervalo normal
            System.out.println("A temperatura está fora do normal."); // Imprime mensagem indicando que a temperatura está fora do normal
       
        } else {
            System.out.println("A temperatura está normal."); // Se estiver dentro do intervalo, imprime mensagem indicando que a temperatura está normal
        }
    }

    // Método para verificar se a temperatura está dentro do intervalo normal
    public boolean isDentroDoIntervalo() {
        return dentroDoIntervalo; // Retorna true se a temperatura estiver dentro do intervalo, false caso contrário
    }
}

