package main;

public class MyListener extends ScannerBaseListener {
    @Override
    public void enterClassDeclaration(ScannerParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);

        // colocar aqui codigos para acontecer
        // quando entrar no no classDeclaration

        System.out.printf("{\n");
    }

    @Override
    public void enterClassName(ScannerParser.ClassNameContext ctx) {
        super.enterClassName(ctx);

        System.out.printf("    \"name\": %s", ctx.ID());
    }

    @Override
    public void exitClassDeclaration(ScannerParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);

        // quando sair do classDeclaration ele chama esse

        System.out.printf("\n}");
    }
}
