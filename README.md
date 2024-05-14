# ProjetoTempo

Esta classe representa um sensor de umidade em um sistema de monitoramento de clima. Ela permite aos usuários inserir a umidade atual e verifica se está dentro do intervalo considerado normal.

Funcionalidade:

Ao ser instanciada, solicita ao usuário que insira a umidade atual em percentagem.
Verifica se a umidade está dentro do intervalo normal (entre 40% e 70%).
Executa em uma thread separada para permitir monitoramento simultâneo de múltiplos sensores.
Ao ser iniciada, imprime uma mensagem indicando se a umidade está dentro ou fora do intervalo normal.

Contexto:
Assim como a classe SensorTemperatura, esta classe foi desenvolvida como parte do projeto para a disciplina de Sistemas Operacionais. Ela faz parte do sistema de monitoramento de clima que utiliza múltiplos sensores para determinar as condições climáticas.

Classe SensorVelocidadeVento
Propósito:
Esta classe representa um sensor de velocidade do vento em um sistema de monitoramento de clima. Ela permite aos usuários inserir a velocidade do vento atual e verifica se está dentro do intervalo considerado normal.

Funcionalidade:

Ao ser instanciada, solicita ao usuário que insira a velocidade do vento atual em metros por segundo.
Verifica se a velocidade do vento está dentro do intervalo normal (entre 5 m/s e 10 m/s).
Executa em uma thread separada para permitir monitoramento simultâneo de múltiplos sensores.
Ao ser iniciada, imprime uma mensagem indicando se a velocidade do vento está dentro ou fora do intervalo normal.

Contexto:
Esta classe também foi desenvolvida como parte do projeto para a disciplina de Sistemas Operacionais, juntamente com as outras classes de sensores. Ela contribui para o sistema de monitoramento de clima ao fornecer dados sobre a velocidade do vento.
