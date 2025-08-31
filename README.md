# ✅ TaskFlow
Um site para **gerenciamento de tarefas** onde podemos organizar nossas anotações de forma simples e eficiente.

---

### 📖 Objetivo
A ideia surgiu de uma necessidade pessoal: eu queria apenas anotar minhas tarefas do dia a dia de forma **organizada e prática**, sem complexidade.  
Com o **TaskFlow**, é possível planejar tarefas **da semana e do mês**, adicionando apenas o necessário para manter o foco.

---
### ⚙️ Como Rodar a Aplicação

1. **Pré-requisitos**  
   Certifique-se de ter instalado na sua máquina:
    - ☕ [Java JDK 17+](https://adoptium.net/)
    - 🐘 [Maven](https://maven.apache.org/)
    - 🐬 [MySQL](https://dev.mysql.com/downloads/)

---

2. **Clonar o repositório**
   ```bash
   git clone https://github.com/seu-usuario/TaskFlow.git
   cd TaskFlow 
3. **Configurar o Banco De Dados(MySQL)**
- Acesse seu MySQL pelo terminal
   ```bash
   mysql -u seuusuario -p
   
- Crie o banco de dados 
    ```mysql
    CREATE DATABASE taskflow_db;
- No arquivo src/main/resources/application.properties, configure suas credenciais:
    ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/taskflow_db
  spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
  spring.jpa.hibernate.ddl-auto=update 
  spring.jpa.show-sql=true 
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
4. **Rodar a Aplicacao**
   ```bash
   mvn spring-boot:run
  - O back-end estara rodando em:
   ```bash
   http://localhost:8080
   
5. **Testar os Endpoints**  

   Exemplos (ajuste para os endpoints que você configurou no seu `Controller`):  

   ```http
   GET /api/tarefas     → retorna todas as tarefas
   POST /api/tarefas    → cria uma nova tarefa
   PUT /api/tarefas/{id} → atualiza uma tarefa existente
   DELETE /api/tarefas/{id} → remove uma tarefa
   ```
**Exemplo de payload JSON (`POST /api/tarefas`):**

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar conceitos de Controller e Service",
  "status": "PENDENTE",
  "prioridade": "ALTA",
  "prazo": "2025-09-15"
}
```
**Teste em seu front end para ver o resultado! Qualquer erro pode relatar ou ate mesmo relatar e enviar um pull request que irei adorar analisa-lo**

🔎 Dica: você pode testar os endpoints usando ferramentas como Postman ou Insomnia.
Mas o ideal é implementar e testar direto no seu front-end React consumindo esta API.
---

### 🛠️ Tecnologias Usadas

#### 🔙 Back-end
- ☕ **Java**
- 🌱 **Spring Boot**
- 🐬 **MySQL**
- 🌐 **Spring Web**
- 📦 **Spring JPA**
- ✅ **Validation**
- 🔒 **Spring Security**

#### 🎨 Front-End
- 📄 **HTML**
- 🎨 **CSS**
- ⚡ **JavaScript**
- ⚛️ **React**
- 🟢 **Node.js**

---

### 📂 Estrutura de Pastas

- 📂 **Controller** → Receber requisições HTTP
- 🌐 **Cors** → Limita e controla quem pode enviar requisições ao sistema
- 📤 **DTO** → Transfere somente os dados necessários para a regra de negócio
- 🔢 **Enums** → Listas padronizadas que não sofrem alteração
- ❌ **exceptions** → Lida com erros/execuções de forma padronizada
- 🏗️ **infra** → Parte da infraestrutura do projeto
- 📦 **Model** → Modelos de dados que serão armazenados no banco de dados
- 💾 **Repository** → Operações de acesso e manipulação dos dados
- ⏰ **Schedule** → Executa rotinas automáticas para checar prazos das tarefas (marca como *Atrasado* se ultrapassado)
- 🔧 **Service** → Onde fica a lógica/regra de negócio do sistema

---

### ✨ Features Principais
- ✅ **CRUD de Tarefas** → Criar, listar, atualizar e excluir tarefas
- 🏷️ **Categorias e Prioridades** → Organização por status (*pendente, em andamento, concluída*) e prioridade (*baixa, média, alta*)
- 📅 **Datas e Agendamento** → Definição de prazos (*deadlines*) de cada tarefa

---

### 🚀 Features Futuras
- 🔒 **Login e Registro de Usuário** com Spring Security
- 🔢 **Contador de tarefas** por status e progresso
- 📧 **Notificações por e-mail** para tarefas próximas ao prazo
- 🗂️ **Subtarefas** (quebrar tarefas grandes em partes menores)
- 👁️ **Visualização detalhada** de cada tarefa ("clicar para expandir")

### Fotos da aplicacao

**Em breve...**

### 👥 Contribuição 

- **Kaue Alcantara Rocha**
    - 📧 Email: [kaue.alcan@gmail.com](mailto:kaue.alcan@gmail.com)
    - 💼 LinkedIn: [linkedin.com/in/kauealcantara](https://www.linkedin.com/in/kauealcantara/)
    - 🐙 GitHub: [github.com/Kaueroch](https://github.com/Kaueroch)