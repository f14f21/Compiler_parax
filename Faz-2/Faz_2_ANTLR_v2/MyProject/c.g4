/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar c;

@lexer::namespace{MyProject}
@parser::namespace{MyProject}


@header
{
	using System;
	using System.Collections;
}
@members
{
	Hashtable symbolTable=new Hashtable();
	Hashtable symbolTable2=new Hashtable();
}




prog: (stat)+ ;

// Each stat  can have 3 alternative 
// 1- expr (e.g. 2876/4)
// 2- ID = expr (e.g. a=2*4)
// 3-BLANK {System.Console.WriteLine($expr.text + " --> " + $NEWLINE.text);}
stat 	:	expr NEWLINE {System.Console.WriteLine($expr.text + " = " +  $expr.v);}
			| ID '=' expr NEWLINE 
			| NEWLINE
			;
// Each expr can right recursive with 2 alternative {$value=Int32.Parse($a.text);}
// e.g. expr=texpr + expr + expr +expr – expr ….
 expr	returns [int v]
			:texpr {$v=$texpr.value;}
			
				(('+' b1=expr {$v+=$b1.v;} | '-' b2=expr {$v-=$b2.v;}))*      	;

// Each texpr can generate 2 alternative	
texpr returns [int value]  	:	a=atom {$value=Int32.Parse($a.text);}

			(('*' b=texpr {$value*=Int32.Parse($b.text);}|'/' c=texpr {$value/=Int32.Parse($c.text);}))* 	;

// Each atom consist of 3 lexer rule	
atom 	:                 INT 
                                   | ID //variable reference
         		| '(' expr ')'
		;
// Lexer Rules
ID		:	 ('a'..'z' |'A'..'Z' )+ ;
INT 	: 	'0'..'9' + ;
NEWLINE  :	'\r' ? '\n' ? ';' ;
WS		: 	(' ' |'\t' |'\n' |'\r' )+ {Skip();} ;




//script:'void ' 'main' '('')' '{' stmt* '}';
//stmt:ifstat|forstat|whilestat|assignstat ';'|expr ';'|define|print|Comment;


////stmt:ifstat|forstat|whilestat|assignstat|expr ';'|define|Comment;
//assignstat:ID '=' expr 
//{System.Console.WriteLine($ID.text + " = " + $expr.text + ";");};
//ifstat:'if' '(' cond ')' (ifstat|'{' stmt* '}' (elsepart|expr) |elsepart);
//elsepart:'else' (ifstat|'{' stmt* '}'|expr*);
//cond:expr Relation expr;
//Relation:'<'|'<='|'>'|'>='|'=='|'!='|'%';
//OpRep:'++'|'--';

//Relop:'+'|'-'|'*'|'/';
//expr:term restexpr|term OpRep|term|restexpr|'(' expr ')'| '\'' expr '\'';

//term:ID|Num;
//ID:Letter(Letter|Num|'_')*;
//Letter:('a'..'z')|('A'..'Z');
//Num:('0'..'9')+;
//restexpr:Relop expr |Relation expr|Relop;
//whilestat:'while' '(' cond ')' '{' stmt* '}';
//define:'int ' ID (',' ID)*? ';'|'char ' ID(',' ID)*? ';';
//forstat:'for' '(' assignstat ';' cond ';' (ID OpRep| OpRep ID|assignstat) ')' ('{' stmt* '}'|stmt) ;
//print:('printf'|'print') '(' (ID+|expr) ')' ';';
//Comment:'//'.*? '\n' |'/*'.*? '*/';
//WS:('\n'|' '|'\t'|'\r')+ {Skip();};




