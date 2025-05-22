package ArrayseCollections;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<Usuario, String> usuarios = new HashMap<Usuario, String>();
        usuarios.put(new Usuario("Felipe", "email1@gmail.com"), "Muito foda ele");
        usuarios.put(new Usuario("Thayssa", "email2@gmail.com"), "Muito linda");
        System.out.println(usuarios.containsKey(new Usuario("Felipe", "email1@gmail.com")));
        System.out.println(usuarios.get(new Usuario("Felipe", "email2@gmail.com")));
        System.out.println(usuarios.containsKey(new Usuario("Thayssa", "email1@gmail.com")));
    }
}
