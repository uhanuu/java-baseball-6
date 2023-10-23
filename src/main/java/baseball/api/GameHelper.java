package baseball.api;

import baseball.api.request.RequestChecker;

public class GameHelper {

    public GameStarter startGame() {
        return new GameStarter(Computer.getResult(), false, this);
    }

    public void retryGame() throws IllegalArgumentException {
        String request = RequestChecker.retryRequest();
        if(isRetryGame(request)){
            reStartGame().run().retryGame();
        }
    }

    public GameStarter reStartGame() {
        return new GameStarter(Computer.getResult(), true, this);
    }

    private boolean isRetryGame(String playNumber) throws IllegalArgumentException {
        switch (playNumber) {
            case "1" -> {return true;}
            case "2" -> {return false;}
            default ->
                    //잘못된 사용자 입력
                    throw new IllegalArgumentException(String.format("입력값 \"%s\"는 잘못된 요청 정보입니다.", playNumber));
        }
    }
}
