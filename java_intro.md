# **Sumário Interativo**

- [Introdução ao Java](#introdução-ao-java)
  - [Java: Uma Linguagem Multiplataforma](#java-uma-linguagem-multiplataforma)
- [Introdução à Programação com Java](#introdução-à-programação-com-java)
  - [1. Algoritmo](#1-algoritmo)
  - [2. Programa](#2-programa)
  - [3. Regras de Linguagem](#3-regras-de-linguagem)
    - [3.1 Regras Léxicas](#31-regras-léxicas)
    - [3.2 Regras de Sintaxe](#32-regras-de-sintaxe)
  - [4. IDE (Integrated Development Environment)](#4-ide-integrated-development-environment)
  - [5. Execução de Código](#5-execução-de-código)
    - [5.1 Compilação](#51-compilação)
    - [5.2 Interpretação](#52-interpretação)
    - [5.3 Máquina Virtual](#53-máquina-virtual)
  - [6. Versões do Java](#6-versões-do-java)
  - [7. O Que Baixar: JVM, JRE ou JDK?](#7-o-que-baixar-jvm-jre-ou-jdk)
    - [7.1 JVM (Java Virtual Machine)](#71-jvm-java-virtual-machine)
    - [7.2 JRE (Java Runtime Environment)](#72-jre-java-runtime-environment)
    - [7.3 JDK (Java Development Kit)](#73-jdk-java-development-kit)


---

# Introdução ao Java

Na década de 1990, o desenvolvimento de software enfrentava desafios significativos, como:

- Gerenciamento complexo de memória.
- Falta de bibliotecas.
- Problemas de portabilidade entre sistemas operacionais.
- Alto custo de implementação.

Para resolver esses problemas, a **Sun Microsystems** formou o **"Green Team"**, liderado por **James Gosling**: 

<div align="left">
  <img src="images/jamesgosling.png" alt="Java" width="150">
  <img src="images/java.png" alt="Java" width="200">
</div>

O objetivo da equipe era criar uma solução inovadora voltada inicialmente para pequenos dispositivos, como TVs e videocassetes.
O foco inicial era desenvolver uma linguagem que permitisse escrever um único código que funcionasse em diferentes dispositivos, facilitando a reusabilidade de software em eletrônicos variados.

A equipe desenvolveu a **Máquina Virtual Java (JVM)**, que possibilita que o código Java seja interpretado e executado independentemente do hardware.
Apesar de a ideia original não ter gerado contratos imediatos com fabricantes de eletrônicos, ela ganhou relevância com o advento da internet. Em **1994**, o Java foi reposicionado para rodar pequenas aplicações dentro de navegadores, conhecidas como **applets**, que poderiam ser executados diretamente no navegador, independente do sistema operacional.

---

<br>

# Java: Uma Linguagem Multiplataforma

Um dos grandes diferenciais do Java é seu conceito de **"escreva uma vez, rode em qualquer lugar"** (*write once, run anywhere*). Isso significa que um programa escrito em Java pode ser executado em qualquer sistema operacional que tenha uma **JVM** instalada.

### Como Funciona?

A JVM atua como uma camada intermediária entre o código Java e o sistema operacional, tornando o Java uma linguagem multiplataforma desde sua criação. Esse recurso foi especialmente valioso no início dos anos 2000, quando diferentes sistemas operacionais eram amplamente utilizados.

---

<br>

# Introdução à Programação com Java

---

## 1. Algoritmo

Um algoritmo é uma sequência bem definida de passos que resolve um problema específico ou executa uma tarefa. Ele fornece instruções passo a passo para atingir um objetivo, seja resolver uma operação matemática, realizar um cálculo ou processar dados.

### Exemplo
Um algoritmo para somar dois números:
1. Receber o primeiro número.
2. Receber o segundo número.
3. Somar os dois valores.
4. Exibir o resultado.

---

## 2. Programa

Um programa é um conjunto de algoritmos codificados em uma linguagem que o computador entende e pode executar. Ele transforma um ou mais algoritmos em uma sequência de instruções que o computador segue para realizar tarefas automaticamente.

### Exemplo
Um programa de calculadora que permite ao usuário realizar operações matemáticas (soma, subtração, multiplicação e divisão) é composto por diferentes algoritmos, um para cada operação.

---

<br>

## 3. Regras de Linguagem

### 3.1 Regras Léxicas
Definem o conjunto de símbolos válidos em uma linguagem, como palavras-chave, operadores, identificadores e números. Dizem respeito à **correção das palavras isoladas**.

#### Exemplo:
- **Português:** cachorro (correto), caxorro (errado).  
- **Java:** `main` (correto), `maim` (errado).

### 3.2 Regras de Sintaxe
Definem como organizar as palavras e símbolos para formar sentenças válidas na linguagem, isto é, sua **gramática**.

#### Exemplo:
- **Português:** O cachorro está com fome (correto), A cachorro está com fome (errado).  
- **Java:** `x = 2 + y` (correto), `x = + 2 y` (errado).

---

<br>

## 4. IDE (Integrated Development Environment)

Uma **IDE** é um ambiente integrado de desenvolvimento que oferece ferramentas para facilitar a criação e manutenção de software.

### Funcionalidades Principais
1. **Edição de Código:** Autocompletar, indentação e destaque de palavras-chave.
2. **Depuração:** Identificação e correção de erros.
3. **Build (Construção):** Compilação e organização do código para gerar o produto final.
4. **Templates:** Modelos prontos para acelerar o desenvolvimento.

---

<br>

## 5. Execução de Código

Transformar o código-fonte em instruções executáveis. Existem diferentes abordagens para isso:

### 5.1 Compilação
Tradução do código-fonte para código de máquina antes da execução, gerando um **código objeto** e um **executável**.

#### Características
- **Vantagens:**  
  1. Velocidade na execução.  
  2. Detecção de erros antes da execução.  

![Imagem de Compilador](/images/compilador.png)

### 5.2 Interpretação
O código é analisado e executado linha por linha por um **interpretador**.

#### Características
- **Vantagens:**  
  1. Flexibilidade para atualizações.  
  2. Portabilidade entre diferentes plataformas.  

![Imagem de Maquina virtual](/images/mv.png)

### 5.3 Máquina Virtual
Uma abordagem híbrida que combina compilação e interpretação.  
1. O código-fonte é compilado em **bytecode**.
2. A **Máquina Virtual (VM)** interpreta e executa o bytecode.

#### Exemplo
- Java: **Java Virtual Machine (JVM)**.  
- C#: **Microsoft .NET Framework**.

### Definições de Conceitos
- **Código Fonte:** Texto original escrito pelo programador.  
- **Código Objeto:** Código binário gerado após a compilação, pronto para execução.

![Imagem Comparativa de Linguagens](/images/linguagens.png)

---

<br>

## 6. Versões do Java

### Principais Versões
1. **Java 1.0 e 1.1:** Introduziram bibliotecas fundamentais como JDBC (Java Database Connectivity) e `java.io`.
2. **Java 1.2 (Java2):** A API cresceu significativamente, adicionando novos pacotes.
3. **Java 1.5 (Java 5):** Mudanças significativas na linguagem e simplificação da nomenclatura.
4. **Java 6, 7 e 8:** Adoção da convenção numérica simplificada e introdução de recursos como expressões lambda e API de Streams (Java 8).

---

<br>

## 7. O Que Baixar: JVM, JRE ou JDK?

### 7.1 JVM (Java Virtual Machine)
Componente responsável por executar o bytecode Java em qualquer máquina.  
**Nota:** A JVM vem integrada ao JRE ou ao JDK.

### 7.2 JRE (Java Runtime Environment)
- Inclui a JVM e as bibliotecas necessárias para executar aplicativos Java.
- Ideal para quem precisa **apenas executar** aplicações Java.

### 7.3 JDK (Java Development Kit)
- Inclui o JRE, a JVM e ferramentas adicionais como o compilador `javac`.
- Essencial para **desenvolvedores Java**.

----
