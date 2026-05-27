
---
## 1. Descrição do Projeto

O projeto desenvolvido no primeiro semestre de 2024 consistiu no desenvolvimento de uma **Calculadora Científica e Financeira via Terminal**. A aplicação foi projetada para oferecer uma gama diversificada de operações matemáticas, segmentada em quatro grandes pilares: operações aritméticas básicas, estruturas algébricas avançadas (como cálculo fatorial e funções de segundo grau), conversão de bases numéricas (sistemas binário, octal, decimal e hexadecimal) e módulos de matemática financeira (cálculos de juros simples e compostos).

### 1.1 Objetivo Geral

Desenvolver uma aplicação em ambiente de linha de comando (CLI) que centralize cálculos matemáticos e financeiros complexos, garantindo alta performance, precisão computacional e uma interface intuitiva que mitigue erros de entrada por parte do usuário através de validações estritas.

### 1.2 Objetivos Específicos

- **Modularização de Operações:** Segregar as responsabilidades matemáticas do sistema, permitindo desde operações aritméticas triviais até projeções financeiras em módulos independentes.
    
- **Didática Operacional (Passo a Passo):** Guiar o usuário de forma assistida durante a execução de fórmulas complexas, decompondo os estágios do cálculo para demonstrar a resolução lógica da equação.
    
- **Tratamento de Exceções:** Implementar travas de segurança algorítmica para evitar falhas críticas, como divisões por zero ou estouro de memória por inserção de dados inválidos.
    

## 2. Tecnologias Utilizadas

### TypeScript

Utilizado como a linguagem principal para o desenvolvimento da arquitetura do sistema, englobando tanto a construção da interface textual no terminal quanto a implementação da lógica matemática subjacente. A escolha do TypeScript justificou-se por sua tipagem estática, que confere maior previsibilidade ao código, reduz a ocorrência de bugs em tempo de execução e garante aderência aos padrões modernos de desenvolvimento de software.

### Portugol (Pseudocódigo)

Adotado na fase de concepção e modelagem arquitetural do projeto. A utilização do Portugol permitiu o mapeamento puramente lógico e estrutural dos algoritmos de cálculo antes da codificação definitiva. Essa abordagem metodológica isolou a complexidade sintática da linguagem de programação, assegurando a corretitude dos fluxos e das estruturas de controle (laços de repetição e condicionais) na resolução dos problemas matemáticos.

## 3. Contribuição para o Projeto

Minha atuação no projeto concentrou-se no desenvolvimento do núcleo de processamento matemático, na padronização da interface baseada em texto (CLI) e na garantia de estabilidade do código principal. Minhas contribuições específicas incluíram:

- **Módulo de Cálculo Fatorial:** Desenvolvi a lógica algorítmica para o cálculo de números fatoriais. O foco técnico esteve voltado à otimização do código e ao controle de limites numéricos, prevenindo problemas clássicos de _overflow_ (estouro de capacidade da variável) e garantindo a estabilidade da aplicação ao inserir números muito grandes.
    
- **Módulo de Aritmética Básica (Adição e Subtração):** Implementei as funções fundamentais de adição e subtração em TypeScript.
    
- **Refatoração, Depuração (_Bug Fix_) e Padronização Visual:** Identifiquei e corrigi falhas críticas na ramificação principal (_main branch_) que impediam a inicialização correta da aplicação. Adicionalmente, atuei na padronização visual da interface de linha de comando, estruturando menus consistentes para melhorar a legibilidade e a navegabilidade do usuário através do terminal.
    

## 4. Lições Aprendidas (Hard Skills & Soft Skills)

### Hard Skills

- **Lógica e Estruturas de Algoritmos:** Sólida evolução no pensamento algorítmico e na estruturação de fluxos lógicos através do uso prévio de pseudocódigo (Portugol), o que viabilizou uma validação conceitual mais rigorosa antes da implementação técnica.
    
- **Fundamentos de TypeScript:** Domínio prático da sintaxe de uma das linguagens mais demandadas pelo mercado, compreendendo conceitos de tipagem, controle de fluxo e manipulação de entrada/saída via terminal.
    
- **Garantia de Qualidade e Versionamento:** Experiência prática com Git no processo de identificação, isolamento e resolução de conflitos/bugs que comprometiam o estado estável da aplicação no repositório.
    

### Soft Skills

- **Comunicação:** Participação ativa em reuniões de alinhamento (_Daily Meetings_) semanais para exposição do progresso técnico e compartilhamento de ideias, otimizando o fluxo de aprendizado diante de novos conceitos.
    
- **Trabalho em Equipe e Cultura Ágil:** Engajamento no gerenciamento de tarefas por meio de fluxos de trabalho visuais (quadros de _cards_), colaborando diretamente com os pares e exercitando a proatividade ao buscar suporte técnico com integrantes mais experientes sempre que surgiam barreiras complexas de desenvolvimento.