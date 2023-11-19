# :school: Escola Inteligente 
Este projeto é uma aplicação Java que simula um sistema de uma escola inteligente. A aplicação conta com três departamentos: Pessoa Estudante, Secretaria e Portaria. A partir da opção selecionada no menu principal `App.java`, a aplicação coleta as informações necessárias e executa a funcionalidade do departamento escolhido.

# ⚙️ Instalação das dependências
Para instalar as dependências do projeto, execute o comando `mvn install`. Isso fará o download das dependências configuradas no `pom.xml`, além de baixar as dependências indiretas.

# :mag: Testes
Para executar os testes, execute o comando `mvn test`.

# 🧹 Linter (Checkstyle)
O Checkstyle é usado para fazer a análise estática do código. Este projeto já vem com as dependências relacionadas ao linter configuradas no arquivo `pom.xml`. O Checkstyle já é executado jutamente aos testes. No entanto, caso deseje rodar o Checkstyle manualmente, basta executar o comando `mvn checkstyle:check`.

# :white_check_mark: Funcionalidades dos departamentos
## (1) Pessoa Estudante - Calcular idade em dias
Para calcular a idade em dias de uma pessoa estudante, selecione a opção 1 no menu principal. A aplicação solicitará o nome da pessoa estudante e a sua idade atual em anos, meses e dias decorridos desde seu aniversário. A idade em dias será calculada e exibida na tela.

## (2) Secretaria - Calcular a média das notas
Para calcular a média das notas de uma pessoa estudante, selecione a opção 2 no menu principal. A aplicação solicitará o nome da pessoa estudante e as quatro notas das avaliações. Em seguida, o método calcularMedia da classe Secretaria será chamado, passando as notas como argumentos. O método calculará e retornará a média das notas inseridas pela pessoa usuária.

## (3) Portaria - Emitir relatório de controle de acesso
Para registrar o acesso de pessoas estudantes pela portaria e emitir um relatório, selecione a opção 3 no menu principal. A aplicação solicitará a idade das pessoas estudantes que estão acessando a escola pela portaria. A idade será contabilizada para fins estatísticos e de registro.

O processo de contagem de idade se repete até que a opção de finalizar acessos seja escolhida. Ao finalizar, o relatório será impresso no console. O relatório conterá o total de pessoas estudantes que acessaram a escola pela portaria, assim como o número de pessoas estudantes do Ensino Fundamental I (de 6 a 10 anos), Ensino Fundamental II (de 11 a 14 anos) e Ensino Médio (a partir de 15 anos). O relatório também mostrará a porcentagem de pessoas estudantes em cada categoria em relação ao total de pessoas estudantes.

# :information_source: Considerações finais
Este projeto é apenas para fins educacionais. Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato.
