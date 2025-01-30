package com.client.gemini.botbluesky;

import com.client.gemini.ClientGemini;
import com.client.gemini.model.Senha;
import org.bluesky.client.BskyAgent;

import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;
import java.util.List;

public class BotBluesky {

    List<String> postAgent1;
    List<String> postAgent2;

    @Scheduled(fixedRate = 5000)
    public void botBluesky() throws IOException {

        Senha senha = new Senha();

        BskyAgent agent1 = new BskyAgent("tere", senha.getSenhaPerfil());
        BskyAgent agent2 = new BskyAgent("tere", senha.getSenhaPerfil());

        // O observado

        ClientGemini minhaIa = new ClientGemini(senha.getSenha());

        for(String postPerfil2: getPostAgent2()) {
            String prompt = "Quero que você gere uma publicação para o bluesky discordando desse port aqui ó :" + postPerfil2 + "Regras básicas sobre o Post: Tem que ter no máximo 300 caracteres";
            String postPublicado = minhaIa.generateContent(prompt);
            agent1.createPost(postPublicado);
            postAgent1.add(postPublicado);
        }

        for(String postPerfil1: getPostAgent1()) {
            String prompt = "Quero que você gere uma publicação para o bluesky discordando desse port aqui ó :" + postPerfil1 + "Regras básicas sobre o Post: Tem que ter no máximo 300 caracteres";
            String postPublicado = minhaIa.generateContent(prompt);
            agent2.createPost(postPublicado);
            postAgent2.add(postPublicado);
        }

        postAgent1.clear();
        postAgent2.clear();

    }

    public List<String> getPostAgent1() {
        return postAgent1;
    }

    public void setPostAgent1(List<String> postAgent1) {
        this.postAgent1 = postAgent1;
    }

    public List<String> getPostAgent2() {
        return postAgent2;
    }

    public void setPostAgent2(List<String> postAgent2) {
        this.postAgent2 = postAgent2;
    }

}
