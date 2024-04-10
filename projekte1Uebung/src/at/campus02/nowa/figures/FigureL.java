package at.campus02.nowa.figures;

public class FigureL extends Figure{
    public FigureL(char size) {
        super(size);
        if (size == 'S') {
            arraysize = 3;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (col == 0  ||  row == 2) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }
        }if (size=='M'){
            arraysize=6;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (col < 2  || row >4 ) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }
        }

        if(size == 'L'){
            arraysize=9;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if (col < 3  || row > 6) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }

        }
    }
    }

