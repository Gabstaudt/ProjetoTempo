package ProjetoTempo8;



public class ClassePrincipal { // Definição da classe ClassePrincipal
    
    public static void main(String[] args) { // Método principal da aplicação
        System.out.println("Bem-vindo ao sistema de monitoramento de clima!"); // Mensagem de boas-vindas

        // Inicia as threads para cada sensor
        SensorTemperatura temperaturaSensor = new SensorTemperatura(); // Criação do objeto SensorTemperatura
        SensorUmidade umidadeSensor = new SensorUmidade(); // Criação do objeto SensorUmidade
        SensorVelocidadeVento velocidadeVentoSensor = new SensorVelocidadeVento(); // Criação do objeto SensorVelocidadeVento

        temperaturaSensor.start(); // Inicia a thread para o sensor de temperatura
        umidadeSensor.start(); // Inicia a thread para o sensor de umidade
        velocidadeVentoSensor.start(); // Inicia a thread para o sensor de velocidade do vento

        try { // Bloco try-catch para tratamento de exceções
            // Aguarda a conclusão de todas as threads
            temperaturaSensor.join(); // Espera a conclusão da thread do sensor de temperatura
            umidadeSensor.join(); // Espera a conclusão da thread do sensor de umidade
            velocidadeVentoSensor.join(); // Espera a conclusão da thread do sensor de velocidade do vento

            // Verifica se todos os sensores indicaram alterações simultaneamente
            if (!temperaturaSensor.isDentroDoIntervalo() && // Verifica se a temperatura está fora do intervalo normal
                !umidadeSensor.isDentroDoIntervalo() && // Verifica se a umidade está fora do intervalo normal
                !velocidadeVentoSensor.isDentroDoIntervalo()) { // Verifica se a velocidade do vento está fora do intervalo normal
                System.out.println("Alerta de chuva, cuidado!"); // Emite alerta de chuva intensa
            
            } else if (!temperaturaSensor.isDentroDoIntervalo() || // Verifica se pelo menos uma das condições é verdadeira
                       !umidadeSensor.isDentroDoIntervalo() ||
                       !velocidadeVentoSensor.isDentroDoIntervalo()) {
                System.out.println("Poucas chances de chuva."); // Emite mensagem de poucas chances de chuva
            
            } else {
                System.out.println("Sem chances de chuva hoje!"); // Emite mensagem de sem chances de chuva
            }
      
        } catch (InterruptedException e) { // Captura exceção de interrupção
            e.printStackTrace(); // Imprime rastreamento de pilha da exceção
        }
    }
}

