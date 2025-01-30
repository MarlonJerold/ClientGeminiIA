## Biblioteca ClientGemini para Java

### gemini-1.5-flash

Estando na pasta onde esse repositório foi clonado rode ```mvn clean install```, certifique que você tem o mvn instalado, ao criar o build, você deve adicionar a seguinte dependência em seu arquivo ```pom.xml```

```xml
<dependency>
    <groupId>com.client.gemini</groupId>
    <artifactId>ClientGemini</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>

```

Em seguida, você pode chamar o ClientGemini passando sua chave, depois, utilize o método para fazer sua pergunta, será retornado em String sua resposta.


```Java
  ClientGemini clientGemini = new ClientGemini(keyString);
```

Método

```Java
System.out.println(clientGemini.generateContent("Me conte a história do Java"));
```

Até logo
