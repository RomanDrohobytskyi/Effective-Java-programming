import effective.java.com.abstractfactory.AbstractFactory;
import effective.java.com.abstractfactory.factory.ButtonAndCheckboxMacOSFactory;
import effective.java.com.abstractfactory.factory.ButtonAndCheckboxWindowsOSFactory;
import effective.java.com.abstractfactory.model.button.MacOSButton;
import effective.java.com.abstractfactory.model.button.WindowsOSButton;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryTest {
    private static AbstractFactory macButtons;
    private static AbstractFactory windowsButtons;

    @BeforeAll
    public static void initButtons() {
        macButtons = new AbstractFactory(new ButtonAndCheckboxMacOSFactory());
        windowsButtons = new AbstractFactory(new ButtonAndCheckboxWindowsOSFactory());
    }

    @Test
    public void shouldBeMacButtons() {
        assertTrue(macButtons.getButton() instanceof MacOSButton);
    }

    @Test
    public void shouldWindowsButtons() {
        assertTrue(windowsButtons.getButton() instanceof WindowsOSButton);
    }
}
