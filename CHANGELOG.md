# Diario de Desenvolvimento
## A Ideia desse documento :
A Ideia é documentar o que estou aprendendo com esse projeto e também registrar os percausos que estiver passando nesse desenvolvimento, separado por datas também. </br>
Diferente do ReadMe que vai orientar como realizar o uso da API

### Ideia da aplicação inicial
A Ideia da criação dessa aplicação veio para ajudar minha mãe, na época estava aprendendo C# e fiz uma aplicação de console na época, tive a ideia de refazer porem agora mais completo, usando Spring-boot, um banco de dados e ter um front-end e até um sistema de login para praticar o uso do Spring Security</br>
Criei o projeto no dia 02 de maio mas comecei a desenvolver no dia 03 de maio, em um domingo

### 03 de maio de 2026
Comecei o desenvolvimento e o meu primeiro passo foi entender a arquitetura que iria utilizar no projeto e como iria organizar o projeto também. </br>
Entendi como funciona a arquitetura de camadas e como cada parte se comunica fazendo todas as engrenagens se encaixarem. Comecei construindo a imagem do docker e separando pelo padrão Package by Layered (Tive uma duvida entre usar a Package por camadas ao invés do Package por features(funcionalidades))
#### Motivo da escolha de organização
Como esse é um projeto que acredito vai ser no máximo de médio porte, e o único dev desse projeto vai ser só eu, então não vi a necessidade de organizar por Package features, já que faria mais sentido se fosse trabalhado ordenando por features e separando grupos para alterar features especificas.