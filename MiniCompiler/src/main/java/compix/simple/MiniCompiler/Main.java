
package compix.simple.MiniCompiler;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import compix.simple.MiniCompiler.compilerParser.ProgramaContext;

public class Main {

	private static final String EXTENSION = "sim";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		compilerLexer lexer = new compilerLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		compilerParser parser = new compilerParser(tokens);

		ProgramaContext tree = parser.programa();

		compilerCustomVisitor visitor = new compilerCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
