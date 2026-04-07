# 🐾 PetShop Console System
> Projeto desenvolvido para consolidar fundamentos de Java, focado em Collections e POO.

---

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green?style=for-the-badge)

## 🎯 Objetivo do Projeto
O sistema simula o fluxo de trabalho de um Pet Shop, permitindo o gerenciamento de clientes e autenticação de usuários. O foco principal foi a transição de arrays estáticos para **ArrayLists**, permitindo um armazenamento dinâmico e escalável.

---

## 🛠️ Pilares de Desenvolvimento
Abaixo, os conceitos técnicos que sustentam a arquitetura deste software:

| Conceito | Descrição Aplicada |
| :--- | :--- |
| **POO Avançado** | Classes de modelo com encapsulamento rigoroso e métodos `toString`. |
| **Dynamic Lists** | Implementação de `List<ClienteDono>` para gestão de banco de dados em memória. |
| **Identidade Única** | Sistema de IDs automáticos usando o modificador `static`. |
| **Segurança** | Lógica de login com busca linear e comparação de hash/equals. |
| **Resiliência** | Uso de `Try-Catch` para prevenir interrupções por erro de input. |

---

## ⚙️ Funcionalidades e Regras

### 1. Cadastro de Clientes
Ao registrar um novo cliente, o sistema solicita os dados via `Scanner`. 
* **Regra:** O ID não é digitado, ele é atribuído pela própria classe `ClienteDono` no momento da instância.

### 2. Sistema de Login
O módulo de entrada valida se as credenciais digitadas existem dentro da nossa `ArrayList`.
* **Mecânica:** For-each loop percorrendo cada objeto e verificando `email.equals()` e `senha.equals()`.

### 3. Tratamento de Buffer
Implementação de limpeza de buffer (`sc.nextLine()`) para garantir que o fluxo entre leitura de números e textos não seja interrompido.

---

## 🚀 Como testar localmente

1. **Clonar o projeto:**
   ```bash
   git clone [https://github.com/seu-usuario/seu-projeto.git](https://github.com/seu-usuario/seu-projeto.git)
