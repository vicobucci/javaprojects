/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senac.rj.classes;

/*
 * esta classe representa um Ponto
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        super();
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
