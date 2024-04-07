# TP-1-AEDS3
Respositório para o primeiro TP de AEDS-3 do curso de Ciência da Computação PUC-MG

Alunos: Gabriel Samarane, João Madeira

Descrição:

Nosso projeto desenvolve um sistema CRUD (Create, Read, Update, Delete) que implementa um mecanismo de gerenciamento de espaço para registros excluídos. Esse método de gerenciamento de espaço é projetado para otimizar o uso de espaço de armazenamento reutilizando áreas previamente ocupadas por registros que foram deletados. Quando um novo registro é criado ou um registro existente é atualizado para um tamanho maior, nosso sistema automaticamente verifica a disponibilidade de espaços deixados por registros excluídos que sejam grandes o suficiente para acomodar o novo ou atualizado registro. Além disso, criamos uma classe Movie.java para testar as funcionalidades no CRUD.

CheckList:

1- O que você considerou como perda aceitável para o reuso de espaços vazios, isto é, quais são os critérios para a gestão dos espaços vazios?

Resposta: O registro sempre terá o tamanho do primeiro objeto nele inserido, ou seja, apenas objetos de tamanho igual ou inferior poderão ser inseridos ali

2- O código do CRUD com arquivos de tipos genéricos está funcionando corretamente?

Resposta: Sim

3- O CRUD tem um índice direto implementado com a tabela hash extensível?

Resposta: Não

4- A operação de inclusão busca o espaço vazio mais adequado para o novo registro antes de acrescentá-lo ao fim do arquivo?

Resposta: Não, ela busca o primeiro espaço disponível

5- A operação de alteração busca o espaço vazio mais adequado para o registro quando ele cresce de tamanho antes de acrescentá-lo ao fim do arquivo?

Resposta: Não, ela busca o primeiro espaço disponível

6- As operações de alteração (quando for o caso) e de exclusão estão gerenciando os espaços vazios para que possam ser reaproveitados?

Resposta: Sim

7- O trabalho está funcionando corretamente?

Resposta: Sim

8- O trabalho está completo?

Resposta: Sim

9- O trabalho é original e não a cópia de um trabalho de um colega?

Resposta: Sim
