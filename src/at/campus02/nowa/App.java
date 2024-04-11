package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private char figureNr;
    private int figureSize;
    private Figure figure;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    //die Gameloop
    public void Run() {
        initialize();
        printState();

        while (!exit) {
            readUserInput();
            updateState();
            if (exit) {
                break;
            }else {
                printState();
            }
        }
    }

    private void initialize() {
        //TODO: Initialisierungen hiervghgh durchführen
    }


    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();
    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten
        if(!exit) {
        System.out.println("Welche Groesse wollen sie haben 1/2/3");
        char inputSize=input.next().charAt(0);
            switch (figureNr) {
                case '1':
                    if (inputSize == '1') {
                        figure = new FigureH('S');
                        break;
                    } else if (inputSize == '2') {
                        figure = new FigureH('M');
                        break;
                    } else if (inputSize == 3) {
                        figure = new FigureH('L');
                        break;
                    }

                case '2':
                    if (inputSize == '1') {
                        figure = new FigureL('S');
                        break;
                    } else if (inputSize == '2') {
                        figure = new FigureL('M');
                        break;
                    } else if (inputSize == '3') {
                        figure = new FigureL('L');
                        break;
                    }
                case '3':
                    if (inputSize == '1') {
                        figure = new FigureO('S');
                        break;
                    } else if (inputSize == '2') {
                        figure = new FigureO('M');
                        break;
                    } else if (inputSize == '3') {
                        figure = new FigureO('L');
                        break;
                    }
                case '4':
                    if (inputSize == '1') {
                        figure = new FigureO2('S');
                        break;
                    } else if (inputSize == '2') {
                        figure = new FigureO2('M');
                        break;
                    } else if (inputSize == '3') {
                        figure = new FigureO2('L');
                        break;
                    }
                case '5':
                    if (inputSize == '1') {
                        figure = new FigureI('S');
                        break;
                    } else if (inputSize == '2') {
                        figure = new FigureI('M');
                        break;
                    } else if (inputSize == '3') {
                        figure = new FigureI('L');
                        break;
                    }
                case '6':
                    if (inputSize == '1') {
                        figure = new FigureMinus('S');
                        break;
                    } else if (inputSize == '2') {
                        figure = new FigureMinus('M');
                        break;
                    } else if (inputSize == '3') {
                        figure = new FigureMinus('L');
                        break;
                    }

                default:
                    break;
            }
        }
    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands
        if (figure != null) {
            output.println(figure);
        }
    }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Welche Grafik möchten Sie anzeigen (1-6)");
            output.println("Drücken sie 7 für Exit");
            figureNr = input.next().charAt(0);
            if (figureNr=='7'){
                exit=true;
                break;
            }
            if (figureNr != '1' && figureNr != '2'&&figureNr != '3'&&figureNr != '4'&&figureNr != '5'&&figureNr != '6'&&figureNr != '7') {
                output.println("Dies ist keine gültige Grafik!");

            } else{
                break;
            }
        } while (true);
    }
}
