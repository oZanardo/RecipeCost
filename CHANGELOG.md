# Diario de Desenvolvimento
## A Ideia desse documento :
A Ideia é documentar o que estou aprendendo com esse projeto e também registrar os percausos que estiver passando nesse desenvolvimento, separado por datas também. </br>
Diferente do ReadMe que vai orientar como realizar o uso da API

### Ideia da aplicação inicial
A Ideia da criação dessa aplicação veio para ajudar minha mãe, na época estava aprendendo C# e fiz uma aplicação de console na época, tive a ideia de refazer porem agora mais completo, usando Spring-boot, um banco de dados e ter um front-end e até um sistema de login para praticar o uso do Spring Security</br>
Criei o projeto no dia 02 de maio mas comecei a desenvolver no dia 03 de maio, em um domingo

## 03 de maio de 2026
Comecei o desenvolvimento e o meu primeiro passo foi entender a arquitetura que iria utilizar no projeto e como iria organizar o projeto também. </br>
Entendi como funciona a arquitetura de camadas e como cada parte se comunica fazendo todas as engrenagens se encaixarem. Comecei construindo a imagem do docker e separando pelo padrão Package by Layered (Tive uma duvida entre usar a Package por camadas ao invés do Package por features(funcionalidades))
#### Motivo da escolha de organização
Como esse é um projeto que acredito vai ser no máximo de médio porte, e o único dev desse projeto vai ser só eu, então não vi a necessidade de organizar por Package features, já que faria mais sentido se fosse trabalhado ordenando por features e separando grupos para alterar features especificas.

## 16 de Maio de 2026
Finalizada a criação das entidades dos banco de dados e criada a relação entre eles
### Explicação das entidades
Criei 3 entidades para o banco de dados, 1. Ingrediente, 2. ItemReceita e 3. RecipeCost, função de cada um :
1. Ingrediente : vou salvar as informações de compras aqui, preço do pacote e quantidade que vem no pacote
2. ItemReceita : aqui vai ser onde vamos salvar a quantidade que é usada em cada receita para não precisarmos ficar cadastrando produtos duplicados nas receitas quando tivermos que usar o mesmo ingrediente mas com quantidades diferentes
3. RecipeCost : Essa é a tabela final, onde ficará as informações da receita, como nome, valor final e uma lista de itens usados na receita

### Escolhas de arquitetura nas entidades
A escolha do armazenamento dos dados de quantidade e valores foi feita em BigDecimal, ciente dele ser consideravelmente mais pesado do que um double ou um int, mas a escolha dele para valores monetários é justa pela questão que ele é o valor mais exato que temos e quanto o assunto é dinheiro devemos focar na precisão, agora na questão de quantidades
reconheço que não tem essa necessidade, mas fiz essa escolha para não ter problemas principalmente na hora de fazer contas com o valor e também para o usuário poder digitar e ter informações sobre os numeros decimais, a escoha do double tbm foi considerada mas acumularia erros a cada utilização entre ele e o valor financeiro, mas ainda estou pensando em utiliza-lo, vou analizar melhor nos próximos dias