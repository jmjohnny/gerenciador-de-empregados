# O programa gerenciador de Empregados.
Este programa tem como objetivo, de adicionar Empregados


# Como rodar a sistematização.
Abra o eclipse.


Abra o projeto com o nome" gerenciador-de-empregados"

Aperte o botão verde com aparência de um "play", que ao colocar o mouse em cima aparece a palavra "run".

Clica no console e escolha uma das opções.
## Opções no console:

Na opção "1", o usuário irá adicionar um empregado.

O método começa exibindo a mensagem "Adicionar novo empregado:" para informar ao usuário que o processo de adição de um novo empregado está iniciando.

O método solicita várias informações ao usuário, uma de cada vez, exibindo uma mensagem apropriada para cada dado necessário:

Nome: Exibe "Nome: " e espera que o usuário insira o nome do empregado.

Alergias: Exibe "Alergias: " e espera que o usuário insira qualquer alergia que o empregado possa ter.

Condições Médicas: Exibe "Condições Médicas: " e espera que o usuário insira quaisquer condições médicas pré-existentes do empregado.

Telefone de Contato: Exibe "Telefone de Contato: " e espera que o usuário insira o número de telefone de contato do empregado.

Email de Contato: Exibe "Email de Contato: " e espera que o usuário insira o email de contato do empregado.

Após coletar todas as informações necessárias, o método cria um novo objeto Empregado utilizando um construtor que recebe os dados coletados como parâmetros:
Empregado empregado = new Empregado(nome, alergias, condiçoes_preexistentes, telefone, emailContato).

Com o novo empregado adicionado, o programa volta para o menu inicial. 

As próximas opções no console são:

"2. Exibir Empregado". Serão exibidos todos os Empregados adicionados desde que o programa começou a ser rodado.

"3.Sair", ao selecionar essa opção, o programa é encerrado.


