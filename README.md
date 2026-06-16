# 📞 Agenda Telefônica CRUD em Java

Projeto desenvolvido para a disciplina de Projeto Integrador, com o objetivo de implementar uma Agenda Telefônica utilizando Java, MySQL e operações CRUD (Create, Read, Update e Delete).

## 👨‍💻 Autor

- Augusto Monteiro Alves de Castro

## 🎯 Objetivo

Desenvolver uma aplicação Java capaz de armazenar e gerenciar contatos telefônicos, permitindo:

- Adicionar contatos
- Buscar contatos
- Listar contatos
- Atualizar contatos
- Remover contatos

Todas as informações são persistidas em banco de dados MySQL.

---

## 🛠 Tecnologias Utilizadas

- Java
- MySQL
- JDBC (MySQL Connector)
- Visual Studio Code
- Git e GitHub

---

## 📂 Estrutura do Projeto

```text
AgendaTelefonica
│
├── lib
│   └── mysql-connector-j-9.7.0.jar
│
├── src
│   ├── Contato.java
│   ├── AgendaTelefonica.java
│   └── AgendaTeste.java
│
└── agenda_telefonica.sql
```

## 🗄 Banco de Dados

Banco utilizado:

```sql
agenda_telefonica
```

Tabela principal:

```sql
contato
```

Campos:

- id
- nome
- telefone
- email

---

## ✅ Funcionalidades Implementadas

### Create

Adiciona novos contatos à agenda.

### Read

Consulta e lista contatos cadastrados.

### Update

Atualiza telefone e e-mail de contatos existentes.

### Delete

Remove contatos da agenda.

---

## 📹 Vídeo de Demonstração

O vídeo demonstrando todas as funcionalidades do CRUD pode ser acessado pelo link abaixo:

🔗 https://drive.google.com/file/d/1kr7y2VGASthjIdUdS8JNKFkL9RCwVKjK/view?usp=sharing

---

## 🚀 Como Executar

### Compilar

```bash
javac src\*.java
```

### Executar

```bash
java -cp "lib/mysql-connector-j-9.7.0.jar;src" AgendaTeste
```

---

## 📁 Repositório GitHub

🔗 https://github.com/Gut0Hub/AgendaTelefonica

---

## 📌 Observação

Projeto acadêmico desenvolvido para fins educacionais, demonstrando conceitos de Programação Orientada a Objetos, persistência de dados com JDBC e operações CRUD em banco de dados relacionais.
