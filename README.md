# README - API de Aprendizado

## Descrição

Esta é uma API desenvolvida em **Spring Boot** com o objetivo de aprendizado e prática de desenvolvimento utilizando as ferramentas do **Spring Web**, **Spring Dev Tools** e **Lombok**. A API é capaz de receber requisições para envio de e-mails e utiliza a **AWS** como serviço de envio de mensagens.

---

## Funcionalidades

- Recebe requisições HTTP com informações necessárias para o envio de e-mails.
- Envia e-mails utilizando os serviços da AWS.
- Estrutura organizada e modular para melhor entendimento e manutenção.

---

## Tecnologias Utilizadas

- **Java 11+**
- **Spring Boot**
  - Spring Web
  - Spring Dev Tools
- **Lombok**
- **AWS SDK**

---

## Estrutura do Projeto

```bash
src
├── main
│   ├── java
│   │   └── com.matheusdev.emailsender
│   │       ├── adapters            # Adaptadores para integração com serviços externos (AWS SES)
│   │       ├── application         # Contém a lógica de negócio e serviços
│   │       ├── controllers         # Controladores para gerenciar as requisições HTTP
│   │       ├── core
│   │       │   ├── exceptions      # Gerenciamento de exceções
│   │       │   └── usecase         # Casos de uso principais da aplicação
│   │       └── infra/ses           # Configurações específicas para o serviço AWS SES
│   └── resources
│       ├── application.properties  # Configurações do Spring Boot e AWS
│       └── static                  # Arquivos estáticos (se aplicável)
├── test
│   └── java/com/matheusdev/emailsender
│       └── EmailServiceApplicationTest.java  # Testes unitários
├── .gitignore
├── README.md                          # Arquivo de documentação do projeto
├── pom.xml                            # Dependências e configurações do Maven
```

---

## Como Funciona

### Requisição de Envio de E-mail

A API aceita requisições HTTP no endpoint `/api/send-email` com as seguintes informações no corpo (em formato JSON):

```json
{
  "to": "destinatario@example.com",
  "subject": "Assunto do E-mail",
  "message": "Conteúdo do e-mail"
}
```

A lógica de envio é gerenciada pela classe `EmailSenderService`, que utiliza a classe `EmailSenderGateway` para interagir com o AWS SES.

---

## Como Executar

### Pré-requisitos

- **Java 11+**
- **Maven** ou **Gradle**
- Uma conta configurada no **AWS SES**.
- Configuração do arquivo `application.properties`:
  ```
  aws.accessKeyId=<SUA_ACCESS_KEY>
  aws.secretKey=<SUA_SECRET_KEY>
  aws.region=<SUA_REGIÃO>
  ```

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/matheusfesantos/seu-repositorio.git
   cd seu-repositorio
   ```

2. Instale as dependências e compile:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. Teste os endpoints via Postman ou outra ferramenta.

---

## Futuras Melhorias

- Adicionar autenticação para proteger os endpoints.
- Melhorar tratamento de erros.
- Criar documentação com **Swagger**.

---

## Autor

Desenvolvido por **Matheus Ferreira**.  
[GitHub](https://github.com/matheusfesantos) | [LinkedIn](https://www.linkedin.com/in/matheusfesantos/)
