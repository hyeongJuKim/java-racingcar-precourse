package racingcar.model;

public class RacingCar {
    private String name;
    private int forwardCount = 0;

    public RacingCar(String name) {

        if(name == null){
            throw new IllegalArgumentException("[ERROR] 자동차의 이름을 입력해주세요.");
        }

        if(name.length() > 5){
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 1-5자 이어야합니다. 입력한 이름 길이(" + name.length() + ")");
        }

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public int forwardCount() {
        return this.forwardCount++;
    }
}
