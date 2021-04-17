package przypomnienie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player healthyPlayer;
    private Player woundedPlayer;

    @BeforeEach // wykonuje się przed testem
    public void setUp(){
        Weapon sword = new Weapon("sword",20,40,5);
        Weapon wand = new Weapon("wand", 0, 100, 6);
        healthyPlayer = new Player("warrior",100,sword);
        woundedPlayer = new Player("warrior",100,150,wand);
    }

    @Test
    public void heal_should_increase_hp_by_given_value() {
        //given
        //when
        woundedPlayer.heal(20);
        //then
        assertEquals(120, woundedPlayer.getHp());
        assertThat(woundedPlayer.getHp()).isEqualTo(120);//assertJ
    }

    @Test
    public void healing_at_full_health_dont_work(){
        //given
        //when
        woundedPlayer.heal(51);
        //then
        assertThat(woundedPlayer.getHp()).isLessThanOrEqualTo(150);
    }

}
