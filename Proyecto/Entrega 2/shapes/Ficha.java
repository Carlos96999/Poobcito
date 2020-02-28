import java.awt.Color;

/**
 * Write a description of class Ficha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Ficha
{
    /**
     * Mover las fichas del tablero
     * @param notation (Cadena que describe el movimiento que tendrá la ficha)
     */
    abstract void move(String notation);
    
    /**
     * Realizar el mejor movimiento posible para la ficha
     */
    abstract void move();
    
    /**
     * Imprimir la representación dle tablero en forma de string
     * @return tablero (Devolver el tablero en forma de string como se visualiza en el problema de la maratón)
     */
    abstract String move3();
    
    /**
     * Hacer visible la ficha en el tablero
     */
    abstract void makeVisible();
    
    /**
     * Hacer invisible la ficha en el tablero
     */
    abstract void makeInvisible();
    
    /**
     * Cambiar el color de la ficha
     * @param color (Nombre en ingles del color que desea
     */
    abstract void changeColor(String color);
    
    /**
     * La posición que tendrá la ficha en el tablero
     * @param i (La fila donde se encuentra)
     * @param j (La columna donde se encuentra)
     */
    abstract void setPosicionTablero(int i, int j);
    
    /**
     * Obtenemos la posición de la ficha en el tablero
     */
    abstract int[] getPosicionTablero();
    
    /**
     * Le añadimos la nueva posición en Y
     * @param y (Posicion en y de la figura)
     */
    abstract void setPosicionY(int y);
    
    /**
     * Le añadimos la nueva posición en X
     * @param x (Posicion en x de la figura)
     */
    abstract void setPosicionX(int x);
    
    /**
     * Obtener la posición X de la figura
     */
    abstract int getPosicionX();
    
    /**
     * Obtener la posicion Y de la figura
     */
    abstract int getPosicionY();
}
