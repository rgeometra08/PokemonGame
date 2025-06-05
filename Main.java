import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Pokemon[] pokemonList = {
                new Pokemon("Pikachu", "Elettro", 1, 55, 45, 40, 70, 55, 50),
                new Pokemon("Charmander", "Fuoco", 1, 39, 52, 43, 65, 60, 50),
                new Pokemon("Squirtle", "Acqua", 1, 44, 48, 65, 43, 57, 64),
                new Pokemon("Bulbasaur", "Erba", 1, 45, 49, 49, 45, 65, 65),
                new Pokemon("Jigglypuff", "Normale", 1, 70, 45, 40, 40, 52, 40),
                new Pokemon("Meowth", "Normale", 1, 40, 45, 40, 70, 50, 40),
                new Pokemon("Psyduck", "Acqua", 1, 50, 52, 48, 55, 65, 50),
                new Pokemon("Machop", "Lotta", 1, 70, 55, 50, 40, 68, 40),
                new Pokemon("Magnemite", "Elettro", 1, 25, 42, 70, 45, 62, 55),
                new Pokemon("Geodude", "Lotta", 1, 40, 43, 70, 40, 63, 40),
                new Pokemon("Ponyta", "Fuoco", 1, 50, 55, 55, 70, 65, 65),
                new Pokemon("Slowpoke", "Acqua", 1, 70, 51, 65, 40, 64, 40),
                new Pokemon("Grimer", "Veleno", 1, 70, 45, 50, 40, 55, 50),
                new Pokemon("Shellder", "Acqua", 1, 40, 53, 70, 40, 64, 40),
                new Pokemon("Gastly", "Veleno", 1, 40, 55, 40, 70, 70, 40),
                new Pokemon("Drowzee", "Psico", 1, 60, 48, 45, 42, 56, 70),
                new Pokemon("Krabby", "Acqua", 1, 40, 61, 70, 50, 70, 40),
                new Pokemon("Voltorb", "Elettro", 1, 40, 43, 50, 70, 64, 55),
                new Pokemon("Eevee", "Normale", 1, 55, 55, 50, 55, 68, 65),
                new Pokemon("Vulpix", "Fuoco", 1, 40, 41, 40, 65, 57, 65),
                new Pokemon("Abra", "Psico", 1, 40, 40, 40, 70, 69, 55),
                new Pokemon("Oddish", "Erba", 1, 45, 50, 55, 40, 68, 65),
                new Pokemon("Growlithe", "Fuoco", 1, 55, 50, 45, 60, 67, 50),
                new Pokemon("Poliwag", "Acqua", 1, 40, 50, 40, 70, 56, 40),
                new Pokemon("Bellsprout", "Erba", 1, 50, 61, 40, 40, 70, 40),
                new Pokemon("Caterpie", "Erba", 1, 45, 50, 40, 45, 67, 40),
                new Pokemon("Weedle", "Erba", 1, 40, 48, 40, 50, 66, 40),
                new Pokemon("Pidgey", "Normale", 1, 40, 45, 40, 56, 57, 40),
                new Pokemon("Rattata", "Normale", 1, 40, 56, 40, 70, 69, 40),
                new Pokemon("Spearow", "Normale", 1, 40, 60, 40, 70, 70, 40),
                new Pokemon("Ekans", "Veleno", 1, 40, 60, 44, 55, 70, 54),
                new Pokemon("Sandshrew", "Lotta", 1, 50, 52, 70, 40, 63, 40),
                new Pokemon("NidoranF", "Veleno", 1, 55, 47, 52, 41, 66, 40),
                new Pokemon("NidoranM", "Veleno", 1, 46, 57, 40, 50, 63, 40),
                new Pokemon("Clefairy", "Folletto", 1, 70, 45, 48, 40, 60, 65) };

        System.out.println("+-------------------------------------------------------------------------------------------------------+");
        System.out.println("| # | Nome       | Tipo         | HP | Attacco | Difesa | Velocità | Attacco Speciale | Difesa Speciale |");
        System.out.println("+-------------------------------------------------------------------------------------------------------+");
        for (int i = 0; i < pokemonList.length; i++) {
            Pokemon p = pokemonList[i];
            System.out.printf("| %2d | %-10s | %-12s | %2d | %7d | %6d | %8d | %15d | %15d |\n",
                    i + 1, p.getNome(), p.getTipo(), p.getHP(), p.getAttacco(), p.getDifesa(), p.getVelocita(), p.getAttaccoSpeciale(), p.getDifesaSpeciale());
        }
        System.out.println("+-------------------------------------------------------------------------------------------------------+");
        System.out.println("Vuoi scegliere un Pokémon esistente (1) o crearne uno nuovo (2)?");
        int scelta = scanner.nextInt();
        scanner.nextLine();
        Pokemon mioPokemon;
        if (scelta == 1) {
            System.out.println("Scegli un Pokémon dalla lista:");
            int sceltaPokemon = scanner.nextInt();
            mioPokemon = pokemonList[sceltaPokemon - 1];
        } else {
            System.out.print("Inserisci il nome del tuo Pokémon: ");
            String nome = scanner.nextLine();
            System.out.print("Inserisci il tipo del tuo Pokémon: ");
            String tipo = scanner.nextLine();
            System.out.print("Inserisci il livello del tuo Pokémon (1): ");
            int livello = scanner.nextInt();
            System.out.print("Inserisci HP per il tuo Pokémon (40-70): ");
            int HP = scanner.nextInt();
            System.out.print("Inserisci attacco per il tuo Pokémon (40-70): ");
            int attacco = scanner.nextInt();
            System.out.print("Inserisci difesa per il tuo Pokémon (40-70): ");
            int difesa = scanner.nextInt();
            System.out.print("Inserisci velocità per il tuo Pokémon (40-70): ");
            int velocità = scanner.nextInt();
            System.out.print("Inserisci attacco speciale per il tuo Pokémon (40-70): ");
            int attaccoSpeciale = scanner.nextInt();
            System.out.print("Inserisci difesa speciale per il tuo Pokémon (40-70): ");
            int difesaSpeciale = scanner.nextInt();
            if (HP + attacco + difesa + velocità + attaccoSpeciale + difesaSpeciale < 240 || HP + attacco + difesa + velocità + attaccoSpeciale + difesaSpeciale > 420) {
                System.out.println("Statistiche non valide, assicurati che la somma sia compresa tra 240 e 420.");
                scanner.close();
                return;
            }
            mioPokemon = new Pokemon(nome, tipo, livello, HP, attacco, difesa, velocità, attaccoSpeciale, difesaSpeciale);
        }

        System.out.println("Il tuo Pokémon:");
        mioPokemon.visualizza();

        Pokemon pokemonAvversario = pokemonList[random.nextInt(pokemonList.length)];
        System.out.println("\nPokémon Avversario:");
        pokemonAvversario.visualizza();

        int lancio1, lancio2;
        do {
            lancio1 = new Pokemon.LanciaDado().lancia();
            lancio2 = new Pokemon.LanciaDado().lancia();
            System.out.println("Giocatore 1 ha ottenuto: " + lancio1);
            System.out.println("Giocatore 2 ha ottenuto: " + lancio2);
            if (lancio1 == lancio2) {
                System.out.println("È un pareggio! Ritenta.");
            }
        } while (lancio1 == lancio2);
        if (lancio1 > lancio2) {
            System.out.println("Giocatore 1 inizia!");
        } else {
            System.out.println("Giocatore 2 inizia!");
        }

        while (mioPokemon.isAlive() && pokemonAvversario.isAlive()) {
            System.out.println("\nScegli la tua azione:");
            System.out.println("1. Attacco");
            System.out.println("2. Attacco Speciale");
            System.out.println("3. Usa Pozione di Cura");
            int azione = scanner.nextInt();
            switch (azione) {
                case 1:
                    mioPokemon.attacca(pokemonAvversario);
                    break;
                case 2:
                    mioPokemon.usaAttaccoSpeciale(pokemonAvversario);
                    break;
                case 3:
                    mioPokemon.usaPozione();
                    break;
                default:
                    System.out.println("Azione non valida.");
                    continue;
            }
            if (pokemonAvversario.isAlive()) {
                int azioneAvversario = random.nextInt(4) + 1;
                switch (azioneAvversario) {
                    case 1:
                        pokemonAvversario.attacca(mioPokemon);
                        break;
                    case 2:
                        pokemonAvversario.usaAttaccoSpeciale(mioPokemon);
                        break;
                }
            }
        }
        if (mioPokemon.isAlive()) {
            System.out.println("\nHai vinto la battaglia!");
            int XP = 1;
            mioPokemon.guadagnaEsperienza(XP);
            System.out.println("Hai guadagnato " + XP + " punti esperienza.");
        } else {
            System.out.println("\nHai perso la battaglia.");
        }
        scanner.close();
    }
}
