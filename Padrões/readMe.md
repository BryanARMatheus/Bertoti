# 1.Stategy
Este padrão envolve o uso de interfaces contrário a herança, deixando os codigos mais limpos, ao mesmo tempo evitando repetição de funções, alem de tornar a troca de codigos mais facil e simples
### Diferenças entre padrão e anti-padrão
- **Padrão:** Separa o código em varias classes juntamente com uma interface, tornando facil a reutilização e modificação de codigo.
- **Anti-Padrão:** Não utiliza de interfaces, causando o repetimento de varias funções, muitas vezes para classes que não precisam da dita função.
# Tabela Comparativa: Padrões vs Anti-Padrões

# 2. Observer
Este padrão gira em volta de uma classe que cria varios observadores e notifica outras classes sobre eventos que a classe que está sendo observada executa, deixando o codigo mais limpo e menos acoplado.
### Diferenças entre padrão e anti-padrão
- **Padrão:** Com a implementação deste objeto que cria observadores e envia notificações caso tenha uma mudança de estado, assim tornando o codigo se turna muito menos acoplado.
- **Anti-Padrão:** Os objetos são extremamente dependentes um dos outros fazendo chamadas constantes entre si, tornando o sistema de dificil manutenção e promovendo o uso de codigo extremamente ineficiente que sempre está rodando em segundo plano.

# 3. Composite
Este padrão permite tratar objetos individuais e composições de objetos de forma similar a uma estrutura de arvore, este tipo de codigo evita acoplamento forte entre codigos e tratar componentes de maneira similar mas tendo a possibilidade de ser diferente.
### Diferenças entre padrão e anti-padrão
- **Padrão:** Define objetos em um padrão fixo e simples de entender, muitas vezes evitando codigo repetido e facilitando a implementação.
- **Anti-Padrão:** Tem serios problemas em diferenciar objetos compostos e individuais que estão conectados, reforçando o uso constante de verificações atraves do codigo.
- 
# Tabela
| **Padrão** | **Definição** | **Padrão (Implementação Correta)** | **Anti-Padrão (Implementação Incorreta)** |
|------------|---------------|-----------------------------------|------------------------------------------|
| **Strategy** | Envolve o uso de interfaces contrário a herança, deixando os códigos mais limpos, evitando repetição de funções e tornando a troca de códigos mais fácil e simples. | Separa o código em várias classes juntamente com uma interface, tornando fácil a reutilização e modificação de código. | Não utiliza interfaces, causando o repetimento de várias funções, muitas vezes para classes que não precisam da dita função. |
| **Observer** | Gira em volta de uma classe que cria vários observadores e notifica outras classes sobre eventos que a classe que está sendo observada executa, deixando o código mais limpo e menos acoplado. | Com a implementação deste objeto que cria observadores e envia notificações caso tenha uma mudança de estado, tornando o código muito menos acoplado. | Os objetos são extremamente dependentes uns dos outros fazendo chamadas constantes entre si, tornando o sistema de difícil manutenção e promovendo o uso de código ineficiente. |
| **Composite** | Permite tratar objetos individuais e composições de objetos de forma similar a uma estrutura de árvore, evitando acoplamento forte e tratando componentes de maneira similar com possibilidade de diferenças. | Define objetos em um padrão fixo e simples de entender, evitando código repetido e facilitando a implementação. | Tem sérios problemas em diferenciar objetos compostos e individuais conectados, reforçando o uso constante de verificações através do código. |
