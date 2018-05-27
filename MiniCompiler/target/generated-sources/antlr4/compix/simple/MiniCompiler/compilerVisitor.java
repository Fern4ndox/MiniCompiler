// Generated from compix\simple\MiniCompiler\compiler.g4 by ANTLR 4.5.1
package compix.simple.MiniCompiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compilerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compilerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(compilerParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#mostrar_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar_text(compilerParser.Mostrar_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(compilerParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(compilerParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(compilerParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declarar_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_string(compilerParser.Declarar_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#def_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_var(compilerParser.Def_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(compilerParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declarar_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_int(compilerParser.Declarar_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(compilerParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dobles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDobles(compilerParser.DoblesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compilerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetico(compilerParser.AritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(compilerParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#caden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaden(compilerParser.CadenContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(compilerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(compilerParser.TextoContext ctx);
}