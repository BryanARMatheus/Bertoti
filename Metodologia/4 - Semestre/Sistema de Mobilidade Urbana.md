---

---

---
## 1. Descrição do Projeto

O projeto desenvolvido no segundo semestre de 2026 consistiu no desenvolvimento de uma **Plataforma de Inteligência de Dados Orientada à Mobilidade Urbana**, voltada para o monitoramento de radares e fluxo viário do município de São José dos Campos. O sistema realiza a ingestão e a análise de grandes volumes de dados de telemetria urbana, transformando registros brutos de tráfego em _dashboards_ interativos e indicadores gerenciais estratégicos. O produto foi projetado para atender tanto às demandas operacionais de gestores públicos da **Prefeitura de São José dos Campos** quanto às necessidades de consulta informativa do cidadão comum.

### 1.1 Objetivo Geral

Desenvolver uma aplicação web escalável que centralize, processe e converta dados brutos capturados por radares urbanos em indicadores de mobilidade (como índices de saturação de vias e densidade de tráfego), fornecendo subsídios visuais para a análise do comportamento do trânsito na região.

### 1.2 Objetivos Específicos

- **Processamento e Transformação de Dados:** Estruturar pipelines de dados capazes de converter registros brutos de passagem de veículos em métricas analíticas consolidadas.
    
- **Suporte à Tomada de Decisão (Data-Driven):** Fornecer ferramentas visuais que auxiliem a engenharia de tráfego na identificação precoce de gargalos, zonas de alta sinistralidade (acidentes) e pontos com recorrência de infrações por excesso de velocidade.
    

## 2. Tecnologias Utilizadas

### Vue.js & Vuetify

O Vue.js foi adotado como o framework de JavaScript para a construção de uma interface de usuário (_front-end_) reativa e modular. Sua arquitetura baseada em componentes otimiza o ciclo de vida da renderização, garantindo fluidez na manipulação de dados em tempo real. Em paralelo, integrou-se a biblioteca **Vuetify**, aplicando os princípios do _Material Design_ para padronizar os componentes de UI, o que acelerou o desenvolvimento através de um sistema de grades (_grids_) e elementos visuais pré-estilizados e acessíveis.

### Java & Spring Boot

Para o ecossistema de _back-end_, utilizou-se a linguagem Java devido à sua robustez, tipagem estática e forte aderência à Orientação a Objetos. O desenvolvimento das APIs RESTful foi viabilizado pelo **Spring Boot**, que simplificou a arquitetura do projeto por meio de configuração automática, injeção de dependências e um servidor web embutido, acelerando a disponibilização de serviços robustos prontos para produção.

### PostgreSQL & Oracle Cloud Infrastructure (OCI)

A persistência dos dados operacionais foi gerenciada pelo SGBD relacional **PostgreSQL**, escolhido por sua alta confiabilidade, estrita conformidade com os padrões SQL e excelente suporte a transações ACID. Para a infraestrutura de servidores e hospedagem do banco de dados, utilizou-se a nuvem da **Oracle (OCI)**, aproveitando os recursos avançados de computação e o programa _Always Free_ para garantir a disponibilidade do ambiente sem custos adicionais de manutenção.

### Docker

A plataforma Docker foi utilizada para isolar a aplicação e suas dependências em contêineres independentes e imutáveis. Esse processo de conteinerização garantiu a paridade entre os ambientes de desenvolvimento, homologação e produção, eliminando conflitos de configuração de infraestrutura técnica.

### Figma

Utilizado como ferramenta central de _UI/UX Design_ para o mapeamento dos fluxos de navegação, arquitetura de informação e criação de protótipos de alta fidelidade, garantindo a validação da usabilidade do sistema antes da fase de escrita do código.

## 3. Contribuição para o Projeto

Com atuação focada nas frentes de **Front-end Engineering** e **UI/UX Design**, fui responsável pela concepção da experiência do usuário, estruturação da arquitetura visual e desenvolvimento de mecanismos de integração da interface. Minhas principais contribuições foram:

- **Arquitetura e Configuração do Ambiente Front-end:** Estabeleci o ecossistema inicial do projeto no repositório, configurando o ecossistema Vue.js integrado ao pré-processador SASS. Essa base estrutural garantiu um fluxo de desenvolvimento limpo, padronizado e escalável para os demais desenvolvedores da equipe.
    
- **Desenvolvimento de Camada de Simulação (_Mocking Practice_):** Projetei e implementei um subsistema de dados simulados (_mocks_) no _front-end_, criando classes, interfaces e controladores espelhados na estrutura do banco de dados e do _back-end_. Essa estratégia permitiu o desenvolvimento completo e autônomo das telas e gráficos da interface de forma totalmente desacoplada, garantindo uma integração futura imediata e sem atritos.
    
- **Concepção de Design de Interface e Experiência do Usuário (UI/UX):** Assumi a responsabilidade total pelo design das interfaces no Figma. Apliquei boas práticas de IHC (Interação Humano-Computador) e arquitetura de informação, focando na simplificação de gráficos complexos e na distribuição harmônica de dados, tornando a visualização de indicadores densos intuitiva tanto para engenheiros de tráfego quanto para cidadãos comuns.
    

## 4. Lições Aprendidas (Hard Skills & Soft Skills)

### Hard Skills

- **Engenharia de Front-end (Vue.js, Axios & Mocking):** Autonomia na criação de componentes complexos, consumo assíncrono de APIs e simulação avançada de dados para desacoplamento de software.
    
- **Design de Interface & Experiência do Usuário (UI/UX):** Domínio prático do Figma para prototipação, definição de fluxogramas de usuário (_user flows_), teoria das cores aplicada à acessibilidade e design focado na legibilidade de dados (_data visualization_).
    
- **Estilização Avançada (SASS):** Implementação de arquiteturas CSS modulares com SASS, utilizando variáveis, mixins e aninhamentos para reaproveitamento de código técnico.
    
- **Infraestrutura em Nuvem e Banco de Dados:** Evolução em modelagem de dados (DER), normalização de tabelas e provisionamento prático de recursos de banco de dados relacionais em ambientes Cloud (Oracle Cloud Infrastructure).
    
- **DevOps Fundamental (Docker):** Prática no empacotamento de aplicações web e gerenciamento de contêineres multi-ambiente.
    

### Soft Skills

- **Comunicação Técnica e Colaborativa:** Articulação clara de ideias e alinhamento de requisitos técnicos com os membros da equipe, mitigando ruídos e acelerando a validação de novas funcionalidades.
    
- **Trabalho em Equipe sob Metodologia Ágil:** Atuação empática e colaborativa no mapeamento de dificuldades individuais do time, oferecendo suporte proativo para garantir o cumprimento das metas estabelecidas para a Sprint.