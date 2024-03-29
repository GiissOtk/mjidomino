package Dato;

import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;




public class ArchivoXml{

    private static String nombreArchivo = "src/Dato/ListaUsuario.xml";
    private static String nombreArchivoPartida = "src/Dato/ListaPartida.xml";
    private static String nombreArchivoFicha = "src/Dato/ListaFicha.xml";

    /**
     *
     * Método public static void leerArchivoXML(ListaUsuarios listaDeUsuarios): Este método
     * permite leer un archivo XML que contiene los datos de los usuarios a través de jdom
     */
    public static void leerArchivoXML(ListaUsuario listaDeUsuarios)
    {
        try
        {
            SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            Document doc = builder.build(nombreArchivo);

            /* Se obtiene la raíz del archivo (la etiqueta inicial) */
            Element raiz = doc.getRootElement();

            /* Se puede obtener el atributo de la raíz (de la etiqueta) */
            System.out.println(raiz.getAttributeValue("tipo"));

            /* Se obtienen todos los hijos cuya etiqueta esa "usuario"  */
            /* y se asignan esos hijos a un List                        */
            List listaUsuarios = raiz.getChildren("usuario");

            System.out.println("Formada por:" + listaUsuarios.size() + " usuarios");
            System.out.println("------------------");

            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = listaUsuarios.iterator();

            /* Se recorre el List */
            while (i.hasNext())
            {
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

                /* Se obtiene el nombre, apellido y cargo de cada una de las etiquetas  */
                /* hijas de usuario, es decir, nombre, apellido y cargo                 */
                Element nick = e.getChild("nick");
                Element clave = e.getChild("clave");
                Element nombre = e.getChild("nombre");
                Element apellido = e.getChild("apellido");
                Element fechanac = e.getChild("fechanac");
                Element avatar = e.getChild("avatar");


                /* Se crea un nodo nuevo con la información y se agrega a la lista de usuarios */
                Usuario elUsuario = new Usuario(nick.getText(),clave.getText(), nombre.getText(),apellido.getText(),fechanac.getText(),avatar.getText());

                listaDeUsuarios.AgregarElemento(elUsuario);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * Método public static void guardarArchivoXML(ListaUsuarios listaDeUsuarios): Este método
     * permite guardar la lista de usuarios en un archivo XML. El procesamiento se hace con jdom
     */
    public static void guardarArchivoXML(ListaUsuario listaDeUsuarios)
    {
        Usuario nodoAuxiliar;

        /* Se crea una raiz de la estructura */
        Element root = new Element("usuarios");

        /* Es posible agregar atributos a la estructura inicial */
        root.setAttribute("tipo","lista de usuarios");

        Iterator iterador = listaDeUsuarios.getIterator();

        while (iterador.hasNext())
        {
            /* Se crea la etiqueta "usuario" */
            Element usuarios = new Element("usuario");

            nodoAuxiliar = (Usuario) iterador.next();

            /* Se crean las etiquetas nombre, apellido y cargo */
            Element nick = new Element("nick");
            Element clave = new Element("clave");
            Element nombre = new Element("nombre");
            Element apellido = new Element("apellido");
            Element fechanac = new Element("fechanac");
            Element avatar = new Element("avatar");

            /* Se inicializa cada etiqueta con sus valores de la lista */
            nick.setText(nodoAuxiliar.getNickname());
            clave.setText(nodoAuxiliar.getClave());
            nombre.setText(nodoAuxiliar.getNombre());
            apellido.setText(nodoAuxiliar.getApellido());
            fechanac.setText(nodoAuxiliar.getFechanaci());
            avatar.setText(nodoAuxiliar.getAvatar());

            /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
            usuarios.addContent(nick);
            usuarios.addContent(clave);
            usuarios.addContent(nombre);
            usuarios.addContent(apellido);
            usuarios.addContent(fechanac);
            usuarios.addContent(avatar);

            /* Se añade el nuevo usuario a la estructura XML */
            root.addContent(usuarios);
        }

        /* Se crea un documento nuevo */
        Document doc = new Document(root);

        try
        {
            /* Se genera un flujo de salida de datos XML */
            XMLOutputter out = new XMLOutputter();

            /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
            FileOutputStream file = new FileOutputStream(nombreArchivo);

            /* Se manda el documento generado hacia el archivo XML */
            out.output(doc,file);

            /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
            file.flush();
            file.close();

            /* En este caso se manda a imprimir el archivo por la consola   */
            /* ESTE PROCESO NO ES OBLIGATORIO PARA PROCESAR EL XML          */
            out.output(doc,System.out);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    // Empieza La Carga de la Partida
public static void leerArchivoXML(ListaPartida listaDePartidas)
    {
        try
        {
            SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            Document doc = builder.build(nombreArchivoPartida);

            /* Se obtiene la raíz del archivo (la etiqueta inicial) */
            Element raiz = doc.getRootElement();

            /* Se puede obtener el atributo de la raíz (de la etiqueta) */
            System.out.println(raiz.getAttributeValue("tipo"));

            /* Se obtienen todos los hijos cuya etiqueta esa "usuario"  */
            /* y se asignan esos hijos a un List                        */
            List listaPartida= raiz.getChildren("partida");

            System.out.println("Formada por:" + listaPartida.size() + " Partidas");
            System.out.println("------------------");

            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = listaPartida.iterator();

            /* Se recorre el List */
            while (i.hasNext())
            {
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

                /* Se obtiene el nombre, apellido y cargo de cada una de las etiquetas  */
                /* hijas de usuario, es decir, nombre, apellido y cargo                 */
                Element nick = e.getChild("Usuario");
                Element ID = e.getChild("ID");
                Element fechaactual = e.getChild("fechaacual");
                Element fechainicio = e.getChild("fechainicio");
                 /* Se crea un nodo nuevo con la información y se agrega a la lista de usuarios */
                Partida laPartida = new Partida(nick.getText(), ID.getContentSize(),fechaactual.getText(),fechainicio.getText());
                listaDePartidas.AgregarElemento(laPartida);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void guardarArchivoXML(ListaPartida listaDePartidas)
    {
        Partida nodoAuxiliar;

        /* Se crea una raiz de la estructura */
        Element root = new Element("partidas");

        /* Es posible agregar atributos a la estructura inicial */
        root.setAttribute("tipo","lista de partidas");

        Iterator iterador = listaDePartidas.getIterator();

        while (iterador.hasNext())
        {
            /* Se crea la etiqueta "usuario" */
            Element partidas = new Element("partida");

            nodoAuxiliar = (Partida) iterador.next();

            /* Se crean las etiquetas nombre, apellido y cargo */
            Element nick = new Element("nick");
            Element ID = new Element("ID");
            Element fechainicio = new Element("fechainicio");

            /* Se inicializa cada etiqueta con sus valores de la lista */
            nick.setText(nodoAuxiliar.getNickname());
            ID.setText(Integer.toString(nodoAuxiliar.getID()));
            fechainicio.setText(nodoAuxiliar.getFechainicio());


            /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
            partidas.addContent(nick);
            partidas.addContent(ID);
            partidas.addContent(fechainicio);


            /* Se añade el nuevo usuario a la estructura XML */
            root.addContent(partidas);
        }

        /* Se crea un documento nuevo */
        Document doc = new Document(root);

        try
        {
            /* Se genera un flujo de salida de datos XML */
            XMLOutputter out = new XMLOutputter();

            /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
            FileOutputStream file = new FileOutputStream(nombreArchivoPartida);

            /* Se manda el documento generado hacia el archivo XML */
            out.output(doc,file);

            /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
            file.flush();
            file.close();

            /* En este caso se manda a imprimir el archivo por la consola   */
            /* ESTE PROCESO NO ES OBLIGATORIO PARA PROCESAR EL XML          */
            out.output(doc,System.out);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
//    public static void guardarArchivoXML(ListaFicha listaDeFichaPote,ListaFicha listaDeFichaServidor,ListaFicha listaDeFichaUsuario,int IDgen)
//    {
//        Ficha nodoAuxiliarPote;
//        Ficha nodoAuxiliarUsuario;
//        Ficha nodoAuxiliarServidor;
//
//        /* Se crea una raiz de la estructura */
//        Element root = new Element("fichas");
//
//        /* Es posible agregar atributos a la estructura inicial */
//        root.setAttribute("tipo","lista de fichas");
//
//        Iterator iteradorpote = listaDeFichaPote.getIterator();
//        Iterator iteradorusuario = listaDeFichaUsuario.getIterator();
//        Iterator iteradorservidor = listaDeFichaServidor.getIterator();
//        Element ID = new Element("ID");
//        ID.setText(Integer.toString(IDgen));
//
//        Element fichaspote = new Element("fichapote");
//        while (iteradorpote.hasNext())
//        {
//            /* Se crea la etiqueta "usuario" */
//
//
//            nodoAuxiliarPote = (Ficha) iteradorpote.next();
//
//            /* Se crean las etiquetas nombre, apellido y cargo */
//            Element X = new Element("X");
//            Element Y = new Element("Y");
//
//
//            /* Se inicializa cada etiqueta con sus valores de la lista */
//            X.setText(Integer.toString(nodoAuxiliarPote.getX()));
//            Y.setText(Integer.toString(nodoAuxiliarPote.getY()));
//             /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
//            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
//            fichaspote.addContent(X);
//            fichaspote.addContent(Y);
//             /* Se añade el nuevo usuario a la estructura XML */
//
//        }
//                root.addContent(ID);
//                root.addContent(fichaspote);
//
//        Element fichasusuario = new Element("fichausuario");
//        while (iteradorusuario.hasNext())
//        {
//            /* Se crea la etiqueta "usuario" */
//
//
//            nodoAuxiliarUsuario = (Ficha) iteradorusuario.next();
//
//            /* Se crean las etiquetas nombre, apellido y cargo */
//            Element X = new Element("X");
//            Element Y = new Element("Y");
//
//
//            /* Se inicializa cada etiqueta con sus valores de la lista */
//            X.setText(Integer.toString(nodoAuxiliarUsuario.getX()));
//            Y.setText(Integer.toString(nodoAuxiliarUsuario.getY()));
//             /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
//            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
//            fichasusuario.addContent(X);
//            fichasusuario.addContent(Y);
//             /* Se añade el nuevo usuario a la estructura XML */
//
//        }
//   root.addContent(fichasusuario);
//    Element fichasservidor = new Element("fichaservidor");
//        while (iteradorservidor.hasNext())
//        {
//            /* Se crea la etiqueta "usuario" */
//
//
//            nodoAuxiliarServidor = (Ficha) iteradorservidor.next();
//
//            /* Se crean las etiquetas nombre, apellido y cargo */
//            Element X = new Element("X");
//            Element Y = new Element("Y");
//
//
//            /* Se inicializa cada etiqueta con sus valores de la lista */
//            X.setText(Integer.toString(nodoAuxiliarServidor.getX()));
//            Y.setText(Integer.toString(nodoAuxiliarServidor.getY()));
//             /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
//            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
//            fichasservidor.addContent(X);
//            fichasservidor.addContent(Y);
//             /* Se añade el nuevo usuario a la estructura XML */
//
//        }
//                root.addContent(fichasservidor);
//
//        /* Se crea un documento nuevo */
//        Document doc = new Document(root);
//
//        try
//        {
//            /* Se genera un flujo de salida de datos XML */
//            XMLOutputter out = new XMLOutputter();
//
//            /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
//            FileOutputStream file = new FileOutputStream(nombreArchivoFicha);
//
//            /* Se manda el documento generado hacia el archivo XML */
//            out.output(doc,file);
//
//            /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
//            file.flush();
//            file.close();
//
//            /* En este caso se manda a imprimir el archivo por la consola   */
//            /* ESTE PROCESO NO ES OBLIGATORIO PARA PROCESAR EL XML          */
//            out.output(doc,System.out);
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }

    public static void guardarArchivoXML(ListaPartida listaDePartidas, boolean valor)
    {
        Ficha nodoAuxiliarPote;
        Ficha nodoAuxiliarUsuario;
        Ficha nodoAuxiliarServidor;
        Partida partidaActual;
        Ficha fichaActual;

        /* Se crea una raiz de la estructura */
        Element root = new Element("fichas");

        /* Es posible agregar atributos a la estructura inicial */
        root.setAttribute("tipo","lista de fichas");

        Iterator iteradorPartida = listaDePartidas.getIterator();
        Iterator iteradorFichaUsuario;
        Iterator iteradorFichaPote;
        Iterator iteradorFichaServidor;

        Element ID;
        Element fichaPote;
        Element fichaUsuario;
        Element fichaServidor;
        Element fichaX;
        Element fichaY;


        while (iteradorPartida.hasNext())
        {
            ID = new Element("ID");
            fichaPote = new Element("fichapote");
            fichaUsuario = new Element("fichausuario");
            fichaServidor = new Element("fichaservidor");

            partidaActual = (Partida) iteradorPartida.next();

            ID.setAttribute("id", Integer.toString(partidaActual.getID()));

            iteradorFichaPote = partidaActual.getFichapote().getIterator();

            while (iteradorFichaPote.hasNext())
            {
                fichaX = new Element("X");
                fichaY = new Element("Y");
                fichaActual = (Ficha) iteradorFichaPote.next();
                fichaX.setText(Integer.toString(fichaActual.getX()));
                fichaY.setText(Integer.toString(fichaActual.getY()));
                fichaPote.addContent(fichaX);
                fichaPote.addContent(fichaY);
            }

            ID.addContent(fichaPote);

            iteradorFichaUsuario = partidaActual.getFichausuario().getIterator();

            while (iteradorFichaUsuario.hasNext())
            {
                fichaX = new Element("X");
                fichaY = new Element("Y");
                fichaActual = (Ficha) iteradorFichaUsuario.next();
                fichaX.setText(Integer.toString(fichaActual.getX()));
                fichaY.setText(Integer.toString(fichaActual.getY()));
                fichaUsuario.addContent(fichaX);
                fichaUsuario.addContent(fichaY);
            }

            ID.addContent(fichaUsuario);

            iteradorFichaServidor = partidaActual.getFichaservidor().getIterator();

            while (iteradorFichaServidor.hasNext())
            {
                fichaX = new Element("X");
                fichaY = new Element("Y");
                fichaActual = (Ficha) iteradorFichaServidor.next();
                fichaX.setText(Integer.toString(fichaActual.getX()));
                fichaY.setText(Integer.toString(fichaActual.getY()));
                fichaServidor.addContent(fichaX);
                fichaServidor.addContent(fichaY);
            }

            ID.addContent(fichaServidor);

            root.addContent(ID);
        }
        
        /* Se crea un documento nuevo */
        Document doc = new Document(root);

        try
        {
            /* Se genera un flujo de salida de datos XML */
            XMLOutputter out = new XMLOutputter();

            /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
            FileOutputStream file = new FileOutputStream(nombreArchivoFicha);

            /* Se manda el documento generado hacia el archivo XML */
            out.output(doc,file);

            /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
            file.flush();
            file.close();

            /* En este caso se manda a imprimir el archivo por la consola   */
            /* ESTE PROCESO NO ES OBLIGATORIO PARA PROCESAR EL XML          */
            out.output(doc,System.out);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
