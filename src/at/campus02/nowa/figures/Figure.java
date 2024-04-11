package at.campus02.nowa.figures;

public abstract class Figure {
    protected char size;
    protected int arraysize;
    protected char[][] symbol;

    public Figure(char size) {
        this.size = size;
        setArraysize(arraysize);
        symbol = new char[arraysize][arraysize];
    }


    public String toString() {

            StringBuilder sb = new StringBuilder();
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    sb.append(symbol[col][row]);
                }
                sb.append('\n');
            }
            return sb.toString();
    }
    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }
}

