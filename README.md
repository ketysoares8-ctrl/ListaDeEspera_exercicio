# Sistema de Fila de Espera - Clínica Médica

Este é um sistema simples em Java projetado para gerenciar a fila de espera de uma clínica médica. O projeto foi desenvolvido com o propósito acadêmico de aplicar conceitos fundamentais de estruturas de dados, implementando uma **Lista Encadeada (Linked List)** de forma manual, sem o uso de coleções nativas do Java (como `ArrayList` ou `LinkedList`).

## 🚀 Funcionalidades

O sistema interage com o usuário via console através de um menu dinâmico, oferecendo as seguintes opções:
1. **Adicionar paciente:** Insere um novo paciente no final da fila de espera.
2. **Listar pacientes:** Exibe todos os pacientes atualmente na fila, respeitando a ordem de chegada.
3. **Buscar paciente:** Verifica se um paciente específico está na fila (busca case-insensitive).
4. **Remover paciente:** Retira um paciente da fila por nome, ajustando os ponteiros da lista encadeada.

---

## 🛠️ Estrutura do Código

O projeto está dividido em três classes principais:

* **`Main.java`**: Contém o ponto de entrada do programa (`main`), gerencia o menu de controle (`switch-case`) e a leitura de dados do teclado usando a classe `Scanner`.
* **`FilaEspera.java`**: Atua como uma camada de regra de negócio, gerenciando a fila e encapsulando as chamadas para a estrutura de dados subjacente.
* **`ListaEncadeada.java`**: A implementação da estrutura de dados. Contém a classe interna `No` (Node) e toda a lógica de manipulação de ponteiros para adicionar, percorrer, buscar e remover elementos.

---

## 💻 Como Executar o Projeto

### Pré-requisitos
* Java JDK 8 ou superior instalado.
* IDE de sua preferência (Eclipse, IntelliJ, VS Code) ou terminal.

### Passos para execução
1. Clone ou baixe os arquivos deste repositório em uma mesma pasta.
2. Abra o terminal na pasta onde os arquivos `.java` estão salvos.
3. Compile os arquivos de código-fonte:
   ```bash
   javac Main.java FilaEspera.java ListaEncadeada.java
