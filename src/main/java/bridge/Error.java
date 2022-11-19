package bridge;

import net.bytebuddy.pool.TypePool;

public class Error {
    static final int minBridgeLength = 3;
    static final int maxBridgeLength = 20;

    static void isNumber(String userInput) {
        if (!userInput.matches("[0-9]+")) {
            throw new IllegalArgumentException("[ERROR] 3이상 20이하의 숫자를 입력해야 합니다.");
        }
    }

    static void isStartZero(String userInput) {
        if (userInput.charAt(0) == '0') {
            throw new IllegalArgumentException("[ERROR] 입력하는 숫자가 0으로 시작되지 않아야 합니다.");
        }
    }

    static void isValidNumber(int number) {
        if (number < minBridgeLength || number > maxBridgeLength) {
            throw new IllegalArgumentException("[ERROR] 3이상 20이하의 숫자를 입력해야 합니다.");
        }
    }

    static void isValidFootHold(String userInput) {
        if (!userInput.equals(Command.UP.getValue()) && !userInput.equals(Command.DOWN.getValue())) {
            throw new IllegalArgumentException("[ERROR] U나 D를 입력해야 합니다.");
        }
    }

    static void isValidCommand(String userInput) {
        if (!userInput.equals(Command.QUIT.getValue()) && !userInput.equals(Command.RESTART.getValue())) {
            throw new IllegalArgumentException("[ERROR] R이나 Q를 입력해야 합니다.");
        }
    }
}
