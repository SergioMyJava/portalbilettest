package appmanager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class AutocompleteCells {
    private LinkedList<String[]> cells;

    public AutocompleteCells() throws IOException {
        readData();
    }

    private void readData() throws IOException {        //читаем из data.txt в LinkedList<String[]> cells построчно
        try {
            cells = new LinkedList<String[]>();
            FileReader reade = new FileReader("./src/test/java/appmanager/data.txt");
            Scanner in = new Scanner(reade);

            while (in.hasNextLine()) {                  //по делителю "!" разбиваем строку на слова
                String line = in.nextLine();
                String[] cel = line.split("!");
                cells.add(cel);
                reade.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public String getRandomCategoryTagAgeLimit(int n) {    //генерируем случайное число и по нему достаем из массива значение
        Random rn = new Random();
        String[] mas = cells.get(n-1);
        int rand = rn.nextInt(mas.length );
        return mas[rand];
    }
}


