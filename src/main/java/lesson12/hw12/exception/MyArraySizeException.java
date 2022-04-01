package lesson12.hw12.exception;

import static lesson12.hw12.Matrix.*;

public class MyArraySizeException extends RuntimeException {

    private final int wrongRows;
    private final int wrongColumns;

    public MyArraySizeException( int wrongColumns, int wrongRows, String message){
        super(String.format("%s. колличество строк в матрице ожидалось %d",
                ROWS,COLUMNS));
        this.wrongColumns = wrongColumns;
        this.wrongRows = wrongRows;
    }

    public int getWrongRows() {
        return wrongRows;
    }

    public int getWrongColumns() {
        return wrongColumns;
    }
}
