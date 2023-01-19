import java.util.ArrayList;
/*
*プレイヤーはヒーローデッキを持つ
* Deck:MonsterのArrayList
*/
public class Player {

ArrayList<Hero> deck = new ArrayList<>();
public void drawHeros() {

for (int i = 0; i < 4; i++) {
this.deck.add(new Hero());

}

}
public void showDeck() {

for (Hero h : this.deck){
System.out.println(h);

}

}

}
