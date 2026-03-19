\# Exercício 04: Gerenciamento de Autores



\## Enunciado

&nbsp;Implemente uma aplicação Spring Boot para gerenciar autores. O objetivo é praticar mapeamento JPA com tipos de data e operações CRUD.



\## Entidade: Autor

Atributo Tipo Descrição

id Long Identificador único (chave primária, auto-gerado)

nome String Nome do autor

nacionalidade String Nacionalidade do autor

dataNascimento LocalDate Data de nascimento do autor



\## Requisitos

1\. Crie uma entidade JPA chamada Autor com os atributos especificados

2\. Configure o nome da entidade JPA como Autor

3\. Configure o nome da tabela no banco como tb\_autor

4\. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")

5\. Implemente um repositório Spring Data JPA para a entidade

6\. Implemente um serviço para realizar as operações de CRUD

7\. Crie um controlador REST que exponha os seguintes endpoints



\## Endpoints RESTful

* POST /autores — criar novo autor
* GET /autores — listar todos os autores
* GET /autores/{id} — buscar autor por ID
* DELETE /autores/{id} — deletar autor por ID



\## Observações

* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
