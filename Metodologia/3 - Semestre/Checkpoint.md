
---

## 1. Descrição do Projeto

O projeto desenvolvido no primeiro semestre de 2025 consistiu no desenvolvimento de um **Sistema de Registro de Movimentações** voltado para a gestão de controle de acesso de colaboradores terceirizados. A aplicação foi concebida em parceria com a empresa **Altave**, uma instituição especializada no desenvolvimento de balões para monitoramento inteligente de áreas extensas, utilizando Inteligência Artificial (IA) e inteligência de vídeo (*video analytics*) para a mitigação de riscos operacionais e prevenção de catástrofes ambientais.

### 1.1 Objetivo Geral

Desenvolver uma aplicação web robusta, segura e escalável para automatizar o controle e a administração dos horários de entrada e saída de funcionários terceirizados em ambientes de manutenção naval.

### 1.2 Objetivos Específicos

* **Automatização de Processos:** Substituir controles manuais por um fluxo digitalizado de registro de ponto.
* **Inteligência de Dados:** Prover painéis com gráficos gerenciais para análise de frequência e movimentação.
* **Interoperabilidade:** Permitir a exportação de relatórios customizados em formatos legíveis por planilhas (`.csv`).
* **Consistência de Ambiente:** Adotar a conteinerização para garantir a padronização do ambiente de desenvolvimento e produção.

---

## 2. Tecnologias Utilizadas

### Vue.js & Ant Design Vue

O Vue.js foi o framework progressivo de JavaScript selecionado para a construção da camada visual (*front-end*). Segundo a documentação oficial, sua arquitetura baseada em componentes reativos otimiza a renderização da interface e melhora a experiência do usuário (UX). Em conjunto, utilizou-se a biblioteca **Ant Design Vue** para padronizar os componentes de UI, garantindo consistência visual e agilidade no desenvolvimento através de uma grade (*grid*) de componentes pré-estilizados.

### Java & Spring Boot

Para a construção do ecossistema de *back-end*, utilizou-se a linguagem Java devido à sua robustez, tipagem estática e forte orientação a objetos. O desenvolvimento foi viabilizado pelo **Spring Boot** que, conforme aponta a literatura técnica, simplifica o ecossistema Spring por meio de sua configuração automática, gerenciamento de dependências (*starter dependencies*) e servidor embutido, agilizando drasticamente a criação de APIs RESTful prontas para produção.

### PostgreSQL

Como Sistema Gerenciador de Banco de Dados (SGBD), optou-se pelo PostgreSQL. Trata-se de um banco de dados relacional de código aberto, amplamente reconhecido por sua estrita adesão aos padrões SQL, suporte a transações ACID (Atomicidade, Consistência, Isolamento e Durabilidade) e alta confiabilidade na manutenção da integridade dos dados operacionais.

### Docker

A plataforma Docker foi integrada ao fluxo de trabalho para centralizar e isolar a aplicação em contêineres independentes. Através do empacotamento do código e de suas dependências em imagens Docker, mitigou-se o clássico problema de inconsistência de ambiente ("*funciona na minha máquina*"), padronizando a execução do sistema em qualquer infraestrutura.

### Figma

Utilizado como ferramenta de _UI/UX Design_ para a concepção e prototipagem de alta fidelidade das interfaces. O Figma permitiu realizar o mapeamento do fluxo do usuário, a distribuição espacial de componentes e a validação do layout antes do estágio de codificação.

---

## 3. Contribuição para o Projeto

Com foco de atuação direcionado à camada de **Front-end**, assumi a responsabilidade pelo desenvolvimento de módulos críticos da interface, garantindo a comunicação fluida com os serviços de *back-end*. Minhas principais contribuições incluíram:

* **Módulo de Cadastro de Funcionários:** Desenvolvi a interface de persistência de dados utilizando componentes reativos do Vue.js. Implementou-se a integração com a API RESTful por meio da biblioteca **Axios**, gerenciando o ciclo de vida das requisições HTTP e o tratamento básico de respostas do servidor.
* **Tabela Dinâmica de Registros e Movimentações:** Atuei no desenvolvimento da tabela de visualização de pontos. O desafio técnico consistiu na formatação de dados brutos (como *timestamps*) recebidos do banco de dados para exibições amigáveis ao usuário. Adicionalmente, implementei a lógica de edição em tempo real dos registros, reforçando os serviços do Axios para o envio de requisições de atualização (`PUT`).
* **Subsistema de Exportação em Lote (.csv):** Projetei e implementei a funcionalidade de extração de relatórios. Esta tarefa exigiu o entendimento de conceitos de paginação de dados do lado do servidor (*server-side pagination*), manipulação de *buffers* no JavaScript para conversão de grandes volumes de dados e a geração dinâmica de arquivos para *download* no navegador de forma otimizada.

---

## 4. Lições Aprendidas (Hard Skills & Soft Skills)

### Hard Skills

* **Vue.js & Axios:** Autonomia no desenvolvimento de páginas, componentização e consumo de APIs REST de forma assíncrona.
* **Estilização e CSS/SASS:** Aprimoramento em estilização avançada de layouts e adoção do pré-processador SASS para reaproveitamento de código e organização de folhas de estilo.
* **Fundamentos de Java (Back-end):** Compreensão prática de conceitos de Programação Orientada a Objetos (POO), tratamento de exceções, boas práticas de Código Limpo (*Clean Code*) e manipulação de fluxos com a API de *Streams*.
* **Persistência de Dados (SQL/PostgreSQL):** Evolução na escrita de consultas estruturadas, modelagem de entidades-relacionamentos (DER) e restrições de integridade no banco de dados.
* **DevOps Fundamental (Docker):** Introdução prática ao conceito de conteinerização, manipulação de imagens e gerenciamento de contêineres de desenvolvimento.

### Soft Skills

* **Comunicação Assertiva:** Prática diária na exposição de ideias e alinhamento técnico com toda a equipe, facilitando a identificação precoce de impedimentos no desenvolvimento (*blockers*).
* **Trabalho em Equipe e Cultura Ágil:** Atuação ativa no acompanhamento das tarefas do quadro (*cards*), colaborando ativamente com os membros e exercitando a maturidade profissional de buscar orientação com membros mais experientes do time sempre que necessário.