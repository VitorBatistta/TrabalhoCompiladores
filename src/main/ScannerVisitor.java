// Generated from /home/william/IdeaProjects/TrabalhoCompiladores/src/antlr/Scanner.g4 by ANTLR 4.7.2
package main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScannerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScannerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScannerParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(ScannerParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScannerParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ScannerParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScannerParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(ScannerParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScannerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(ScannerParser.InstructionContext ctx);
}