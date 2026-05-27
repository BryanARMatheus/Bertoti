
---
## 1. Descrição do Projeto

O projeto desenvolvido no segundo semestre de 2024 consistiu no desenvolvimento de um **Sistema de Avaliação baseado na Metodologia PACER** (Proatividade, Autonomia, Colaboração e Entrega de Resultados). A aplicação foi projetada para atuar como uma plataforma de gestão de desempenho, automatizando o processo de avaliação entre colegas em suas competências comportamentais (_soft skills_).

### 1.1 Objetivo Geral

Desenvolver um sistema desktop integrado que otimize a coleta de métricas de desempenho, realize o cálculo automatizado e a consolidação estatística das médias individuais dos estudantes, permita ao professor que altere membros da equipe, data de sprints e garanta a persistência segura dos dados em um sistema gerenciador de banco de dados relacional.

### 1.2 Objetivos Específicos

- **Centralização Arquitetural:** Unificar o fluxo de informações operacionais e acadêmicas em um repositório centralizado, eliminando a dispersão de dados.
    
- **Coleta Assistida de Dados:** Disponibilizar uma interface intuitiva para que os alunos realizem avaliações e autoavaliações de forma rápida, transmitindo os parâmetros diretamente ao servidor.
    
- **Painel Gerencial Executivo (Dashboard):** Prover uma visão consolidada para o professor, permitindo a análise rápida de médias, dispersões e avaliações históricas de grupos específicos.
    
- **Carga de Dados em Lote:** Viabilizar a ingestão de dados legados por meio da importação e do _parsing_ automatizado de arquivos textuais estruturados em formato `.csv`.
    
- **Geração de Relatórios Teledirigidos:** Emitir relatórios analíticos contendo os índices agregados de desempenho para apoiar e agilizar tomadas de decisão por parte dos professores.
    

## 2. Tecnologias Utilizadas

### Java & JavaFX

A linguagem Java foi adotada para a implementação das regras de negócio e da camada de persistência, aproveitando sua robustez, tipagem estática e aderência aos padrões de Orientação a Objetos. A interface gráfica do usuário (GUI) foi desenvolvida utilizando o ecossistema **JavaFX**, permitindo a criação de componentes visuais modulares, interfaces responsivas e uma experiência de navegação fluida em ambiente desktop.

### MySQL

Como sistema gerenciador de banco de dados (SGBD) relacional, utilizou-se o MySQL. Por conta em sua alta performance para operações de leitura e escrita, estabilidade de mercado e ampla facilidade de integração com ecossistemas Java através de drivers JDBC (_Java Database Connectivity_) foi escolhida como nosso principal SGDB.

### Figma

Utilizado como ferramenta de _UI/UX Design_ para a concepção e prototipagem de alta fidelidade das interfaces. O Figma permitiu realizar o mapeamento do fluxo do usuário, a distribuição espacial de componentes e a validação do layout antes do estágio de codificação.

## 3. Contribuição para o Projeto

Com atuação unificada em todo o ciclo de desenvolvimento (_Full-Stack_), fui responsável pela arquitetura de módulos visuais e por lógicas complexas de processamento no _back-end_. Minhas principais contribuições incluíram:

- **Subsistema de Ingestão e Processamento de CSV:** Projetei e implementei o pipeline de importação de arquivos textuais. Desenvolvi a lógica do _back-end_ para o tratamento e validação sintática das linhas do arquivo `.csv`.
    
- **Módulo de Monitoramento de Equipes (Painel Dinâmico):** Desenvolvi a tela principal de consulta de equipes. Para os alunos, a interface exibe de forma restrita o desempenho consolidado de seu respectivo grupo; para os docentes, implementei componentes de seleção que acionam consultas parametrizadas para renderizar as médias em tempo real de qualquer equipe cadastrada.
    
- **Mecanismo de Agregação Estatística e Validação de Negócio:** Desenvolvi os algoritmos responsáveis por computar a média aritmética ponderada dos critérios avaliativos com base nas respostas submetidas. Adicionalmente, implementei uma trava de segurança a nível de aplicação para garantir a restrição de integridade, impedindo que um usuário realize a mesma avaliação mais de uma vez.
    

## 4. Lições Aprendidas (Hard Skills & Soft Skills)

### Hard Skills

- **Desenvolvimento Desktop com Java/JavaFX:** Domínio prático na construção de interfaces gráficas baseadas em eventos, ciclo de vida de componentes visuais e aplicação de algoritmos em Java para a manipulação de regras de negócio.
    
- **Persistência de Dados e Integração SQL:** Evolução na escrita de consultas estruturadas (DML e DQL) no MySQL e na amarração da camada de aplicação com o banco de dados para execução de transações dinâmicas.
    
- **Garantia de Versionamento e Git Flow:** Consolidação de boas práticas em sistemas de controle de versão (Git/GitHub), compreendendo o uso estratégico de ramificações (_Feature Branches_) e o processo de integração contínua de código.
    

### Soft Skills

- **Trabalho em Equipe e Engenharia Colaborativa:** Aprimoramento na dinâmica de desenvolvimento em equipe, providenciando ajuda aos membros e alinhando interfaces técnicas para garantir o acoplamento correto entre as diferentes telas do sistema.
    
- **Adaptabilidade em Cultura Ágil:** Exercício prático na entrega contínua de software funcional, integrando requisitos de múltiplas matérias de forma iterativa ao longo do ciclo do projeto.