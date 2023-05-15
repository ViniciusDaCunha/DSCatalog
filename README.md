# DSCatalog
Project made in BootCamp SpringBoot

Modelo conceitual:

![2023-05-15 (2)](https://github.com/ViniciusDaCunha/DSCatalog/assets/99222396/b013c6db-036c-489a-a726-bcc21d6d4211)

O DSCatalog é um sistema de catálogo de produtos que permite aos usuários visualizar, adicionar, atualizar e excluir informações sobre os produtos. Ele foi desenvolvido com a tecnologia Spring Boot e segue uma arquitetura em camadas bem definida.

Funcionalidades

O DSCatalog possui as seguintes funcionalidades:

CRUD completo de produtos
Tratamento de exceções
Paginação de dados
Associações entre entidades (N-N)
Testes automatizados no back-end
Validação e segurança
Tecnologias utilizadas
O projeto utiliza as seguintes tecnologias:

Spring Boot

JPA
H2
Bean Validation
Spring Security
OAuth 2.0
Token JWT
JUnit
Mockito
Como executar o projeto
Para executar este projeto, você precisará ter o ambiente de desenvolvimento Java instalado em seu computador.

Em seguida, siga os seguintes passos:

Clone o repositório do projeto para o seu computador usando o seguinte comando:

bash
Copy code
git clone https://github.com/dacunhavini/DSCatalog.git
Abra o projeto em sua IDE de preferência (recomendamos o IntelliJ IDEA).

Configure o arquivo application.properties com as suas credenciais de banco de dados.

Execute o comando mvn spring-boot:run na linha de comando para iniciar o servidor.

Acesse a URL http://localhost:8080 no seu navegador para ver a página inicial do sistema.

Como testar o projeto
Para testar o projeto, você pode usar o Postman para enviar requisições HTTP para os endpoints disponíveis.

O projeto já vem com uma coleção do Postman contendo todos os endpoints disponíveis. Você pode importar essa coleção para o seu Postman e começar a testar imediatamente.
