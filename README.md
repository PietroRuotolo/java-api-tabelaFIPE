Java API - Tabela FIPE

Projeto desenvolvido em Java com Spring Boot para consumo da API pública da Tabela FIPE, permitindo consultar marcas, modelos e anos de veículos diretamente pelo terminal.

Tecnologias utilizadas
Java 17
Spring Boot
Jackson
Maven
Funcionalidades

 Consulta de marcas de veículos
 Consulta de modelos por marca
 Consulta de anos disponíveis
 Desserialização de JSON utilizando Jackson
 Estrutura organizada em camadas
 Uso de Records e Enums
 Consumo de API REST externa

API utilizada

API pública da Tabela FIPE:
API FIPE

Estrutura do projeto
src
 ├── main
 │    ├── java
 │    │     └── br.com.seuprojeto
 │    │           ├── model
 │    │           ├── service
 │    │           ├── principal
 │    │           ├── enums
 │    │           └── application
 │    │
 │    └── resources
 │          └── application.properties
Como executar o projeto
1. Clone o repositório
git clone https://github.com/PietroRuotolo/java-api-tabelaFIPE.git
2. Entre na pasta
cd java-api-tabelaFIPE
3. Execute o projeto
Maven Wrapper

Linux/Mac:

./mvnw spring-boot:run

Windows:

mvnw spring-boot:run
Exemplo de uso
Digite o tipo de veículo:
1 - Carros
2 - Motos
3 - Caminhões

Digite o código da marca:
59

Modelos encontrados:
001 Flagship AWD
001 Premium AWD
7X Flagship AWD

Conceitos praticados:

Consumo de APIs REST

Programação orientada a objetos

Records

Enums

Desserialização JSON

Generics

Injeção de dependência

Organização de projeto backend

Boas práticas com Git e commits semânticos

Melhorias futuras:

 Interface gráfica

 Integração com banco de dados
 
 Criação de endpoints REST
 
 Dockerização
 
 Testes automatizados
 
 Cache de consultas
 
 Tratamento avançado de exceções
 
Autor:

Desenvolvido por Pietro Ruotolo.
