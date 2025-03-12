# Exercícios Básicos

1. **Imprima os números de 150 a 300.**


2. **Calcule e exiba a soma dos números de 1 a 1000.**
   

4. **Imprima todos os múltiplos de 3 entre 1 e 100.**
   

5. **Calcule e imprima os fatoriais de 1 a 10.**
   

6. **Altere o código do exercício anterior para calcular os fatoriais de 1 a 20, utilizando `long` para evitar overflow.**
   

7. **Imprima os primeiros números da série de Fibonacci até que o valor ultrapasse 100.**
    

8. **Implemente a lógica de Collatz:** Para um número `x`, se for par, divida por 2, se for ímpar, calcule `3 * x + 1`, e imprima até `x` ser 1.
    

9. **Imprima a tabela abaixo utilizando laços `for` aninhados:**
   ```
   1
   2 4
   3 6 9
   4 8 12 16
   n n*2 n*3 .... n*n
   ```


10. **Desenvolva um programa que imprima a soma dos quadrados dos números de 1 a 50.**
    
11. **Crie um programa que leia dois números e exiba todos os números entre eles em ordem crescente.**
    
13. **Imprima os números primos entre 1 e 100.**

---

# Exercícios Intermediários


### **1. Gerenciamento de Funcionários**  
Uma empresa precisa de um sistema para gerenciar seus funcionários. O programa deve permitir o cadastro de `N` funcionários, onde cada um possui um `id`, `nome` e `salário`. O sistema deve permitir o aumento do salário de um funcionário específico, recebendo um ID e um percentual de aumento. Se o ID informado não existir, exibir uma mensagem de erro e abortar a operação. Ao final, listar os funcionários cadastrados com seus respectivos salários atualizados. O ID deve ser único e o salário só pode ser alterado por meio do método de aumento.

### **2. Sistema de Reserva de Quartos**  
Um hotel deseja implementar um sistema de reserva de quartos. O programa deve permitir que um hóspede informe seu **nome, email e número do quarto** para efetuar uma reserva. O sistema deve garantir que um mesmo quarto não possa ser reservado por mais de uma pessoa. Além disso, deve permitir o cancelamento de reservas, liberando o quarto. Ao final, exibir a lista de quartos ocupados e seus respectivos hóspedes. O hotel possui apenas **10 quartos disponíveis**.

### **3. Controle de Estoque**  
Uma loja precisa de um programa para gerenciar seu estoque. O sistema deve permitir o cadastro de produtos, onde cada um possui um **código, nome e quantidade**. O programa deve permitir que o usuário registre a entrada e saída de produtos do estoque, aumentando ou diminuindo a quantidade disponível. Um produto só pode ser removido do estoque se houver quantidade suficiente disponível. Ao final, exibir um relatório com a lista de produtos e suas respectivas quantidades. Cada produto deve ter um código único e sua quantidade não pode ser negativa.

### **4. Sistema Bancário**  
Você deve criar um sistema para gerenciar contas bancárias. O programa deve permitir a criação de contas associadas a clientes, onde cada conta tem um **nome do titular, número da conta e saldo**. O sistema deve permitir operações de **depósito e saque**, garantindo que um saque só possa ser realizado se houver saldo suficiente. Após as operações, exibir um resumo com todas as contas registradas e seus respectivos saldos. O saldo deve ser alterado apenas por métodos específicos e cada conta deve ter um número único.

### **5. Cadastro e Ordenação de Alunos**  
Uma escola precisa de um programa que gerencie alunos. O sistema deve permitir o cadastro de `N` alunos, armazenando **número de matrícula, nome e nota final**. Após o cadastro, os alunos devem ser exibidos em **ordem decrescente de nota**. O programa deve também identificar os alunos que obtiveram nota inferior a **7.0**, marcando-os como reprovados. O número de matrícula deve ser único, e as notas devem estar dentro do intervalo de **0 a 10**.

### **6. Sistema de Biblioteca**  
Uma biblioteca deseja implementar um sistema para controlar seus livros. O programa deve permitir o cadastro de livros, onde cada um possui um **código, título e status** (disponível ou emprestado). Um usuário pode solicitar o empréstimo de um livro, alterando seu status para "emprestado". Caso um livro já esteja emprestado, o sistema deve exibir uma mensagem informando que ele não está disponível. O sistema também deve permitir a devolução de livros, alterando seu status para "disponível". Ao final, exibir a lista de livros disponíveis e emprestados. Cada livro deve ter um código único.

### **7. Simulação de Fila de Atendimento**  
Um hospital precisa de um sistema para gerenciar sua fila de atendimento. O programa deve permitir que os pacientes sejam adicionados à fila de espera e devem ser atendidos em ordem de chegada. Quando um paciente for atendido, ele deve ser removido da fila. O sistema deve exibir a fila de pacientes aguardando atendimento e indicar quando a fila estiver vazia. A implementação deve seguir o princípio de **FIFO (First In, First Out)**.

### **8. Cálculo de Fatorial com Tratamento de Erros**  
Crie um programa que solicite ao usuário um número inteiro `N` e calcule seu **fatorial**. O programa deve validar se `N` é um número **positivo** e lançar uma exceção caso seja negativo. O cálculo do fatorial deve ser realizado utilizando uma estrutura de repetição. Como números grandes podem gerar **overflow**, o programa deve utilizar **BigInteger** ao invés de `int` para valores altos. O fatorial de **0 é 1**.

### **9. Sistema de Pedidos de Restaurante**  
Um restaurante precisa de um sistema para gerenciar seus pedidos. O sistema deve permitir que um cliente faça um **pedido informando o código do prato e a quantidade desejada**. Com base nos preços do cardápio, o sistema deve calcular o **valor total do pedido** e armazená-lo. O programa também deve exibir a lista de pedidos pendentes. Caso um código de prato inexistente seja informado, o sistema deve exibir uma mensagem de erro. O cardápio deve ser pré-definido e conter uma lista de pratos com seus respectivos preços.

### **10. Gerenciamento de Chamados Técnicos**  
Uma empresa deseja um sistema para gerenciar chamados de suporte técnico. O programa deve permitir o registro de chamados, onde cada chamado possui um **ID, descrição do problema e status (aberto ou resolvido)**. O sistema deve permitir que o status de um chamado seja alterado para "resolvido" e exibir a lista de chamados que ainda estão abertos. Cada chamado deve ter um ID único e ser armazenado em uma lista de controle.

---
