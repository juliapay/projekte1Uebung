package at.campus02.nowa.figures;

public class FigureMinus extends Figure {
    public FigureMinus(char size) {
        super(size);


        if (size == 'S') {
            arraysize = 3;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (row == 1) {
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
                    if (row > 1 && 4 > row) {
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
                    if (row > 2 && 6 > row) {
                        symbol[col][row] = 'X';
                        System.out.print(" ");
                    } else {
                        symbol[col][row] = ' ';
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}
