public class Main {
    public static void main(String[] args){
        System.out.println("HERO!");
        Hero hero = new Hero();
        Player player = new Player();
        player.drawHeros();
        player.showDeck();
        System.out.println(hero.toString());

    }
}