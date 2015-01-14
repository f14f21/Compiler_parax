/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


grammar Faz_1;
script:'void ' 'main' '('')' '{' stmt* '}';
stmt:ifstat|forstat|whilestat|assignstat ';'|expr ';'|define|print|Comment;
//stmt:ifstat|forstat|whilestat|assignstat|expr ';'|define|Comment;
assignstat:ID '=' expr;
ifstat:'if' '(' cond ')' (ifstat|'{' stmt* '}' (elsepart|expr) |elsepart);
elsepart:'else' (ifstat|'{' stmt* '}'|expr*);
cond:expr Relation expr;
Relation:'<'|'<='|'>'|'>='|'=='|'!='|'%';
OpRep:'++'|'--';
Relop:'+'|'-'|'*'|'/';
expr:term restexpr|term OpRep|term|restexpr|'(' expr ')'| '\'' expr '\'';
term:ID|Num;
ID:Letter(Letter|Num|'_')*;
Letter:('a'..'z')|('A'..'Z');
Num:('0'..'9')+;
restexpr:Relop expr |Relation expr|Relop;
whilestat:'while' '(' cond ')' '{' stmt* '}';
define:'int ' ID (',' ID)*? ';'|'char ' ID(',' ID)*? ';';
forstat:'for' '(' assignstat ';' cond ';' (ID OpRep| OpRep ID|assignstat) ')' ('{' stmt* '}'|stmt) ;
print:('printf'|'print') '(' (ID+|expr) ')' ';';
Comment:'//'.*? '\n' |'/*'.*? '*/';
WS:('\n'|' '|'\t'|'\r')+ {Skip();};