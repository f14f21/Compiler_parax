using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyProject
{
    class Program
    {
        static void Main(string[] args)
        {
            cLexer lexer = new cLexer(new AntlrFileStream("test2.c"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            cParser parser = new cParser(tokens);
            try
            {

                parser.prog();
            }
            catch (RecognitionException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadLine();
        }
    }
}
