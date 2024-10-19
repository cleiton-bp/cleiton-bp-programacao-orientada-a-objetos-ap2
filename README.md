# Trabalho AP2 - Sistema de Gerenciamento de Clientes

## Descrição do Projeto

Este projeto é um sistema de gerenciamento de clientes desenvolvido utilizando o Spring Framework, permite realizar operações CRUD (Create, Read, Update, Delete) em registros de clientes, além de buscar clientes por idade. O sistema é composto por três camadas principais: Controller, Service e Repository.

## Estrutura do Projeto

### Controllers

- **ClientController**: Responsável por lidar com as requisições HTTP e direcioná-las para os serviços apropriados, define endpoints para obter todos os clientes, obter um cliente por ID, buscar clientes por idade, adicionar um novo cliente, atualizar um cliente existente e deletar um cliente.

### Models

- **ClientModel**: Representa a entidade Cliente com atributos como ID, nome, idade e profissão, utilizando as anotações `@Getter` e `@Setter` do Lombok para gerar automaticamente os métodos getters e setters.

### Repositories

- **ClientRepository**: Simula um repositório de dados em memória utilizando uma lista de clientes. Fornece métodos para buscar todos os clientes, buscar por ID, salvar, atualizar e deletar clientes, além de buscar clientes por idade.

### Services

- **ClientService**: Contém a lógica de negócios do sistema, utiliza o `ClientRepository` para realizar operações de persistência e fornece métodos para buscar todos os clientes, buscar por ID, salvar, atualizar e deletar clientes, além de buscar clientes por idade.

## Injeção de Dependência

O projeto utiliza a anotação `@Autowired` do Spring para injeção de dependência, isso permite que o Spring resolva e injete automaticamente as dependências necessárias nos componentes, facilitando a gestão de dependências e melhorando a modularidade e testabilidade do código.

## Endpoints Disponíveis

- **GET /client**: Retorna todos os clientes.
- **GET /client/{id}**: Retorna um cliente pelo ID.
- **GET /client?age={age}**: Retorna clientes pela idade.
- **POST /client**: Adiciona um novo cliente.
- **PUT /client/{id}**: Atualiza um cliente existente.
- **DELETE /client/{id}**: Deleta um cliente pelo ID.

## Como Executar o Projeto

1. Clone o repositório para sua máquina local.
2. Importe o projeto em sua IDE de preferência.
3. Execute a aplicação Spring Boot.
4. Utilize uma ferramenta como Postman ou Insomnia para testar os endpoints.

