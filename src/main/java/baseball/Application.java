package baseball;

import baseball.api.BaseBall;

public class Application {
    public static void main(String[] args) throws IllegalArgumentException{
        // TODO: 프로그램 구현
        BaseBall.startGame().run().retryGame();
    }
}
