package com.client.gemini;

import com.client.gemini.model.EnumChave;
import com.client.gemini.model.Senha;
import org.bluesky.client.BskyAgent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Desfazedorpplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Desfazedorpplication.class, args);
        System.out.println("Iniciando..");

        Senha senha = new Senha();

        ClientGemini clientGemini = new ClientGemini(senha.getSenha());

        // Vamos para um getpostautor,  ou o post mais interessante
        String postASerDiscordado = "Eu odeio café pq ele não é frio, odeio isso";

        String prompt = "Quero que você gere uma publicação para o bluesky discordando desse port aqui ó :" + postASerDiscordado + "Regras básicas sobre o Post: Tem que ter no máximo 300 caracteres";

        BskyAgent meuAgentFoda = new BskyAgent("testepatinho.bsky.social", senha.getSenhaPerfil());

        meuAgentFoda.createPost(clientGemini.generateContent(prompt));

        System.out.println("SAL");
    }


}
