/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AnalizadorLexico;

import java.util.HashMap;

/**
 *
 * @author TV
 */
public class Tabladesimbolos {

    private HashMap hmtabla = new HashMap();

    public Tabladesimbolos() {
        // Estado 0: delimitadores.
        hmtabla.put(",", new Token(400, "Separador", 0));
        hmtabla.put(";", new Token(401, "Fin de sentencia", 0));
        hmtabla.put("{", new Token(402, "Agrupador inicial", 0));
        hmtabla.put("}", new Token(403, "Agrupador final", 0));
        hmtabla.put("(", new Token(404, "Inicio de condicion", 0));
        hmtabla.put(")", new Token(405, "Fin de condicion", 0));
        hmtabla.put("$", new Token(406, "Inicio/fin de texto", 0));

        hmtabla.put("[", new Token(407, "Inicio declaracion dimension", 0));
        hmtabla.put("]", new Token(408, "Fin declaracion dimension", 0));

        hmtabla.put(":", new Token(409, "Dos puntos", 0));
        // Estado 13: Punto/Llamada.
        hmtabla.put(".", new Token(410, "Referenciador", 13));

        // Estado 1: palabras reservadas.
        // hmtabla.put("final",new Token(100,"Constante",1));
        hmtabla.put("null",new Token(101,"Tipo de variable",1));
        hmtabla.put("static", new Token(102, "Tipo de variable", 1));
        //Esto lo agrego Enrique. Use a partir del Token 700
        hmtabla.put("abstract", new Token(701,"palabra reservada",1));
        hmtabla.put("assert", new Token(702,"palabra reservada",1));
        hmtabla.put("break", new Token(703,"fin de estructura",1));
        hmtabla.put("byte", new Token(704,"tipo de dato",1));
        hmtabla.put("catch", new Token(705,"palabra reservada",1));
        hmtabla.put("char", new Token(706,"tipo de dato",1));
        hmtabla.put("default", new Token(707,"estructura de control",1));
        hmtabla.put("double", new Token(708,"tipo de dato",1));
        hmtabla.put("import", new Token(709,"palabra reservada",1));
        hmtabla.put("main", new Token(710,"palabra reservada",1));
        hmtabla.put("new", new Token(711,"palabra reservada",1));
        

        // <<Tipodato>>
        hmtabla.put("boolean", new Token(103, "Tipo de variable", 1));
        hmtabla.put("int", new Token(104, "Tipo de variable", 1));
        hmtabla.put("real", new Token(105, "Tipo de variable", 1));
        hmtabla.put("caracter", new Token(106, "Tipo de variable", 1));
        hmtabla.put("string", new Token(107, "Tipo de variable", 1));

        // <<bool>>
        hmtabla.put("true", new Token(108, "Valor de verdad", 1));
        hmtabla.put("false", new Token(109, "Valor de verdad", 1));

        hmtabla.put("if", new Token(110, "Instruccion de control", 1));
        hmtabla.put("else", new Token(111, "Instruccion de control", 1));
        hmtabla.put("while", new Token(112, "Instruccion de control", 1));
        hmtabla.put("do", new Token(113, "Instruccion de control", 1));
        hmtabla.put("for", new Token(114, "Instruccion de control", 1));
        hmtabla.put("sea", new Token(117, "Instruccion de control", 1));
        hmtabla.put("case", new Token(118, "Instruccion de control", 1));
        hmtabla.put("defecto", new Token(130, "Instruccion de control", 1));

        hmtabla.put("class", new Token(119, "Declaracion de clase", 1));
        // <<Acceso>>
        hmtabla.put("public", new Token(120, "Control de acceso", 1));
        //hmtabla.put("privado", new Token(121, "Control de acceso", 1));
        hmtabla.put("private", new Token(999, "Control de acceso", 1));

        hmtabla.put("super",new Token(122,"Llamada a superclase",1));
        hmtabla.put("this",new Token(123,"Referencia a la instancia actual",1));

        hmtabla.put("extends", new Token(124, "Especificacion de superclase", 1));
        hmtabla.put("implements", new Token(125, "Espeficacion de interfaz", 1));
        hmtabla.put("interface",new Token(126,"Tipo especial de clase",1));
        hmtabla.put("return", new Token(127, "Sentencia de retorno", 1));

        //hmtabla.put("leer", new Token(128, "Entrada de texto", 1));
        //hmtabla.put("escribir", new Token(129, "Salida de texto", 1));

        // Estado 10: operadores simples.
        // <<opm1>>
        hmtabla.put("+", new Token(200, "suma", 10));
        hmtabla.put("-", new Token(201, "resta", 10));
        // <<opm2>>
        hmtabla.put("*", new Token(202, "producto", 10));
        hmtabla.put("/", new Token(203, "cociente", 10));
        hmtabla.put("%", new Token(208, "modulo", 10));

        hmtabla.put("=", new Token(205, "asignacion", 10));
        hmtabla.put("<", new Token(206, "menor que", 10));
        hmtabla.put(">", new Token(207, "mayor que", 10));

        hmtabla.put("!", new Token(209, "negacion", 10));

        // Estado 11: operadores dobles.
        hmtabla.put("**", new Token(300, "potencia", 11));

        // <<opbool2>>
        hmtabla.put("||", new Token(301, "o", 11));
        hmtabla.put("&&", new Token(302, "y", 11));
        hmtabla.put("^", new Token(204, "xor", 10));
        // hmtabla.put("^",new Token(204,"xor",10));
        // <<opbool1>>
        hmtabla.put(">=", new Token(303, "mayor o igual que", 11));
        hmtabla.put("<=", new Token(304, "menor o igual que", 11));
        hmtabla.put("==", new Token(305, "igual que", 11));
        hmtabla.put("!=", new Token(306, "decremento en", 11));

        hmtabla.put("++",new Token(307,"ingremento en 1",11));
        hmtabla.put("--",new Token(308,"decremento en 1",11));
        // <<opm3>>
        hmtabla.put("+=", new Token(309, "incremento en", 11));
        hmtabla.put("-=", new Token(310, "decremento en", 11));
        hmtabla.put("*=", new Token(311, "producto y asignacion", 11));
        hmtabla.put("/=", new Token(312, "cociente y asignacion", 11));

    }

    // Insertar.
    public void InsertarNumero(String s) {
        getHmtabla().put(s, new Token(500, "Numero", 2));
    }

    public void InsertarIdentificador(String s) {
        getHmtabla().put(s, new Token(600, "Identificador", 1));
    }

    public void InsertarComentario(String s) {
        getHmtabla().put(s, new Token(0, "Comentario", 18));
    }

    public void InsertarCaracter(String s) {
        getHmtabla().put(s, new Token(700, "Caracter", 9));
    }

    public void InsertarCadena(String s) {
        getHmtabla().put(s, new Token(800, "Cadena", 5));
    }

    public HashMap getHmtabla() {
        return hmtabla;
    }

    public void setHmtabla(HashMap hmtabla) {
        this.hmtabla = hmtabla;
    }

}
