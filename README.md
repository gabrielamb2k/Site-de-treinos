# Site-de-treinos
# 🏋️ Gerador de Treinos

## 📋 Sobre o Projeto

O **Gerador de Treinos** é uma aplicação web desenvolvida em Java que permite aos usuários criar treinos personalizados baseados em suas preferências e disponibilidade de tempo. O sistema oferece duas modalidades de treino: **Academia** (musculação tradicional) e **Híbrido** (combinação de força e condicionamento físico).

## 🚀 Tecnologias Utilizadas

- **Java 17** - Linguagem de programação principal
- **Spring Boot 3.5.4** - Framework para desenvolvimento web
- **Spring MVC** - Padrão arquitetural Model-View-Controller
- **Thymeleaf** - Engine de templates para renderização das páginas
- **JUnit 5** - Framework para testes unitários
- **Maven** - Gerenciador de dependências e build
- **HTML/CSS/JavaScript** - Frontend responsivo

## 🏗️ Arquitetura e Padrões de Projeto

### Padrões Implementados

#### 1. **Template Method Pattern**
Implementado na classe abstrata `WorkoutTemplate`, que define a estrutura básica de um treino:
```java
public final void criaWorkout(){
    aquec();    // Aquecimento
    treino();   // Treino principal
    along();    // Alongamento final
}
```

#### 2. **Model-View-Controller (MVC)**
- **Model**: Classes de domínio (`User`, `Workout`, `Exercise`)
- **View**: Templates Thymeleaf (`login.html`, `pagina.html`, `treino-gerado.html`)
- **Controller**: Classes controladoras (`UserController`, `WorkoutController`)

### Conceitos de POO Aplicados

#### 🔒 **Encapsulamento**
- Atributos privados com métodos getters/setters
- Controle de acesso através de modificadores de visibilidade

#### 🧬 **Herança**
```java
Exercise (classe abstrata)
├── GymExercise (exercícios de academia)
└── HybridExercise (exercícios híbridos)

Workout (classe abstrata)
├── GymWorkout (treinos de academia)
└── HybridWorkout (treinos híbridos)
```

#### 🎭 **Polimorfismo**
- Implementação de interfaces para repositórios
- Sobrescrita de métodos nas classes filhas

#### 🏗️ **Abstração**
- Classes abstratas `Exercise`, `Workout`, `WorkoutTemplate`
- Interfaces para repositórios de dados

## 🗂️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/aplicativo/treino/Gerador/de/treinos/
│   │   ├── bootstrap/          # Carregamento inicial de dados
│   │   ├── controller/         # Controladores MVC
│   │   ├── domain/            # Entidades de domínio
│   │   │   ├── exercise/      # Hierarquia de exercícios
│   │   │   ├── user/          # Entidade usuário
│   │   │   └── workout/       # Hierarquia de treinos
│   │   ├── dto/               # Data Transfer Objects
│   │   ├── generator/         # Lógica de geração de treinos
│   │   ├── repository/        # Camada de persistência
│   │   └── service/           # Camada de serviços
│   └── resources/
│       ├── templates/         # Templates Thymeleaf
│       └── application.properties
└── test/                      # Testes unitários
```

## 💾 Persistência de Dados

O sistema utiliza **armazenamento em memória** através de interfaces:

- `UserRepository` - Gerenciamento de usuários
- `GymWorkoutRepository` - Treinos de academia
- `HybridWorkoutRepository` - Treinos híbridos

### Implementações em Memória
- `UserRepositoryImpl` - HashMap para usuários
- `GymWorkoutRepositoryImpl` - ArrayList para treinos de academia
- `HybridWorkoutRepositoryImpl` - ArrayList para treinos híbridos

## 🏃‍♂️ Funcionalidades

### Para o Usuário
- **Login/Cadastro** - Sistema de autenticação simples
- **Questionário Personalizado** - Definição de preferências de treino
- **Geração Automática** - Criação de treinos baseados nas preferências
- **Visualização Detalhada** - Exibição completa do plano de treino

### Tipos de Treino Disponíveis

#### 🏋️ **Academia (Musculação)**
- Full Body (45, 60, 90 minutos)
- Upper/Lower (45, 60, 90 minutos)
- Exercícios focados em hipertrofia e força

#### 🔥 **Híbrido (Força + Cardio)**
- Full Body (45, 60, 90 minutos)
- Upper/Lower (45, 60, 90 minutos)
- Combinação de musculação e condicionamento físico

### Testes Implementados
- `UserRepositoryImplTest` - Testa operações de repositório de usuários
- `UserServiceTest` - Testa a lógica de negócio do serviço de usuários
- `GeradorDeTreinosApplicationTests` - Teste de contexto da aplicação

## 📱 Interface do Usuário

### Tela de Login
- Design moderno com tema escuro
- Campos para nome e email
- Validação de entrada

### Gerador de Treino
- Interface step-by-step
- Seleção de tipo de treino
- Escolha de divisão muscular
- Definição de duração

### Visualização do Treino
- Tabela detalhada com exercícios
- Séries, repetições e observações
- Diferenciação visual entre tipos de treino

## 👨‍💻 Autor

Desenvolvido como projeto acadêmico demonstrando conceitos de:
- Programação Orientada a Objetos
- Padrões de Projeto
- Arquitetura MVC
- Testes Unitários
- Desenvolvimento Web com Spring Boot


---
