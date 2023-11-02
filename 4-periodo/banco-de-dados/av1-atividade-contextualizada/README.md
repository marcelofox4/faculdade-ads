# AV1 - Atividade Contextualizada

## Domínio

Uma Equipe de desenvolvimento, para implantação de um banco de dados, se deparou com o seguinte cenário:

Uma agência de veículos possui toda a organização do negócio, como controle de retiradas e recebimento de veículos, lavagens e manutenção, lançamentos financeiros, dados de clientes e veículos registrados em planilhas eletrônicas, além de documentos de textos, nos quais, diversas vezes, ocorrem problemas de integridades ou inconsistência nas informações.

Todos os funcionários envolvidos na locação possuem acesso irrestrito aos documentos e planilhas, independentemente do seu setor, para consultas e atualização dos registros referentes a suas atividades no negócio. Portanto, não há qualquer separação ou restrição para acesso a essas informações, que são compartilhadas e que deveriam ser melhor geridas.

## Especificações

Após o devido estudo de viabilidade e levantamento dos requisitos, ficou acertado que um novo projeto de reestruturação e implantação de um banco de dados será implementado.

O projeto contemplará todas as fases de banco de dados do modelo conceitual, passando pelo lógico, até o modelo físico, para organização e manipulação geral dos principais cadastros e eventos envolvidos no negócio, além do controle de usuários e níveis de acesso e emprego de restrição de integridade, as entidades importantes levantadas foram: Clientes, Veículos, Funcionários, Movimento (aluguel, retirada e devolução do veículo) e Oficina (lavagem e manutenção dos veículos).

## Atividade AV1

A partir de tais informações, elabore um projeto de banco de dados completo, com toda a documentação necessária, com diagramas para o modelo conceitual, modelo lógico e scripts para o modelo físico e prints constatando sua implementação junto ao banco de dados, incluindo aspectos de segurança e restrição para os dados do banco.

O projeto deverá contemplar a criação de, no mínimo, cinco usuários com privilégios diferentes para acessarem o banco de dados criado.

As tabelas deverão ser populadas com, no mínimo, cinco registros cada uma.

Para o modelo conceitual, deve ser entregue uma proposta de DER simplificado sem a necessidade de indicar todos os atributos.

O modelo lógico deve ser representado em um diagrama com tabelas que demonstrem todos os detalhes dos atributos, destacando tipos de campos, chaves primárias e estrangeiras, relacionamentos com cardinalidades bem definidas para as tabelas que necessitarem, além do esquema relacional de todas as tabelas.
O modelo físico deve contemplar todos os scripts SQL de todos os objetos envolvidos, incluindo prints das telas dos objetos criados e populados no SGBD, para formar toda a documentação do banco de dados proposto.
