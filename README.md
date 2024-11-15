# desafio-pagnet

Desafio feito junto a Giuliana Bezerra [aqui](https://www.youtube.com/playlist?list=PLiFLtuN04BS1c-JvhKFxYyeD-GVtnwUcx). Baseado no desafio da [pagnet](https://github.com/Pagnet/desafio-back-end/tree/master) para uma vaga backend. A solução desenvolvida possui projetos front e backend e utiliza Spring Batch para o processamento de um arquivo CNAB e exibe os seus lançamentos importados em uma interface SPA com React.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [Spring Batch](https://spring.io/projects/spring-batch)
- [Vite](https://vitejs.dev)
- [React](https://pt-br.react.dev)
- [Tailwind](https://tailwindcss.com)
- Postgresql

## Como Executar

A executação deve ser feita com o Docker Compose, caso desejado, é possível executar cada projeto manualmente e localmente seguindo as instruções de seus respectivos arquivos README.

- Clonar repositório git:
```
git clone git@github.com:drianodev/desafio-pagnet.git
```
- Executar o script de inicialização:
```
chmod +x start.sh
./start.sh
```
- Acessar aplicação em `http://localhost:5173`. O arquivo de upload a ser usado deve ser no formato CNAB.
