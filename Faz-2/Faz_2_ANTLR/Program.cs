
using Antlr.Runtime;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Faz_2_ANTLR
{
    class Program
    {
        static void Main(string[] args)
        {

            Faz_1Lexer lexer = new Faz_1Lexer(new AntlrFileStream("test4.txt"));
            Antlr4.Runtime.CommonTokenStream tokens = new Antlr4.Runtime.CommonTokenStream(lexer);
            Faz_1Parser parser = new Faz_1Parser(tokens);


            try
            {

                IParseTree tree = parser.script();
                Console.WriteLine(tree.ToStringTree(parser));
                
                //foreach (var item in parser.TokenNames)
                //{
                //  Console.WriteLine(item);
                //}
            }
            catch (Antlr4.Runtime.RecognitionException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadLine();


        }
    }
}
