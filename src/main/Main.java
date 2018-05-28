package main;

import ast.BooleanType;
import ast.ClassDeclExtends;
import ast.ClassDeclList;
import ast.ClassDeclSimple;
import ast.Identifier;
import ast.IdentifierType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.MainClass;
import ast.MethodDeclList;
import ast.Print;
import ast.Program;
import ast.VarDecl;
import ast.VarDeclList;
import visitor.PrettyPrintVisitor;

public class Main {

	public static void main(String[] args) {
		MainClass main = new MainClass(
				new Identifier("Teste"), 
				new Identifier("Testando"), 
				new Print(new IntegerLiteral(2))
		);
		
		VarDeclList vdl1 = new VarDeclList();
		vdl1.addElement(new VarDecl(
			new BooleanType(),
			new Identifier("flag")
		));
		vdl1.addElement(new VarDecl(
				new IntegerType(),
				new Identifier("num")
		));
		
		MethodDeclList mdl = new MethodDeclList();
		
		ClassDeclSimple A = new ClassDeclSimple(
					new Identifier("A"), vdl1, mdl
		);
		
		ClassDeclExtends B = new ClassDeclExtends(
				new Identifier("B"), new Identifier("A"), 
				new VarDeclList(), new MethodDeclList()
		);
		
		VarDeclList vdl2 = new VarDeclList();
		vdl2.addElement(new VarDecl(
				new IdentifierType("A"),
				new Identifier("obj")
		));
		ClassDeclSimple C = new ClassDeclSimple(
				new Identifier("C"), vdl2, new MethodDeclList()
		);
		
		ClassDeclList cdl = new ClassDeclList();
		cdl.addElement(A);
		cdl.addElement(B);
		cdl.addElement(C);

		Program p = new Program(main, cdl);
		
		PrettyPrintVisitor ppv = new PrettyPrintVisitor();
		ppv.visit(p);
	}

}
