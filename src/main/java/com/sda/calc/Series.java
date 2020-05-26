package com.sda.calc;

public interface Series {
    public int getNext();
//    Metoda zwraca następną liczbę w ciągu.
    public void reset();
//    Metoda resetuje szereg do stanu początkowego.
    public void setStart(int x);
//    Metoda ustawia stan początkowy dla ciągu.
}
