package lesson12.hw12.exception;

public class MyArrayDataException extends NumberFormatException {

    private final int wrongRow;

    private final int wrongColumn;

    public MyArrayDataException(int row, int column, String message) {
        super(String.format(". Ошибка произошла на строке %d и строке %d",row, column));
        this.wrongColumn = column;
        this.wrongRow = row;

    }

    public int getWrongRow() {
        return wrongRow;
    }

    public int getWrongColumn() {
        return wrongColumn;
    }
}
