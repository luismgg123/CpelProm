package usil.cpel.cpelprom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP-LM on 04/11/2015.
 */
public class ListaContenido {
    /**
     * Donde se guardan las entradas de la lista.
     */
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    /**
     * Donde se asigna el identificador a cada entrada de la lista
     */
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    /**
     * Creamos estáticamente las entradas
     */
    static {
        aniadirEntrada(new Lista_entrada("0", "Administración de Recursos Humanos", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("1","Análisis e Interpretación de Estados Financieros", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("2", "Aplicaciones de Gestión Empresarial", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("3","Auditoría Financiera", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("4", "Auditoría Operativa", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("5",  "Banca", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("6", "Base de Datos", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("7", "Blended Marketing", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("8", "Business Intelligence", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("9", "Business Process Management", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("10", "Comercio Internacional & Aduanas", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("11", "Comercio y Finanzas Internacionales", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("12", "Comportamiento De Compra", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("13", "Comportamiento Organizacional", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("14", "Comunicación Oral Y Escrita", "Maguiño Veneros, Miguel Hugo", "mmaguino@usil.edu.pe", "3744"));
        aniadirEntrada(new Lista_entrada("15", "Comunicaciones Integradas I", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("16", "Comunicaciones Integradas Ii", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("17", "Consultoría Y Auditoría Informática", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("18", "Contabilidad Avanzada I", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("19", "Contabilidad Avanzada II", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("20", "Contabilidad De Costos", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("21", "Contabilidad De Costos Avanzada", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("22", "Contabilidad General", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("23", "Contabilidad Gerencial", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("24", "Contabilidad Intermedia", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("25", "Derecho Comercial Internacional", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("26", "Derecho Empresarial Y Sociedades", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("27", "Derecho Laboral", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("28", "Derecho Tributario", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("29", "Desarrollo Humano", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("30", "Direcc. Y Planemiento Estrat. En Marketing", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("31", "Diseño Organizacional Y De Procesos", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("32", "Economía General", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("33", "Economía Internacional", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("34", "Empresariado", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("35", "English For Business III", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("36", "English I", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("37", "English II", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("38", "English III", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("39", "English IV", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("40", "English V", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("41", "English VI", "Cruz Barrera Zoila", "zcruz@usil.edu.pe", "3219"));
        aniadirEntrada(new Lista_entrada("42", "Estadística Aplicada", "Montesinos Ruiz, Luis Felipe", "lmontesinos@usil.edu.pe", "3744"));
        aniadirEntrada(new Lista_entrada("43", "Estadística General", "Montesinos Ruiz, Luis Felipe", "lmontesinos@usil.edu.pe", "3744"));
        aniadirEntrada(new Lista_entrada("44", "Estrategia De Distribución", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("45", "Estrategia De Producto", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("46", "Ética Y Filosofía", "Gorriti Gutierrez, Luis Carlos", "lgorriti@usil.edu.pe", "3744"));
        aniadirEntrada(new Lista_entrada("47", "Evaluación De Proyectos", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("48", "Finanzas", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("49", "Finanzas Avanzadas", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("50", "Física General", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("51", "Físico Química", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("52", "Fundamentos De Redes Y Comunicaciones", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("53", "Fundamentos Del Desarrollo De Software", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("54", "Gerencia", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("55", "Gerencia Comercial", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("56", "Gerencia De Operaciones Y Logistica", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("57", "Gerencia De Proyectos", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("58", "Gerencia De Ti", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("59", "Gerencia Estrategica", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("60", "Graficación Y Dibujo Técnico", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("61", "Ingeniería De Métodos", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("62", "Ingeniería De Procesos", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("63", "Introducción A Los Negocios", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("64", "Inversiones", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("65", "Investigación De Mercados", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("66", "Investigación De Mercados Avanzada", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("67", "Investigación De Operaciones", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("68", "Knowledge Management", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("69", "Logistica Y Dfi", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("70", "Marketing", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("71", "Marketing De Servicios Y Servicio Al Cliente", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("72", "Marketing Empresarial", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("73", "Marketing Global", "Perez Aranguri, Luis", "aperez@usil.edu.pe", "3809"));
        aniadirEntrada(new Lista_entrada("74", "Matematica Financiera", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("75", "Matemática I", "Reyna Medina, Jexy Arturo", "jreyna@usil.edu.pe", "3743"));
        aniadirEntrada(new Lista_entrada("76", "Matemática II", "Reyna Medina, Jexy Arturo", "jreyna@usil.edu.pe", "3743"));
        aniadirEntrada(new Lista_entrada("77", "Mecánica", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("78", "Mercados E Instituciones Financieras", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("79", "Metodología De La Investigación", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("80", "Negociaciones", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("81", "Negocios Internacionales", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("82", "Operaciones Unitarias", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("83", "Planeamiento Estrategico", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("84", "Planeamiento Tributario", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("85", "Planeamiento Y Control De Operaciones", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("86", "Política De Precios", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("87", "Principios De La Administración", "Andrade Diaz, Elba Maria", "eandrade@usil.edu.pe", "3811"));
        aniadirEntrada(new Lista_entrada("88", "Procesos De Manufactura", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("89", "Proyecto Integrador", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("90", "Proyectos De Ti", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("91", "Química General", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("92", "Realidad Económica", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("93", "Realidad Nacional", "Gorriti Gutierrez, Luis Carlos", "lgorriti@usil.edu.pe", "3744"));
        aniadirEntrada(new Lista_entrada("94", "Retailing", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("95", "Seguridad, Higiene Y Mantenimiento Industrial", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("96", "Seminario De Tesis", "Vasquez Pajuelo, Lida", "lvasquezp@usil.edu.pe", "3384"));
        aniadirEntrada(new Lista_entrada("97", "Simulación De Sistemas", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("98", "Simulacro De Procesos Industriales", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("99", "Sistemas De Informacion Contable", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("100", "Sistemas Integrados De Informacion Gerencial", "Yzquierdo Marin, Adner", "ayzquierdo@usil.edu.pe", "3802"));
        aniadirEntrada(new Lista_entrada("101", "Sociedad, Estado Y Empresa", "Gorriti Gutierrez, Luis Carlos", "lgorriti@usil.edu.pe", "3744"));
        aniadirEntrada(new Lista_entrada("102", "Software Integrado De Gestión", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("103", "Topicos De Desar. De Soft. Orientado A Objetos", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("104", "Tópicos De Desarrollo De Soft. Orientado A Objetos", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("105", "Tópicos De Ingeniería De Software", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("106", "Topicos De Seguridad Informatica", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("107", "Tópicos De Teleproceso", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("108", "Topicos En Derecho Empresarial", "Solano Amoros, Alan", "asolano@usil.edu.pe", "3804"));
        aniadirEntrada(new Lista_entrada("109", "Total Quality Management", "Velasquez Nuñez, Marco", "mvelasquez@usil.edu.pe", "3810"));
        aniadirEntrada(new Lista_entrada("110", "Transporte Internacional Y Local", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));
        aniadirEntrada(new Lista_entrada("111", "Valoracion En Aduanas", "Nuñez Escarcena, Luis Pool", "lnunez@usil.edu.pe", "3803"));



    }

    /** Añade una entrada a la lista
     * @param entrada Elemento que añadimos a la lista
     */
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    /**
     * Representa una entrada del contenido de la lista
     */
    public static class Lista_entrada {
        public String id;
        public String textoEncima;
        public String textoDebajo;
        public String txtcorreo;
        public String txtanexo;

        public Lista_entrada (String id, String textoEncima, String textoDebajo, String correo, String anexo) {
            this.id = id;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
            this.txtcorreo = correo;
            this.txtanexo = anexo;

        }
    }
}