// Generated from /home/william/IdeaProjects/TrabalhoCompiladores/src/antlr/Scanner.g4 by ANTLR 4.7.2
package main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScannerParser}.
 */
public interface ScannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ScannerParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ScannerParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ScannerParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ScannerParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ScannerParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ScannerParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(ScannerParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(ScannerParser.InstructionContext ctx);
}