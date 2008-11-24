// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.AstAdapter;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class argumentsType extends PythonTree {
    private java.util.List<exprType> args;
    public java.util.List<exprType> getInternalArgs() {
        return args;
    }
    public Object getArgs() {
        return new ListWrapper(args);
    }
    public void setArgs(Object args) {
        this.args = AstAdapter.to_exprList(args);
    }

    private String vararg;
    public String getInternalVararg() {
        return vararg;
    }
    public Object getVararg() {
        return vararg;
    }
    public void setVararg(Object vararg) {
        this.vararg = AstAdapter.to_identifier(vararg);
    }

    private String kwarg;
    public String getInternalKwarg() {
        return kwarg;
    }
    public Object getKwarg() {
        return kwarg;
    }
    public void setKwarg(Object kwarg) {
        this.kwarg = AstAdapter.to_identifier(kwarg);
    }

    private java.util.List<exprType> defaults;
    public java.util.List<exprType> getInternalDefaults() {
        return defaults;
    }
    public Object getDefaults() {
        return new ListWrapper(defaults);
    }
    public void setDefaults(Object defaults) {
        this.defaults = AstAdapter.to_exprList(defaults);
    }


    private final static String[] fields = new String[] {"args", "vararg",
                                                          "kwarg", "defaults"};
    public String[] get_fields() { return fields; }

    public argumentsType() {}
    public argumentsType(Object args, Object vararg, Object kwarg, Object
    defaults) {
        setArgs(args);
        setVararg(vararg);
        setKwarg(kwarg);
        setDefaults(defaults);
    }

    public argumentsType(Token token, java.util.List<exprType> args, String
    vararg, String kwarg, java.util.List<exprType> defaults) {
        super(token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<exprType>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<exprType>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public argumentsType(Integer ttype, Token token, java.util.List<exprType>
    args, String vararg, String kwarg, java.util.List<exprType> defaults) {
        super(ttype, token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<exprType>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<exprType>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public argumentsType(PythonTree tree, java.util.List<exprType> args, String
    vararg, String kwarg, java.util.List<exprType> defaults) {
        super(tree);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<exprType>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<exprType>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public String toString() {
        return "arguments";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("arguments(");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("vararg=");
        sb.append(dumpThis(vararg));
        sb.append(",");
        sb.append("kwarg=");
        sb.append(dumpThis(kwarg));
        sb.append(",");
        sb.append("defaults=");
        sb.append(dumpThis(defaults));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            for (PythonTree t : args) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (defaults != null) {
            for (PythonTree t : defaults) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}
