// Generated from /home/william/IdeaProjects/TrabalhoCompiladores/src/antlr/JmmParser.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JmmParser}.
 */
public interface JmmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JmmParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JmmParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JmmParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(JmmParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(JmmParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JmmParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JmmParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JmmParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JmmParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JmmParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JmmParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JmmParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JmmParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(JmmParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(JmmParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JmmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JmmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JmmParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JmmParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JmmParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JmmParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JmmParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JmmParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JmmParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JmmParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JmmParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JmmParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JmmParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JmmParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JmmParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JmmParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JmmParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JmmParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JmmParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JmmParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JmmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JmmParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(JmmParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(JmmParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JmmParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JmmParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JmmParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JmmParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JmmParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JmmParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JmmParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JmmParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JmmParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JmmParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JmmParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JmmParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JmmParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JmmParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JmmParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JmmParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JmmParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JmmParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUnaryExpression(JmmParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUnaryExpression(JmmParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JmmParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JmmParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(JmmParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(JmmParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JmmParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JmmParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JmmParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JmmParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayDeclarator(JmmParser.NewArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayDeclarator(JmmParser.NewArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JmmParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JmmParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JmmParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JmmParser.LiteralContext ctx);
}