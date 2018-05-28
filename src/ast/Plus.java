package ast;

import visitor.IVisitor;

public class Plus extends Exp {
	public Exp e1, e2;

	public Plus(Exp ae1, Exp ae2) {
		e1 = ae1;
		e2 = ae2;
	}

	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
