
Condições ternárias são uma forma de simplificar o IF ELSE em uma única linha.
A expressão ternária segue a estrutura: [condição ? valor_se_verdadeiro : valor_se_falso.]
Ou seja, se a condição for verdadeira, retorna o [valor_se_verdadeiro]; caso contrário, [retorna o valor_se_falso].
  
Sendo assim é uma forma de simplificar o código, e melhorar a legibilidade. lembrando que o sinal de "?" é obrigatório e o sinal ":" também é obrigatório.
  
### Exemplo em Java

```java
int idade = 18;
String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
System.out.println(resultado); // Saída: Maior de idade
```

### Vantagens

- Reduz o número de linhas de código.
- Torna o código mais legível para condições simples.

### Cuidados

- Evite usar expressões ternárias para lógica complexa, pois pode dificultar a leitura.
- Use apenas quando a condição e os valores envolvidos forem simples e claros.