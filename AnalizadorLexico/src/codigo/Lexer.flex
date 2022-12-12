package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme; 
%}
%%

int | if | else | while | string {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
";" {return FINSENTENCIA;}
"'" {return SIMBOLO;}
[a-zA-Z]* {lexeme=yytext(); return Letras;}
[0-9]*-([0-9]{1}|[a-zA-Z]{1}) {lexeme=yytext(); return NIT; }
[0-9]{1} {lexeme=yytext(); return DIGITO; }
502-[0-9]{8} {lexeme=yytext(); return NUMEROTELEFONICO; }
ifx=[0-9]{1}&&y=[a-zA-Z]{1}[0-9]{1}  {lexeme=yytext(); return ENTRADACONDICIONAL; }
502 {lexeme=yytext(); return Numero_decimal; }
[a-zA-Z][a-zA-Z0-9_]*  {lexeme=yytext(); return Identificador; }
{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
