package przypomnienie;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    //given
    private Weapon sword = new Weapon("sword", 20, 40, 3);

    @Test
    @RepeatedTest(1000)
    public void sword_should_generate_correct_dmg_values() {
        //when
        int dmg = sword.attack();

        //then
        assertThat(dmg)
                .isLessThanOrEqualTo(40)
                .isGreaterThanOrEqualTo(20);
    }

    @Test
    public void sword_loses_durability_and_brakes() {
        sword.attack();
        sword.attack();
        sword.attack();
        int dmg = sword.attack();

        assertThat(dmg).isEqualTo(0);
    }

}
