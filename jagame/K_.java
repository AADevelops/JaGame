/* K_ class
 * @description: Dependency for Key class.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/12/2023
 */

package jagame;

import java.awt.event.KeyEvent;

public class K_ {
    private static final int[] CONSTANT_FIELD_VALUES = { KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2,
                                                         KeyEvent.VK_3, KeyEvent.VK_4, KeyEvent.VK_5,
                                                         KeyEvent.VK_6, KeyEvent.VK_7, KeyEvent.VK_8,
                                                         KeyEvent.VK_9, KeyEvent.VK_A, KeyEvent.VK_ACCEPT,
                                                         KeyEvent.VK_ADD, KeyEvent.VK_AGAIN, KeyEvent.VK_ALL_CANDIDATES,
                                                         KeyEvent.VK_ALPHANUMERIC, KeyEvent.VK_ALT, KeyEvent.VK_ALT_GRAPH,
                                                         KeyEvent.VK_AMPERSAND, KeyEvent.VK_ASTERISK, KeyEvent.VK_AT,
                                                         KeyEvent.VK_B, KeyEvent.VK_BACK_QUOTE, KeyEvent.VK_BACK_SLASH,
                                                         KeyEvent.VK_BACK_SPACE, KeyEvent.VK_BEGIN, KeyEvent.VK_BRACELEFT,
                                                         KeyEvent.VK_BRACERIGHT, KeyEvent.VK_C, KeyEvent.VK_CANCEL,
                                                         KeyEvent.VK_CAPS_LOCK, KeyEvent.VK_CIRCUMFLEX, KeyEvent.VK_CLEAR,
                                                         KeyEvent.VK_CLOSE_BRACKET, KeyEvent.VK_CODE_INPUT, KeyEvent.VK_COLON,
                                                         KeyEvent.VK_COMMA, KeyEvent.VK_COMPOSE, KeyEvent.VK_CONTEXT_MENU,
                                                         KeyEvent.VK_CONTROL, KeyEvent.VK_CONVERT, KeyEvent.VK_COPY,
                                                         KeyEvent.VK_CUT, KeyEvent.VK_D, KeyEvent.VK_DEAD_ABOVEDOT,
                                                         KeyEvent.VK_DEAD_ABOVERING, KeyEvent.VK_DEAD_ACUTE, KeyEvent.VK_DEAD_BREVE,
                                                         KeyEvent.VK_DEAD_CARON, KeyEvent.VK_DEAD_CEDILLA, KeyEvent.VK_DEAD_CIRCUMFLEX,
                                                         KeyEvent.VK_DEAD_DIAERESIS, KeyEvent.VK_DEAD_DOUBLEACUTE, KeyEvent.VK_DEAD_GRAVE,
                                                         KeyEvent.VK_DEAD_IOTA, KeyEvent.VK_DEAD_MACRON, KeyEvent.VK_DEAD_OGONEK,
                                                         KeyEvent.VK_DEAD_SEMIVOICED_SOUND, KeyEvent.VK_DEAD_TILDE, KeyEvent.VK_DEAD_VOICED_SOUND,
                                                         KeyEvent.VK_DECIMAL, KeyEvent.VK_DELETE, KeyEvent.VK_DIVIDE, KeyEvent.VK_DOLLAR,
                                                         KeyEvent.VK_DOWN, KeyEvent.VK_E, KeyEvent.VK_END, KeyEvent.VK_ENTER, KeyEvent.VK_EQUALS,
                                                         KeyEvent.VK_ESCAPE, KeyEvent.VK_EURO_SIGN, KeyEvent.VK_EXCLAMATION_MARK, KeyEvent.VK_F,
                                                         KeyEvent.VK_F1, KeyEvent.VK_F10, KeyEvent.VK_F11, KeyEvent.VK_F12, KeyEvent.VK_F13,
                                                         KeyEvent.VK_F14, KeyEvent.VK_F15, KeyEvent.VK_F16, KeyEvent.VK_F17, KeyEvent.VK_F18,
                                                         KeyEvent.VK_F19, KeyEvent.VK_F2, KeyEvent.VK_F20, KeyEvent.VK_F21, KeyEvent.VK_F22,
                                                         KeyEvent.VK_F23, KeyEvent.VK_F24, KeyEvent.VK_F3, KeyEvent.VK_F4, KeyEvent.VK_F5,
                                                         KeyEvent.VK_F6, KeyEvent.VK_F7, KeyEvent.VK_F8, KeyEvent.VK_F9, KeyEvent.VK_FINAL,
                                                         KeyEvent.VK_FIND, KeyEvent.VK_FULL_WIDTH, KeyEvent.VK_G, KeyEvent.VK_GREATER, KeyEvent.VK_G,
                                                         KeyEvent.VK_HALF_WIDTH, KeyEvent.VK_HELP, KeyEvent.VK_HIRAGANA, KeyEvent.VK_HOME, KeyEvent.VK_I,
                                                         KeyEvent.VK_INPUT_METHOD_ON_OFF, KeyEvent.VK_INSERT, KeyEvent.VK_INVERTED_EXCLAMATION_MARK,
                                                         KeyEvent.VK_J, KeyEvent.VK_JAPANESE_HIRAGANA, KeyEvent.VK_JAPANESE_KATAKANA, KeyEvent.VK_JAPANESE_ROMAN,
                                                         KeyEvent.VK_K, KeyEvent.VK_KANA, KeyEvent.VK_KANA_LOCK, KeyEvent.VK_KANJI, KeyEvent.VK_KATAKANA,
                                                         KeyEvent.VK_KP_DOWN, KeyEvent.VK_KP_LEFT, KeyEvent.VK_KP_RIGHT, KeyEvent.VK_KP_UP, KeyEvent.VK_L,
                                                         KeyEvent.VK_LEFT, KeyEvent.VK_LEFT_PARENTHESIS, KeyEvent.VK_LESS, KeyEvent.VK_M, KeyEvent.VK_META,
                                                         KeyEvent.VK_MINUS, KeyEvent.VK_MODECHANGE, KeyEvent.VK_MULTIPLY, KeyEvent.VK_N, KeyEvent.VK_NONCONVERT,
                                                         KeyEvent.VK_NUM_LOCK, KeyEvent.VK_NUMBER_SIGN, KeyEvent.VK_NUMPAD0, KeyEvent.VK_NUMPAD1, KeyEvent.VK_NUMPAD2,
                                                         KeyEvent.VK_NUMPAD3, KeyEvent.VK_NUMPAD4, KeyEvent.VK_NUMPAD5, KeyEvent.VK_NUMPAD6, KeyEvent.VK_NUMPAD7,
                                                         KeyEvent.VK_NUMPAD8, KeyEvent.VK_NUMPAD9, KeyEvent.VK_O, KeyEvent.VK_OPEN_BRACKET, KeyEvent.VK_P, KeyEvent.VK_PAGE_DOWN,
                                                         KeyEvent.VK_PAGE_UP, KeyEvent.VK_PASTE, KeyEvent.VK_PAUSE, KeyEvent.VK_PERIOD, KeyEvent.VK_PLUS,
                                                         KeyEvent.VK_PREVIOUS_CANDIDATE, KeyEvent.VK_PRINTSCREEN, KeyEvent.VK_PROPS, KeyEvent.VK_Q, KeyEvent.VK_QUOTE,
                                                         KeyEvent.VK_QUOTEDBL, KeyEvent.VK_R, KeyEvent.VK_RIGHT, KeyEvent.VK_RIGHT_PARENTHESIS, KeyEvent.VK_ROMAN_CHARACTERS,
                                                         KeyEvent.VK_S, KeyEvent.VK_SCROLL_LOCK, KeyEvent.VK_SEMICOLON, KeyEvent.VK_SEPARATER, KeyEvent.VK_SEPARATOR,
                                                         KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH, KeyEvent.VK_SPACE, KeyEvent.VK_STOP, KeyEvent.VK_SUBTRACT, KeyEvent.VK_T,
                                                         KeyEvent.VK_TAB, KeyEvent.VK_U, KeyEvent.VK_UNDEFINED, KeyEvent.VK_UNDERSCORE, KeyEvent.VK_UNDO, KeyEvent.VK_UP,
                                                         KeyEvent.VK_V, KeyEvent.VK_W, KeyEvent.VK_WINDOWS, KeyEvent.VK_X, KeyEvent.VK_Y, KeyEvent.VK_Z };

    /* METHODS */

    public static void init(Key keyObject) {
        if (!keyObject.getKeyMap().isEmpty()) {
            keyObject.getKeyMap().clear();
        }

        for (int i = 0; i < CONSTANT_FIELD_VALUES.length; i++) {
            keyObject.getKeyMap().put(CONSTANT_FIELD_VALUES[i], false);
        }
    }

    /* GETTERS */

    public static int getFieldValue(int i) {
        return CONSTANT_FIELD_VALUES[i];
    }
}
