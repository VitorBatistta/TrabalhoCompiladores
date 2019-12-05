package main;

public class ParsedToken {
    private int idType;
    private String nameType;
    private Object value;

    public int getIdType() {
        return idType;
    }

    public String getNameType() {
        return nameType;
    }

    public Object getValue() {
        return value;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getLexeme() {
        return lexeme;
    }

    private int line;
    private int column;
    private String lexeme;

    public ParsedToken(int idType, String nameType, Object value, int line, int column, String lexeme) {
        this.idType = idType;
        this.nameType = nameType;
        this.value = value;
        this.line = line;
        this.column = column + 1;
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        Object value = null;

        if (nameType.equals("ID")) {
            value = "0x" + Integer.toHexString((int) this.value).toUpperCase();
        }
        else {
            value = this.value;
        }

        String tokenRaw = String.format("<%s, %s>", nameType, value);
        String tokenStr = String.format("%s<%s%s%s,%s %s%s>%s",
                Formatter.ANSI_RED,
                Formatter.ANSI_RESET,
                nameType,
                Formatter.ANSI_RED,
                Formatter.ANSI_RESET,
                value,
                Formatter.ANSI_RED,
                Formatter.ANSI_RESET);
        String lineStr = String.format("%sline %s%d%s:%s%d",
                Formatter.ANSI_GREEN,
                Formatter.ANSI_RESET,
                line,
                Formatter.ANSI_GREEN,
                Formatter.ANSI_RESET,
                column);
        return tokenStr + Formatter.padLeft(" ", 30 - tokenRaw.length()) + lineStr;
    }
}
