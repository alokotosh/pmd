package net.sourceforge.pmd.lang.cpp;

import java.io.Reader;
import java.util.Map;

import net.sourceforge.pmd.lang.AbstractParser;
import net.sourceforge.pmd.lang.TokenManager;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.ast.ParseException;

/**
 * Adapter for the C++ Parser.
 */
public class CppParser extends AbstractParser {

    public TokenManager getTokenManager(Reader source) {
	return new CppTokenManager(source);
    }

    public Node parse(Reader source) throws ParseException {
	throw new UnsupportedOperationException("parse(Reader) is not supported for C++");
    }

    public Map<Integer, String> getExcludeMap() {
	throw new UnsupportedOperationException("getExcludeMap() is not supported for C++");
    }
}
