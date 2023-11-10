/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

/**
 *
 * @author Haisuri
 */
public class Players {
    private String _name;
    private int _number;
    private int _batch;
    public Players() {}
    public Players(String name, int number, int batch) {
        _name = name;
        _number = number;
        _batch = batch;
    }
    public String getName() {
        return _name;
    }
    public int getNumber() {
        return _number;
    }
    public int getBatch() {
        return _batch;
    }
    public void changeName(String name) {
        _name = name;
    }
    public void changeNumber(int number) {
        _number = number;
    }
    public void changeBatch(int batch) {
        _batch = batch;
    }
    
}
