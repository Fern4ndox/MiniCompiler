// Generated from compix\simple\MiniCompiler\compiler.g4 by ANTLR 4.5.1
package compix.simple.MiniCompiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compilerParser}.
 */
public interface compilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compilerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compilerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compilerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(compilerParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(compilerParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#mostrar_text}.
	 * @param ctx the parse tree
	 */
	void enterMostrar_text(compilerParser.Mostrar_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#mostrar_text}.
	 * @param ctx the parse tree
	 */
	void exitMostrar_text(compilerParser.Mostrar_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(compilerParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(compilerParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(compilerParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(compilerParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(compilerParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(compilerParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#declarar_string}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_string(compilerParser.Declarar_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#declarar_string}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_string(compilerParser.Declarar_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#def_var}.
	 * @param ctx the parse tree
	 */
	void enterDef_var(compilerParser.Def_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#def_var}.
	 * @param ctx the parse tree
	 */
	void exitDef_var(compilerParser.Def_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(compilerParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(compilerParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#declarar_int}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_int(compilerParser.Declarar_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#declarar_int}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_int(compilerParser.Declarar_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(compilerParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(compilerParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#dobles}.
	 * @param ctx the parse tree
	 */
	void enterDobles(compilerParser.DoblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#dobles}.
	 * @param ctx the parse tree
	 */
	void exitDobles(compilerParser.DoblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compilerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compilerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterAritmetico(compilerParser.AritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitAritmetico(compilerParser.AritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(compilerParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(compilerParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#caden}.
	 * @param ctx the parse tree
	 */
	void enterCaden(compilerParser.CadenContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#caden}.
	 * @param ctx the parse tree
	 */
	void exitCaden(compilerParser.CadenContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(compilerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(compilerParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(compilerParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(compilerParser.TextoContext ctx);
}