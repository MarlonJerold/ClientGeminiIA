## Biiblioteca ClientGemini para Java

Ao clonar o projeto e usar o mvn install ```mvn clean install```, você pode utilizar o seguinte código

```Java
  ClientGemini clientGemini = new ClientGemini(keyString);
```

Você acessa a chave de gemini e passa como String, em seguida você pode utilizar o método para gerar.

```Java
System.out.println(clientGemini.generateContent("Me conte a história do Java"));
```

