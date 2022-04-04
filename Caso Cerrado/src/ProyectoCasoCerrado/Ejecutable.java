/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCasoCerrado;

/**
 *
 * @author emilse
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        //Direcciones
        Direccion dire1 = new Direccion(9,"Usaquen","Bogotá","Cundinamarca","Colombia");
        Direccion dire2 = new Direccion(25,"Zapato en mano","Valledupar","Cesar","Colombia");
        Direccion dire3 = new Direccion(35,"La Nevada","Valledupar","Cesar","Colombia");
        Direccion dire4 = new Direccion(74,"Kennedy","Bogota","Cundinamarca","Colombia");
        
        //Fechas
        Fecha fecha1 = new Fecha (9,5,2022);
        Fecha fecha2 = new Fecha (19,3,2022);
        
        
        //Detectives
        Detective dete1 = new Detective(12345,"Pablo","Rodriguez",3);
        Detective dete2 = new Detective(45896,"Mario","Tarazona",5);
        
        
        //Sospechosos
        Sospechoso sospe1 = new Sospechoso(4561237,"Darwin","billete",45,dire1,"Gruesa",1.85);
        Sospechoso sospe2 = new Sospechoso(7896521,"Raul","canoa",56,dire2,"Promedio",1.60);
        Sospechoso sospe3 = new Sospechoso(3569874,"Ever","Caremonja",32,dire3,"Delgada",1.90);
        Sospechoso sospe4 = new Sospechoso(6564563,"Jorge","Vickvaporub",41,dire4,"Delgada",1.52);
        
        Sospechoso[] caso1Sospe = {sospe1,sospe2};
        Sospechoso[] caso2Sospe = {sospe3,sospe4};
        
        //Bitacoras 
        Bitacora bita1 = new Bitacora(fecha1,"El caso se encuentra en proceso");
        Bitacora bita2 = new Bitacora(fecha2,"El caso se resolvió con éxito");
        
        
        //Casos
        Caso caso1 = new Caso (89562,"Investigación en una villa abandonada","A",dete1,"Villa Horror",caso1Sospe,bita1);
        
        Caso caso2 = new Caso (98562,"Descubrimiento de huesos en una fosa común","B",dete2,"Huesos hundidos",caso2Sospe,bita2);
        
        System.out.println(caso1);
        System.out.println(caso2);
        
    }
}
