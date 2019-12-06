package main;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.text.Normalizer;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static int id = 0xff00;

    public static void main(String...args) throws IOException {
        // Arquivo de entrada
        String filePath = "Parte_1/src/test/correto.jmm";
        ANTLRFileStream input = new ANTLRFileStream(filePath);

        // Parser, Scanner
        Scanner scanner = new Scanner(input);
        scanner.removeErrorListeners();
        scanner.addErrorListener(ThrowingErrorListener.INSTANCE);

        // Lista de Tokens
        List<ParsedToken> tokens = new LinkedList<>();

        // Tabela de símbolos
        Hashtable<String, Integer> symbolTable = new Hashtable<>();

        while (!scanner._hitEOF) {
            try {
                Token token = scanner.nextToken();
                switch (token.getType()) {
                    case Scanner.ID:
                        String identifier = token.getText();
                        if (symbolTable.get(identifier) == null) {
                            symbolTable.put(token.getText(), id++);
                        }
                        tokens.add(new ParsedToken(token.getType(), "ID", symbolTable.get(identifier), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.ABSTRACT:
                        tokens.add(new ParsedToken(token.getType(), "ABSTRACT", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.EXTENDS:
                        tokens.add(new ParsedToken(token.getType(), "EXTENDS", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.INT:
                        tokens.add(new ParsedToken(token.getType(), "INT", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.PROTECTED:
                        tokens.add(new ParsedToken(token.getType(), "PROTECTED", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.THIS:
                        tokens.add(new ParsedToken(token.getType(), "THIS", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.BOOLEAN:
                        tokens.add(new ParsedToken(token.getType(), "BOOLEAN", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.FALSE:
                        tokens.add(new ParsedToken(token.getType(), "FALSE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.NEW:
                        tokens.add(new ParsedToken(token.getType(), "NEW", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.PUBLIC:
                        tokens.add(new ParsedToken(token.getType(), "PUBLIC", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.TRUE:
                        tokens.add(new ParsedToken(token.getType(), "TRUE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.CHAR:
                        tokens.add(new ParsedToken(token.getType(), "CHAR", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.IMPORT:
                        tokens.add(new ParsedToken(token.getType(), "IMPORT", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.NULL:
                        tokens.add(new ParsedToken(token.getType(), "NULL", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.RETURN:
                        tokens.add(new ParsedToken(token.getType(), "RETURN", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.VOID:
                        tokens.add(new ParsedToken(token.getType(), "VOID", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.CLASS:
                        tokens.add(new ParsedToken(token.getType(), "CLASS", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.IF:
                        tokens.add(new ParsedToken(token.getType(), "IF", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.PACKAGE:
                        tokens.add(new ParsedToken(token.getType(), "PACKAGE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.STATIC:
                        tokens.add(new ParsedToken(token.getType(), "STATIC", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.WHILE:
                        tokens.add(new ParsedToken(token.getType(), "WHILE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.ELSE:
                        tokens.add(new ParsedToken(token.getType(), "ELSE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.INSTANCEOF:
                        tokens.add(new ParsedToken(token.getType(), "INSTANCEOF", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.PRIVATE:
                        tokens.add(new ParsedToken(token.getType(), "PRIVATE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.SUPER:
                        tokens.add(new ParsedToken(token.getType(), "SUPER", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.ATRIBUICAO:
                        tokens.add(new ParsedToken(token.getType(), "ATRIBUICAO", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.IGUALDADE:
                        tokens.add(new ParsedToken(token.getType(), "IGUALDADE", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.OpMaior:
                        tokens.add(new ParsedToken(token.getType(), "OpMaior", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.INCREMENTO:
                        tokens.add(new ParsedToken(token.getType(), "INCREMENTO", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.AND:
                        tokens.add(new ParsedToken(token.getType(), "AND", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.OR:
                        tokens.add(new ParsedToken(token.getType(), "OR", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.OpMenorIgual:
                        tokens.add(new ParsedToken(token.getType(), "OpMenorIgual", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.OpNegacao:
                        tokens.add(new ParsedToken(token.getType(), "OpNegacao", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.SUBITRACAO:
                        tokens.add(new ParsedToken(token.getType(), "SUBITRACAO", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.DECREMENTO:
                        tokens.add(new ParsedToken(token.getType(), "DECREMENTO", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.ADICAO:
                        tokens.add(new ParsedToken(token.getType(), "ADICAO", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.OpSomaAtribuicao:
                        tokens.add(new ParsedToken(token.getType(), "OpSomaAtribuicao", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.MULTIPLICACAO:
                        tokens.add(new ParsedToken(token.getType(), "MULTIPLICACAO", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.Virgula:
                        tokens.add(new ParsedToken(token.getType(), "Virgula", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.Ponto:
                        tokens.add(new ParsedToken(token.getType(), "Ponto", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.AC:
                        tokens.add(new ParsedToken(token.getType(), "AC", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.AbreChave:
                        tokens.add(new ParsedToken(token.getType(), "AbreChave", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.AP:
                        tokens.add(new ParsedToken(token.getType(), "AP", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.FP:
                        tokens.add(new ParsedToken(token.getType(), "FP", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.FechaChave:
                        tokens.add(new ParsedToken(token.getType(), "FechaChave", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.FC:
                        tokens.add(new ParsedToken(token.getType(), "FC", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.PontVirgula:
                        tokens.add(new ParsedToken(token.getType(), "PontVirgula", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.Int:
                        tokens.add(new ParsedToken(token.getType(), "Int", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                    case Scanner.StringLiteral:
                        tokens.add(new ParsedToken(token.getType(), "StringLiteral", token.getText(), token.getLine(), token.getCharPositionInLine(), token.getText()));
                        break;
                }
            }
            catch (ParseCancellationException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }

        System.out.println("------");
        System.out.println("Tokens");
        System.out.println("------");
        for (ParsedToken token : tokens) {
            System.out.println(token);
        }

        System.out.println();

        System.out.println("------------------");
        System.out.println("Tabela de símbolos");
        System.out.println("------------------");
        symbolTable.forEach((key, value) -> {
            System.out.printf("%s %s-->%s %s\n", String.format("0x%X", value), Formatter.ANSI_BLUE, Formatter.ANSI_RESET, key);
        });
    }
}
