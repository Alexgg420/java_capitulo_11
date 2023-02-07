package Ejercicios;

import java.util.ArrayList;

public class Primos{
    private ArrayList<Integer> primo = new ArrayList<Integer>();
    private int min;
    private int max;

    public Primos(int min, int max){
        this.min = min;
        this.max = max;
        this.init();
    }

    public void init(){
        for (int num = this.min; num <= this.max; num++){
            boolean esPrimo = true;
            for (int i = 2; i <= (num / 2); i++){
                if (num % i == 0){
                    esPrimo = false;
                }
            }
            if (esPrimo){
                addPrimo(num);
            }
        }
    }

    public void addPrimo(int num){
        this.primo.add(num);
    }

    @Override
    public String toString(){
        String numeros = "";
        for (int num : primo){
            numeros = numeros + "\n" + num;
        }
        return numeros;
    }
}