/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;
import java.util.*;
/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Partida {

private String nickname;
private int ID;
private String fechaactual;
private String fechainicio;
private ListaFicha fichaservidor;
private ListaFicha fichausuario;
private ListaFicha fichapote;




    public Partida(String nickname, int ID, String fechaactual, String fechainicio, ListaFicha fichaservidor, ListaFicha fichausuario, ListaFicha fichapote) {
        this.nickname = nickname;
        this.ID = ID;
        this.fechaactual = fechaactual;
        this.fechainicio = fechainicio;
        this.fichaservidor = fichaservidor;
        this.fichausuario = fichausuario;
        this.fichapote = fichapote;
    }
// Constructor de Cargar Partida
    public Partida(String nickname,int ID, String fechaactual, String fechainicio) {
        this.nickname = nickname;
        this.ID = ID;
        this.fechaactual = fechaactual;
        this.fechainicio = fechainicio;
       }
    //COnstructor de Crear  yGuardar
        public Partida(String nickname,int ID,String fechainicio, ListaFicha fichaservidor, ListaFicha fichausuario, ListaFicha fichapote) {
        this.nickname = nickname;
        this.ID = ID;
        this.fechainicio=fechainicio;
        this.fichapote=fichapote;
        this.fichausuario=fichausuario;
        this.fichaservidor=fichaservidor;
        }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFechaactual() {
        return fechaactual;
    }

    public void setFechaactual(String fechaactual) {
        this.fechaactual = fechaactual;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public ListaFicha getFichapote() {
        return fichapote;
    }

    public void setFichapote(ListaFicha fichapote) {
        this.fichapote = fichapote;
    }

    public ListaFicha getFichaservidor() {
        return fichaservidor;
    }

    public void setFichaservidor(ListaFicha fichaservidor) {
        this.fichaservidor = fichaservidor;
    }

    public ListaFicha getFichausuario() {
        return fichausuario;
    }

    public void setFichausuario(ListaFicha fichausuario) {
        this.fichausuario = fichausuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
