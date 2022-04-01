package lesson12.hw12;

import lesson12.hw12.exception.MyArrayDataException;
import lesson12.hw12.exception.MyArraySizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {

    public static final int ROWS = 4;
    public static final int COLUMNS = 4;

    private static final List<String> SYMBOLS = List.of("25", "45", "16", "78", "3",
                                                        "0", "8", "65","1", "12", "10", "90", "67","89",
                                                        "-78","56");

    private List<List<String>> values; //privat String [][] values;

    public Matrix(int n, int m){
        if (n != ROWS || m !=COLUMNS){
            throw new MyArraySizeException(n, m, "произошла ошибка во время инициализации");
        }
        this.values = new ArrayList<>(n);
        fillUp(n, m);

    }

    public void fillUp(int n, int m){
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {
                int randomIndex = new Random().nextInt(SYMBOLS.size() - 1);
                lines.add(SYMBOLS.get(randomIndex));

            }
        }
    }
    public int sum(){
        int result = 0;
        for (int i = 0; i < this.values.size() ; i++){
            List<String> row = this.values.get(i);
            for (int j = 0; j < row.size(); j++){
                String value = row.get(j);
                if (!value.matches("\\d+")){
                    throw new MyArrayDataException(i, j, "некорректное значение в матрице");
                }
                result += Integer.parseInt(value);
            }
        }
        return result;
    }


    public void print(){
       for (List<String> lines : this.values){
           System.out.println(lines);
       }
    }
}
