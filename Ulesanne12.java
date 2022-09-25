package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Ulesanne12 extends Application {
    @Override

    public void start(Stage primaryStage) {

        ArrayList<Double> numbrid = new ArrayList<>();
        // operator ei saa millegi päesat lihtsalt String olla vaid peab ArrayList olema
        ArrayList<String> operator = new ArrayList<>();
        ArrayList<Boolean> calculated = new ArrayList<>(Arrays.asList(false));


        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 350, 500);

        pane.setPadding(new Insets(8, 8, 8, 8));
        pane.setVgap(5);
        pane.setHgap(5);

        ///////////////
        Text tehe = new Text("");
        pane.add(tehe, 0, 0, 4, 1);
        tehe.setWrappingWidth(250);
        tehe.setTextAlignment(TextAlignment.RIGHT);
        tehe.setStyle("-fx-font: 10 arial;");

        Text arv = new Text("0");
        pane.add(arv, 0, 1, 4, 1);
        //pane.add(arv, 0, 0);
        arv.setWrappingWidth(250);
        arv.setTextAlignment(TextAlignment.RIGHT);
            arv.setStyle("-fx-font: 60 arial;");

        /////////////////

        // clear all "C"
        Button squareButtonC = new Button("C");
        pane.add(squareButtonC, 1, 2);
        squareButtonC.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButtonC.setOnAction(actionEvent -> {
            numbrid.removeAll(numbrid);
            operator.removeAll(operator);
            arv.setText("0");
            tehe.setText("");

            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        // delete
        Button squareButtonDel = new Button("<-");
        pane.add(squareButtonDel, 2, 2);
        squareButtonDel.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;" +
                "-fx-text-alignment: right;"
        );
        squareButtonDel.setOnAction(actionEvent -> {
            String temp = new String();

            if (arv.getText().length() > 0) {
                for (int i = 0; i < arv.getText().length()-1; i++) {
                    temp = temp + arv.getText().charAt(i);
                }

                arv.setText(temp);
            }

            if (arv.getText().length() == 0) {
                arv.setText("0");
            }

            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        // num 7
        Button squareButton7 = new Button("7");
        pane.add(squareButton7, 0, 3);
        squareButton7.setStyle("-fx-min-width: 60px;" +
                                "-fx-min-height: 60px;" +
                                "-fx-max-width: 100px;" +
                                "-fx-max-height: 100px;" +
                                "-fx-font: 24 arial;"
        );
        squareButton7.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("7");
              // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("7");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "7");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // num 8
        Button squareButton8 = new Button("8");
        pane.add(squareButton8, 1, 3);
        squareButton8.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton8.setOnAction(actionEvent -> {
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("8");
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("8");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "8");
            }

            if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        // num 9
        Button squareButton9 = new Button("9");
        pane.add(squareButton9, 2, 3);
        squareButton9.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton9.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("9");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("9");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "9");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // divide
        Button squareButtonDiv = new Button("/");
        pane.add(squareButtonDiv, 3, 2);
        squareButtonDiv.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButtonDiv.setOnAction(actionEvent -> {

            // checks if the number array has anything and that it doesn't have an answer there already
            if (numbrid.size() > 0 && calculated.get(0).equals(false)) {
                numbrid.add(Double.parseDouble(arv.getText()));

                numbrid.set(0, arvutused(numbrid, tehe.getText()));
                numbrid.remove(1);

                // calculates and moves the answer to the top
                tehe.setText(String.valueOf(numbrid.get(0) + "/"));
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "/");

              // checks if the number array has anything and that it has an answer already
            } else if (numbrid.size() > 0 && calculated.get(0).equals(true)) {
                calculated.set(0, false);
                // adds the number into tehe
                tehe.setText(tehe.getText() + arv.getText() + "/");
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "/");

            } else {
                tehe.setText(tehe.getText() + arv.getText() + "/");
                // Gives numbrid array a new number
                numbrid.add(Double.parseDouble(arv.getText()));
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "/");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        // num 4
        Button squareButton4 = new Button("4");
        pane.add(squareButton4, 0, 4);
        squareButton4.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton4.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("4");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("4");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "4");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // num 5
        Button squareButton5 = new Button("5");
        pane.add(squareButton5, 1, 4);
        squareButton5.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton5.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("5");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("5");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "5");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // num 6
        Button squareButton6 = new Button("6");
        pane.add(squareButton6, 2, 4);
        squareButton6.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton6.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("6");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("6");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "6");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // korrutus
        Button squareButtonTim = new Button("*");
        pane.add(squareButtonTim, 3, 3);
        squareButtonTim.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButtonTim.setOnAction(actionEvent -> {
            if (numbrid.size() > 0 && calculated.get(0).equals(false)) {
                numbrid.add(Double.parseDouble(arv.getText()));

                numbrid.set(0, arvutused(numbrid, tehe.getText()));
                numbrid.remove(1);

                tehe.setText(String.valueOf(numbrid.get(0) + "*"));
                arv.setText("0");

                operatorcheck(operator, "*");
            } else if (numbrid.size() > 0 && calculated.get(0).equals(true)) {
                calculated.set(0, false);
                tehe.setText(tehe.getText() + arv.getText() + "*");
                arv.setText("0");

                operatorcheck(operator, "*");
            } else {
                tehe.setText(tehe.getText() + arv.getText() + "*");
                numbrid.add(Double.parseDouble(arv.getText()));
                arv.setText("0");

                operatorcheck(operator, "*");
            }

            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        // num 1
        Button squareButton1 = new Button("1");
        pane.add(squareButton1, 0, 5);
        squareButton1.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton1.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("1");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("1");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "1");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // num 2
        Button squareButton2 = new Button("2");
        pane.add(squareButton2, 1, 5);
        squareButton2.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton2.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("2");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("2");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "2");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // num 3
        Button squareButton3 = new Button("3");
        pane.add(squareButton3, 2, 5);
        squareButton3.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton3.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("3");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("3");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "3");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        // subtract
        Button squareButtonMinus = new Button("-");
        pane.add(squareButtonMinus, 3, 4);
        squareButtonMinus.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButtonMinus.setOnAction(actionEvent -> {
            // checks if the number array has anything and that it doesn't have an answer there already
            if (numbrid.size() > 0 && calculated.get(0).equals(false)) {
                numbrid.add(Double.parseDouble(arv.getText()));

                numbrid.set(0, arvutused(numbrid, tehe.getText()));
                numbrid.remove(1);

                // calculates and moves the answer to the top
                tehe.setText(String.valueOf(numbrid.get(0) + "-"));
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "-");

                // checks if the number array has anything and that it has an answer already
            } else if (numbrid.size() > 0 && calculated.get(0).equals(true)) {
                calculated.set(0, false);
                // adds the number into tehe
                tehe.setText(tehe.getText() + arv.getText() + "-");
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "-");

            } else {
                tehe.setText(tehe.getText() + arv.getText() + "-");
                // Gives numbrid array a new number
                numbrid.add(Double.parseDouble(arv.getText()));
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "-");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        Button squareButton0 = new Button("0");
        pane.add(squareButton0, 1, 6);
        squareButton0.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButton0.setOnAction(actionEvent -> {
            // checks if arv text length is smaller and equal to 1 and if arv text equals 0 and makes sure arv does not have a calculated answer already
            if (arv.getText().length() <= 1 && arv.getText().equals("0") && calculated.get(0).equals(false)) {
                arv.setText("0");
                // checks if arv text hase a calculated answer already
            } else if (calculated.get(0).equals(true)) {
                numbrid.removeAll(numbrid);
                arv.setText("0");
                calculated.set(0, false);
            } else {
                arv.setText(arv.getText() + "0");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });

        Button squareButtonPlus = new Button("+");
        pane.add(squareButtonPlus, 3, 5);
        squareButtonPlus.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButtonPlus.setOnAction(actionEvent -> {
            // checks if the number array has anything and that it doesn't have an answer there already
            if (numbrid.size() > 0 && calculated.get(0).equals(false)) {
                numbrid.add(Double.parseDouble(arv.getText()));

                numbrid.set(0, arvutused(numbrid, tehe.getText()));
                numbrid.remove(1);

                // calculates and moves the answer to the top
                tehe.setText(String.valueOf(numbrid.get(0) + "+"));
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "+");

                // checks if the number array has anything and that it has an answer already
            } else if (numbrid.size() > 0 && calculated.get(0).equals(true)) {
                calculated.set(0, false);
                // adds the number into tehe
                tehe.setText(tehe.getText() + arv.getText() + "+");
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "+");

            } else {
                tehe.setText(tehe.getText() + arv.getText() + "+");
                // Gives numbrid array a new number
                numbrid.add(Double.parseDouble(arv.getText()));
                arv.setText("0");

                // checks of the operator array has anything
                // then it just .add's it or replaces it
                operatorcheck(operator, "+");
            }

            // resizes the font if there are too many numbers
            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }

        });

        // equals
        Button squareButtonEq = new Button("=");
        pane.add(squareButtonEq, 3, 6);
        squareButtonEq.setStyle("-fx-min-width: 60px;" +
                "-fx-min-height: 60px;" +
                "-fx-max-width: 100px;" +
                "-fx-max-height: 100px;" +
                "-fx-font: 24 arial;"
        );
        squareButtonEq.setOnAction(actionEvent -> {
            double arvutus = 0;
            if (!calculated.get(0).equals(true)) {
                numbrid.add(Double.parseDouble(arv.getText()));
            }
            if (numbrid.size() > 1) {
                switch (operator.get(0)) {
                    case "*" -> arvutus = numbrid.get(0) * numbrid.get(1);
                    case "/" -> arvutus = numbrid.get(0) / numbrid.get(1);
                    case "+" -> arvutus = numbrid.get(0) + numbrid.get(1);
                    case "-" -> arvutus = numbrid.get(0) - numbrid.get(1);
                }

                //numbrid.removeAll(numbrid);
                numbrid.remove(1);
                numbrid.set(0, arvutus);
                operator.removeAll(operator);
                calculated.set(0, true);

                tehe.setText("");
                arv.setText(String.valueOf(arvutus));
            } else {
                numbrid.removeAll(numbrid);
                operator.removeAll(operator);
            }

            if (arv.getText().length() < 7) {
                arv.setStyle("-fx-font: 60 arial;");
            } else if (arv.getText().length() < 15 && arv.getText().length() > 7) {
                arv.setStyle("-fx-font: 30 arial;");
            } else if (arv.getText().length() < 32 && arv.getText().length() > 14) {
                arv.setStyle("-fx-font: 15 arial;");
            }
        });


        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Calculator");
    }

    public static void main(String[] args) { launch(); }


    static double arvutused(ArrayList<Double> numbrid, String tehe) {
        double arvutus = 0;
        char operator = tehe.charAt(tehe.length() - 1);

        switch (operator) {
            case '*' -> arvutus = numbrid.get(0) * numbrid.get(1);
            case '/' -> arvutus = numbrid.get(0) / numbrid.get(1);
            case '+' -> arvutus = numbrid.get(0) + numbrid.get(1);
            case '-' -> arvutus = numbrid.get(0) - numbrid.get(1);
        }

        return arvutus;
    }


    static ArrayList<String> operatorcheck(ArrayList<String> operator, String operatorString) {
        if (operator.size() == 0) {
            operator.add(operatorString);
        } else {
            operator.set(0, operatorString);
        }
        return operator;
    }



}