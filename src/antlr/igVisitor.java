// Generated from ig.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link igParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface igVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link igParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull igParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull igParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull igParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull igParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull igParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull igParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull igParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link igParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull igParser.ClassDeclarationContext ctx);
}