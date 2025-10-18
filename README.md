<h1>request-credit-system</h1>
<p align="center">API Rest para um Sistema de Análise de Solicitação de Crédito</p>
<p align="center">
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Kotlin">
        <img src="https://img.shields.io/badge/Kotlin-v1.7.22-purple.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-v3.0.3-brightgreen.svg" />
    </a>
    <a alt="Gradle">
        <img src="https://img.shields.io/badge/Gradle-v7.6-lightgreen.svg" />
    </a>
    <a alt="H2 ">
        <img src="https://img.shields.io/badge/H2-v2.1.214-darkblue.svg" />
    </a>
    <a alt="Flyway">
        <img src="https://img.shields.io/badge/Flyway-v9.5.1-red.svg">
    </a>
</p>

<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="350" width="450" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>

✅ 1. Descrição do Projeto

API REST desenvolvida em Kotlin com Spring Boot para gerenciamento de clientes e créditos financeiros. Permite criar, consultar, atualizar e deletar clientes, além de registrar e buscar créditos vinculados a cada cliente.

🚀 2. Como rodar o projeto localmente

#### Clonar o repositório
<li>git clone https://github.com/enqneres/credit-application-system.git

#### Abrir no IntelliJ e rodar a aplicação
<li>Execute o comando: <code>./gradlew bootrun</code></li>

<h6>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e executar o projeto através da IDE **</h6>

🔧 3. Endpoints disponíveis

#### 📍 Clientes (`/api/customers`)
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/api/customers` | Cria um novo cliente |
| `GET` | `/api/customers/{id}` | Busca cliente por ID |
| `PATCH` | `/api/customers?customerId={id}` | Atualiza dados do cliente |
| `DELETE` | `/api/customers/{id}` | Deleta cliente |

#### 📍 Créditos (`/api/credits`)
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/api/credits` | Cria um novo crédito para um cliente |
| `GET` | `/api/credits?customerId={id}` | Lista todos os créditos de um cliente |
| `GET` | `/api/credits/{creditCode}?customerId={id}` | Busca um crédito específico por código |


🧪 4. Exemplos de requisição

![img.png](img.png)

![img_1.png](img_1.png)

![img_2.png](img_2.png)

📚 5. Tecnologias utilizadas
- Kotlin
- Spring Boot
- Gradle
- JPA / Hibernate
- Banco de dados H2

👤 6. Autor

Desenvolvido por [Enoque Neres]()

---

<h3>Referências</h3>

Projeto executado por meio da plataforma da DIO de autoria da Camila Cavalcante

Link do repositório original: https://github.com/cami-la/credit-application-system.git

[![Linkedin Badge](https://img.shields.io/badge/-Camila-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cami-la/)](https://www.linkedin.com/in/cami-la/)



