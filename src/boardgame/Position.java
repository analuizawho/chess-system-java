package boardgame;

public class Position {
    private Integer row;
    private Integer column;

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColum() {
        return column;
    }

    public void setColum(Integer colum) {
        this.column = colum;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
