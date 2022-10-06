package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    @Test
    @DisplayName("이름을 가진 자동차 객체를 생성한다")
    void generateCar(){
        RacingCar racingCar = new RacingCar("car1");

        assertThat(racingCar.getName()).isEqualTo("car1");

    }

    @Test
    @DisplayName("1-5자의 이름을 가진 자동차 객체를 생성한다.")
    void generateCarNameValid1to5length(){
        RacingCar racingCar1 = new RacingCar("12345");

        assertTrue(racingCar1.getName().length() <= 5);

    }

    @Test
    @DisplayName("자동차 생성중 이름 5자를 초과하여 IllegalArgumentException을 발생시킨다.")
    void generateCarThrowException(){

        assertThatThrownBy(() -> {
            RacingCar racingCar3 = new RacingCar("12345");
            RacingCar racingCar4 = new RacingCar("123456");
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");

    }

    @Test
    @DisplayName("전진 횟수 필드를 가진 자동차 객체를 생성한다.")
    void generateCarForwardCount(){
        RacingCar racingCar = new RacingCar("car1");
        int forwardCount = racingCar.getForwardCount();

        assertThat(forwardCount).isInstanceOf(Integer.class);

    }

    @Test
    @DisplayName("자동차를 1회 전진한다.")
    void forwardOneCar(){
        RacingCar racingCar = new RacingCar("car1");
        racingCar.forwardCount();

        assertThat(racingCar.getForwardCount()).isEqualTo(1);

    }

}
