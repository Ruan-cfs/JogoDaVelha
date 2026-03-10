# ❌ Jogo da Velha - Demonstração de Lógica e Matrizes Java

Este projeto é uma demonstração prática do uso de matrizes e estruturas de repetição em **Java**. Ele implementa o clássico Jogo da Velha (Tic-Tac-Toe) para ser jogado via console, servindo como um excelente exercício de lógica de programação.

## 🚀 O que estou praticando?

Neste projeto, explorei conceitos fundamentais para o desenvolvimento de jogos e manipulação de dados:

* **Matrizes (Arrays Multidimensionais):** Utilização de uma matriz 3x3 de objetos da classe `Campo` para representar o tabuleiro do jogo.
* **Tratamento de Exceções:** Uso de blocos `try-catch` para lidar com possíveis erros durante as jogadas e manter a execução do programa.
* **Lógica de Verificação:** Implementação de algoritmos para checar condições de vitória em linhas, colunas e diagonais (principal e secundária).
* **Interação com o Usuário:** Uso da classe `Scanner` para capturar as coordenadas (linha e coluna) informadas pelos jogadores.

## 🎮 Funcionalidades

* **Gerenciamento de Turnos:** O sistema alterna automaticamente entre os jogadores 'X' e 'O'.
* **Validação de Jogada:** O código verifica se um campo já está preenchido antes de permitir a marcação, evitando jogadas inválidas.
* **Visualização Dinâmica:** O tabuleiro é redesenhado no console a cada rodada para mostrar o estado atual da partida.
* **Detecção de Vitória:** O jogo identifica imediatamente quando um jogador completa uma sequência e encerra a partida anunciando o vencedor.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 15).
* **IDE:** IntelliJ IDEA.

## 📝 Como Jogar

Ao iniciar o programa através da classe `Main`, os jogadores devem informar o número da **Linha** (0, 1 ou 2) e da **Coluna** (0, 1 ou 2) onde desejam colocar seu símbolo. O jogo continua até que alguém vença ou o tabuleiro seja preenchido.

---

*Este projeto demonstra minha evolução na resolução de problemas lógicos e no controle de fluxo em aplicações Java.*
