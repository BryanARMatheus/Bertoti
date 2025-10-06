```mermaid
    classDiagram
        direction TB

        %% Interface
        <<interface>> ArquivosSistema
        ArquivosSistema : +String getNome()
        ArquivosSistema : +int getTamanho()
        ArquivosSistema : +void exibir()
        ArquivosSistema : +boolean isArquivo()

        %% Classes implementing the interface
        class Arquivo {
            -String nome
            -int tamanho
            -String conteudo
            +Arquivo(String nome, String conteudo)
            +String getConteudo()
            +void setConteudo(String conteudo)
            +void setNome(String nome)
        }

        class Pasta {
            -String nome
            -List~ArquivosSistema~ arquivos
            -int tamanhoTotal
            +Pasta(String nome)
            +void adicionarArquivo(ArquivosSistema arquivoNovo)
            +void removerArquivo(ArquivosSistema arquivoParaRemover)
            +ArquivosSistema procurarArquivo(String nome)
            +void setNome(String nome)
        }

        %% Implementation relationships
        Arquivo ..|> ArquivosSistema
        Pasta ..|> ArquivosSistema

        %% Composition relationship
        Pasta *-- "0..*" ArquivosSistema : contains
```