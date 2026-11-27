# Sistema de Eventos
Feito por Mateus Gomes de Oliveira

# Descrição da Aplicação
Aplicação Springboot que utiliza JPA para fazer persistência de dados em um banco de dados MySQL local com melhor manipulação pelo Swagger. Foi feita a modelagem desse banco com três grandes entidades em mente bem como os seus relacionamentos (Local, Evento e Participante). O principal objetivo dessa aplicação é ser capaz de manipular dados de forma simulada e local se utilizando dos endpoints do projeto para simular uma API de CRUD (Create, Read, Update e Delete).

# Instruções para execução e teste da API
Clone o projeto localmente

Tenha acesso ao banco de dados MySQL workbench na máquina;

Crie o schema inicial no workbench que irá receber as tabelas automaticamente com o nome: "sistema_eventos" ;

Altere os dados de conexão para os específicos da sua máquina referentes ao banco de dados em application.properties;

Tenha JAVA 17 (Ou maior) instalado na máquina;

Dê RUN no Main.java;

Acesse http://localhost:8080/swagger-ui/index.html para manipular os dados;

# Diagrama de banco de dados esperado
<img width="794" height="509" alt="image" src="https://github.com/user-attachments/assets/17b84674-6bc2-4daa-a4b8-8904a65c4154" />

# Estratégia de versionamento e organização das branches
Develop --> cria-se tudo aqui e é jogado para o GitHUB // Os devidos testes são feitos // Caso tudo OK --> Merge na Main

# Descrição do pipeline de CI/CD

# Informações sobre os testes automatizados

# Rodando Artefato no Docker

Baixe o artefato do último commit disponível

Depois rode os comandos abaixo na pasta com o .tar presente

docker load -i sistema-eventos-image.tar

docker run -d -p 8080:8080 -e SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:3306/sistema_eventos -e SPRING_DATASOURCE_USERNAME=root -e SPRING_DATASOURCE_PASSWORD=ceub123456 --name app-eventos sistema-eventos:latest

NOTA: Troque as credenciais baseadas no seu banco local 

# Rodando do Docker HUB
Repositório: https://hub.docker.com/r/mateusprog/sistema-eventos

docker run -d -p 8080:8080 -e SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:3306/sistema_eventos -e SPRING_DATASOURCE_USERNAME=root -e SPRING_DATASOURCE_PASSWORD=ceub123456 --name app-eventos mateusprog/sistema-eventos:1.0

NOTA: Troque as credenciais baseadas no seu banco local 

# Links para execuções bem-sucedidas e com falha do GitHub Actions
Falha: https://github.com/MateusProg/sistema-eventos/actions/runs/45525162588

Sucesso: https://github.com/MateusProg/sistema-eventos/actions/runs/45525430395
