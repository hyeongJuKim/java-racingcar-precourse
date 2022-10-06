package racingcar.model;

public class RacingCar {
    private int forwardCount = 0;
    private String name;

    public RacingCar(String name) {
        validNull(name);
        validLength(name);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private void validNull(String name){
        if(name == null){
            throw new IllegalArgumentException("[ERROR] 자동차의 이름을 입력해주세요.");
        }
    }

    private void validLength(String name){
        if(name.length() == 0 || name.length() > 5){
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 1-5자 이어야합니다. 입력한 이름 길이(" + name.length() + ")");
        }
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public int forwardCount() {
        return this.forwardCount++;
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "forwardCount=" + forwardCount +
                ", name='" + name + '\'' +
                '}';
    }
}
