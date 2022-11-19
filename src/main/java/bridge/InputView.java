package bridge;

import camp.nextstep.edu.missionutils.Console;

import static bridge.Error.*;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    BridgeGame bridgeGame;

    public InputView(BridgeGame bridgeGame) {
        this.bridgeGame = bridgeGame;
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public static int readBridgeSize() {
        System.out.println("다리 건너기 게임을 시작합니다.\n\n다리의 길이를 입력해주세요.");
        String input = Console.readLine();
        System.out.println();

        isNumber(input);
        isStartZero(input);
        int size = Integer.parseInt(input);

        isValidNumber(size);
        return size;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public void readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String input = Console.readLine();

        isValidFootHold(input);

        bridgeGame.move(input);
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String input = Console.readLine();

        isValidCommand(input);

        return input;
    }
}
