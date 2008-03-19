// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Interactive extends modType {
    public stmtType[] body;

    public static final String[] _fields = new String[] {"body"};

    public Interactive(Token token, stmtType[] body) {
        super(token);
        this.body = body;
        for(int ibody=0;ibody<body.length;ibody++) {
            addChild(body[ibody]);
        }
    }

    public Interactive(PythonTree tree, stmtType[] body) {
        super(tree);
        this.body = body;
        for(int ibody=0;ibody<body.length;ibody++) {
            addChild(body[ibody]);
        }
    }

    public String toString() {
        return "Interactive";
    }

}
