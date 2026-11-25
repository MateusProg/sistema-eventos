# Sistema de Eventos

# Descrição da Aplicação
Aplicação Springboot que utiliza JPA para fazer persistência de dados em um banco de dados MySQL local com melhor manipulação pelo Swagger. Foi feita a modelagem desse banco com três grandes entidades em mente bem como os seus relacionamentos (Local, Evento e Participante). O principal objetivo dessa aplicação é ser capaz de manipular dados de forma simulada e local se utilizando dos endpoints do projeto para simular uma API de CRUD (Create, Read, Update e Delete).

# Instruções para execução e teste da API
Clone o projeto localmente

Tenha acesso ao banco de dados MySQL workbench na máquina;

Crie o shchema inicial no workbench que irá receber as tabelas automaticamente com o nome: "sistema_eventos" ;

Altere os dados de conexão para os específicos da sua máquina referentes ao banco de dados em application.properties;

Tenha JAVA 17 (Ou maior) instalado na máquina;

Dê RUN no Main.java;

Acesse http://localhost:8080/swagger-ui/index.html para manipular os dados;

# Rodando Artefato no Docker
docker load -i sistema-eventos-image.tar

docker run -d -p 8080:8080 --name app-eventos sistema-eventos:latest
