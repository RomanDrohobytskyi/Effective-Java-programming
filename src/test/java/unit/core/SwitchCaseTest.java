package unit.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwitchCaseTest {

    @Test
    void shouldBeDefaultCase(){
        int switchCaseOption = 3;
        String switchCase = "";
        switch(switchCaseOption) {
            default:
                switchCase = "default";
                break;
            case 1:
                switchCase = "1";
                break;
            case 2:
                switchCase = "2";
                break;
        }
        System.out.println(switchCase);
        assertTrue(switchCase.equals("default"));
    }

    @Test
    void shouldBeDefaultButAssignEachCase(){
        int switchCaseOption = 3;
        String switchCase = "";
        switch(switchCaseOption) {
            default:
                switchCase = "default";
            case 1:
                switchCase = "1";
            case 2:
                switchCase = "2";
        }
        System.out.println(switchCase);
        assertTrue(switchCase.equals("2"));
    }

    @Test
    void shouldBeSecondCase(){
        int switchCaseOption = 2;
        String switchCase = "";
        switch(switchCaseOption) {
            default:
                switchCase = "default";
                break;
            case 1:
                switchCase = "1";
                break;
            case 2:
                switchCase = "2";
                break;
        }
        System.out.println(switchCase);
        assertTrue(switchCase.equals("2"));
    }
}
