package racingcar.message;

public class Out {

    public static void printNextLine(){
        System.out.println();
    }

    public static void printInputTheRacingCarNames(){
        System.out.println(Message.MSG_INPUT_THE_RACING_CAR_NAMES);
    }

    public static void printResult() {
        System.out.println(Message.MSG_RESULT);
    }

    public static void printWinner(String winners){
        System.out.println(String.format(Message.MSG_WINNER_FORMAT, winners));
    }

}
