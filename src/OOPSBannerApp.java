public class OOPSBannerApp {

    static class CharacterPattern {
        private final char ch;
        private final String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    static CharacterPattern O = new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
    });

    static CharacterPattern P = new CharacterPattern('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
    });

    static CharacterPattern S = new CharacterPattern('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "     *",
            "     *",
            " ***** "
    });

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O.getPattern()[i] +
                            O.getPattern()[i] +
                            P.getPattern()[i] +
                            S.getPattern()[i]
            );
        }
    }
}
