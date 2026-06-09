# API SPRINGBOOT

Api SpringBoot com java 21, Spring Data JPA usando Postgres, Spring Web, Dev Tools e documentação Swagger UI.

Desenvolvimento:

#### 1
Baixado o projeto inicial via [Spring Initializr](https://start.spring.io/), onde o projeto já é baixado com o comando ```SpringApplication.run(Application.class, args);``` para inicialização do projeto spring.

#### 2
Adicionado as dependencias web, devtools, jpa, postgres e swagger no arquivo POM do projeto.

#### 3
Adicionado as configurações do banco no arquivo application.properties, que fica dentro de resources. 

#### 4
Adicionado o arquivo "docker-compose.yml" por meio do qual será iniciado o banco de dados.

#### 5
Criada a entidade "Pessoa" com o mapeamento usando as anotações do Jakarta.

#### 6
Criado o "Repository" usando a interface do Spring "Jpa Repository"

#### 7
Criado o controller "PessoaController" com a arquitetura Rest e a IoC do Spring, injetando o repositório por meio do construtor da classe.

#### 8
Criado o "ExeptionHandler" geral, para mensagens de erro mais legíveis.

#### 9
Após isso, bastou subir a API usando o comando ```mvn spring-boot:run``` e então acessar o swagger para fazer testes de maneira mais simples: http://localhost:8080/swagger-ui/index.html.