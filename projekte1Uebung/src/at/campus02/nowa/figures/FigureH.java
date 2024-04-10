package at.campus02.nowa.figures;

public class FigureH extends Figure {

    public FigureH(char size) {
        super(size);

        if (size == 'S') {
            arraysize = 3;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (col == 0 || col == 2 || (col == 1 && row == 1)) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }
        }
        if (size == 'M') {
            arraysize = 6;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (col < 2 || 3 < col || row == 2 || row == 3) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }
        }
        if (size == 'L') {
            arraysize = 9;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (col < 3 || 5 < col || row > 2 && row < 6) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }
        }

    }
}
