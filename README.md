<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>
<body>

<h1 align="center">Banco Digital BLT</h1>

<p align="center">
    <strong>Banco Digital BLT</strong> é um sistema bancário simples em Java que implementa os princípios da Programação Orientada a Objetos (POO), incluindo Abstração, Encapsulamento, Herança e Polimorfismo. O sistema oferece aos clientes a possibilidade de gerenciar contas correntes e poupança, com funcionalidades de depósito, saque e transferência.
</p>

<h2>📁 Estrutura do Projeto</h2>
<pre>
BancoDigital/
├── src/
│   ├── Conta.java            - Classe base abstrata para contas bancárias
│   ├── ContaCorrente.java     - Classe para contas correntes com taxa de operação
│   ├── ContaPoupanca.java     - Classe para contas poupança
│   └── BancoDigital.java      - Classe principal para execução do programa
</pre>

<h2>🚀 Funcionalidades</h2>
<ul>
    <li>Gerenciamento de Conta Corrente e Conta Poupança</li>
    <li>Depósito de valores</li>
    <li>Saque de valores</li>
    <li>Transferência entre contas da instituição</li>
</ul>

<h2>🛠️ Tecnologias Utilizadas</h2>
<ul>
    <li>Java SE (Standard Edition)</li>
</ul>

<h2>📦 Instalação e Execução</h2>
<ol>
    <li>Clone o repositório em sua máquina local:
        <pre><code>git clone https://github.com/seu-usuario/banco-digital-blt.git</code></pre>
    </li>
    <li>Compile os arquivos:
        <pre><code>cd BancoDigital/src
javac *.java</code></pre>
    </li>
    <li>Execute a aplicação:
        <pre><code>java BancoDigital</code></pre>
    </li>
</ol>

<h2>📂 Estrutura das Classes</h2>

<h3>Conta (Classe Base)</h3>
<p>A classe <strong>Conta</strong> é abstrata e define métodos comuns para todas as contas bancárias, como <code>depositar</code>, <code>sacar</code> e <code>transferir</code>. Ela inclui:</p>
<ul>
    <li>Encapsulamento para atributos <code>numeroConta</code> e <code>saldo</code>.</li>
    <li>Método abstrato <code>depositar</code> e <code>sacar</code> que serão implementados nas subclasses.</li>
    <li>Método <code>transferir</code> para permitir transferências entre contas da mesma instituição.</li>
</ul>

<h3>ContaCorrente (Subclasse)</h3>
<p>A classe <strong>ContaCorrente</strong> estende <code>Conta</code> e implementa os métodos de acordo com as regras da conta corrente. Possui uma taxa de operação para cada saque.</p>

<h3>ContaPoupanca (Subclasse)</h3>
<p>A classe <strong>ContaPoupanca</strong> estende <code>Conta</code> e implementa os métodos de acordo com as regras da conta poupança, que não possui taxa de operação em saques.</p>

<h2>🔄 Exemplo de Uso</h2>
<p>Após executar o programa, você verá uma simulação das operações bancárias, incluindo depósitos, saques e transferências, conforme o seguinte exemplo:</p>
<pre><code>
ContaCorrente contaCorrente = new ContaCorrente("12345-6");
ContaPoupanca contaPoupanca = new ContaPoupanca("78910-1");

contaCorrente.depositar(1000);
contaCorrente.sacar(200);
contaCorrente.transferir(300, contaPoupanca);

contaPoupanca.depositar(500);
contaPoupanca.sacar(100);
</code></pre>

<h2>📄 Licença</h2>
<p>Este projeto é de código aberto e está disponível sob a licença MIT. Para mais informações, consulte o arquivo LICENSE no repositório.</p>

<h2>👤 Autor</h2>
<p>Desenvolvido por <strong>Michael Bullet</strong> - <a href="https://github.com/BulletDEV">GitHub</a></p>

</body>
</html>
