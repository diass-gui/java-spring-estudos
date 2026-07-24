package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.models.MinhasPreferidas;
import br.com.alura.minhasmusicas.models.Musica;
import br.com.alura.minhasmusicas.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Jesus Chorou");
        minhaMusica.setArtista("Racionais MC's");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Mano a Mano");
        meuPodcast.setApresentador("Mano Brown");

        for (int i = 0; i < 2000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
