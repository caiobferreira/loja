package br.com.caio.cliente;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Cliente {

    private String nome;
    private final String token;
    public Cliente(String nome) throws Exception {
        this.nome = nome;
        String secret = "clientSecret1234";
        this.token = encrypt(nome, secret);
    }

    private static String encrypt(String input, String secretKey) throws Exception {
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String getNome() {
        return nome;
    }

    public String getToken() {
        return token;
    }
}
