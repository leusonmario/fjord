package fjord.ast.expr;

import java.util.Optional;

import fjord.ast.Node;
import fjord.ast.NodeVisitor;

public class BaseCall implements Node {

  private final ObjectConstruction objectConstruction;

  private final Optional<String> ident;

  public BaseCall(ObjectConstruction objectConstruction) {
    this(objectConstruction, null);
  }

  public BaseCall(ObjectConstruction objectConstruction, String ident) {
    this.objectConstruction = objectConstruction;
    this.ident = Optional.ofNullable(ident);
  }

  @Override
  public void accept(NodeVisitor visitor) {
    visitor.visit(this);
  }

  public ObjectConstruction getObjectConstruction() {
    return objectConstruction;
  }

  public Optional<String> getIdent() {
    return ident;
  }

}
