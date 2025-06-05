import java.util.Random;
public class Pokemon {
    private String nome;
    private String tipo;
    private int livello;
    private int HP;
    private int attacco;
    private int difesa;
    private int velocita;
    private int attaccoSpeciale;
    private int difesaSpeciale;
    private int esperienza;

    public Pokemon(String nome, String tipo, int livello, int HP, int attacco, int difesa, int velocita, int attaccoSpeciale, int difesaSpeciale) {
        this.nome = nome;
        this.tipo = tipo;
        this.livello = livello;
        this.HP = HP;
        this.attacco = attacco;
        this.difesa = difesa;
        this.velocita = velocita;
        this.attaccoSpeciale = attaccoSpeciale;
        this.difesaSpeciale = difesaSpeciale;
        this.esperienza = 0; // Pokemon di livello 1 parte con 0 XP
    }

    public void attacca(Pokemon bersaglio) {
        double randFactor = 0.85 + Math.random() * (1 - 0.85);
        int danno = (int) ((int)((((2 * livello) / 2 + 2) * 20 * attacco / bersaglio.difesa) / 10 + 2) * randFactor) - bersaglio.difesa/bersaglio.velocita;
        System.out.println(this.nome + " attacca " + bersaglio.nome + " e infligge " + danno + " danni.");
        bersaglio.subisciDanno(danno);
    }

    public void usaAttaccoSpeciale(Pokemon bersaglio) {
        double randFactor = 0.85 + Math.random() * (1 - 0.85);
        int danno = (int) ((int)((((2 * livello) / 2 + 2) * 20 * attaccoSpeciale / bersaglio.difesaSpeciale) / 10 + 2) * randFactor) - bersaglio.difesaSpeciale/bersaglio.velocita;
        System.out.println(this.nome + " usa l'attacco speciale su " + bersaglio.nome + " e infligge " + danno + " danni.");
        bersaglio.subisciDanno(danno);
    }



    public void subisciDanno(int danno) {
        this.HP -= danno;
        if (this.HP < 0) this.HP = 0;
        System.out.println(this.nome + " subisce " + danno + " danni. HP rimanenti: " + this.HP);
    }

    public void salireDiLivello() {
        this.livello += 1;
    }

    public void guadagnaEsperienza(int exp) {
        this.esperienza += exp;
    }

    public static class LanciaDado {
        private Random random;
        public LanciaDado() {
            random = new Random();
        }
        public int lancia() {
            return random.nextInt(20) + 1;
            // Genera un numero tra 1 e 20
        }
    }

    public void visualizza() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Livello: " + this.livello);
        System.out.println("HP: " + this.HP);
        System.out.println("Attacco: " + this.attacco);
        System.out.println("Difesa: " + this.difesa);
        System.out.println("Velocita: " + this.velocita);
        System.out.println("Attacco Speciale: " + this.attaccoSpeciale);
        System.out.println("Difesa Speciale: " + this.difesaSpeciale);
        System.out.println("Esperienza: " + this.esperienza);
    }
    public void usaPozione() {
        int cura = 10;
        this.HP += cura;
        if (this.HP > 100) this.HP = 100;
        System.out.println(this.nome + " ha usato una pozione di cura. HP attuali: " + this.HP);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getAttaccoSpeciale() {
        return attaccoSpeciale;
    }

    public void setAttaccoSpeciale(int attaccoSpeciale) {
        this.attaccoSpeciale = attaccoSpeciale;
    }

    public int getDifesaSpeciale() {
        return difesaSpeciale;
    }

    public void setDifesaSpeciale(int difesaSpeciale) {
        this.difesaSpeciale = difesaSpeciale;
    }

    public int getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(int esperienza) {
        this.esperienza = esperienza;
    }

    public boolean isAlive() {
        return this.HP > 0;
    }
}
