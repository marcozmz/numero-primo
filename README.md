# Exercício 11 - Verificador de Números Primos

Este programa em Java verifica se um número informado pelo usuário é primo ou não.

## Funcionalidades

- Solicita ao usuário que digite um número inteiro
- Valida se o número é maior que 1
- Verifica se o número é primo usando um algoritmo eficiente
- Exibe o resultado para o usuário

## Como funciona

O programa utiliza o seguinte algoritmo para verificar se um número é primo:

1. **Validação inicial**: Verifica se o número é maior que 1 (números menores ou iguais a 1 não são primos)
2. **Verificação de primalidade**: Testa a divisibilidade do número por todos os inteiros de 2 até a raiz quadrada do número
3. **Otimização**: O loop é interrompido assim que um divisor é encontrado (usando `break`)

## Exemplo de uso

```
Digite um numero: 7
O numero 7 e primo

Digite um numero: 10
O numero 10 nao e primo

Digite um numero: 1
Digite um numero maior que 1
```

## Estrutura do código

- **Classe**: `Exercicio11`
- **Método principal**: `main(String[] args)`
- **Bibliotecas utilizadas**: `java.util.Scanner` para entrada de dados

## Compilação e execução

```bash
javac Exercicio11.java
java Exercicio11
```

## Observações

- O algoritmo é otimizado testando divisores apenas até a raiz quadrada do número
- Números negativos e zero são tratados como inválidos
- O número 2 é corretamente identificado como primo
