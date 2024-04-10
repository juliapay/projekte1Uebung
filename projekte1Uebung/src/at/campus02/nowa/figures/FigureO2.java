package at.campus02.nowa.figures;

public class FigureO2 extends Figure{
    public FigureO2(char size) {
        super(size);
        if (size == 'S') {
            arraysize = 3;
            symbol = new char[arraysize][arraysize];
            for (int row = 0; row < arraysize; row++) {
                for (int col = 0; col < arraysize; col++) {
                    if ((row == 0&&col==1)  ||( row==1&&col==0)||(row==1&&col==2)|| ( row==2&&col==1)) {
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
                    if ((row<1&&(col==2||col==3))||(row>0&&row<5&&(col==0||col==5))||(row>4&&(col==2||col==3))) {
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
                    if ((row<1&&(col==3||col==4||col==5))||(row>0&&row<8&&(col==1||col==7))||(row>7&&(col==3||col==4||col==5))) {
                        symbol[col][row] = 'X';
                    } else {
                        symbol[col][row] = ' ';
                    }
                }
            }
        }
    }
}
