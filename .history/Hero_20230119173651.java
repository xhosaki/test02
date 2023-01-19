import java.util.Random;
public class Hero {
String name;
int power;//1:normal,2:uncommon,3:rare,4:ultra rare
Hero() {

Random random = new Random();
this.name = this.summonHero(random.nextInt(4));
this.power = random.nextInt(100);

}
String summonHero(int hnumber) {

String heros[] = {"スーパーマン", "バットマン",
"スパイダーマン", "アンパンマン"};

return heros[hnumber];

}
@Override
public String toString() {

return this.name + ":パワー[" + this.power + "]";

}

}
