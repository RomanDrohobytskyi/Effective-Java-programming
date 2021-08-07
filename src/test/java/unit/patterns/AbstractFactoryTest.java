package unit.patterns;

import effective.java.com.patterns.abstractfactory.AbstractFactory;
import effective.java.com.patterns.abstractfactory.factory.ButtonAndCheckboxMacOSFactory;
import effective.java.com.patterns.abstractfactory.factory.ButtonAndCheckboxWindowsOSFactory;
import effective.java.com.patterns.abstractfactory.model.button.MacOSButton;
import effective.java.com.patterns.abstractfactory.model.button.WindowsOSButton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryTest {
    private final AbstractFactory macButtons = new AbstractFactory(new ButtonAndCheckboxMacOSFactory());
    private final AbstractFactory windowsButtons = new AbstractFactory(new ButtonAndCheckboxWindowsOSFactory());

    private AbstractFactory getButtons() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("mac") ? macButtons : windowsButtons;
    }

    @Test
    public void shouldGetWindowsButtons() {
        AbstractFactory buttons = getButtons();
        assertTrue(buttons.getButton() instanceof WindowsOSButton);
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
