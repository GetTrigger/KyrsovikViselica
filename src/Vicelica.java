import java.util.Random;
import java.util.Scanner;

/**
 * Created by Devil Trigger S on 19.11.2014.
 */
public class Vicelica {
    public static void main(String[] args) {
        int Razm = 4; // Размер загаданного слова
        int Schet = 0; // счетчик
        int Verno=Razm;

        String[] Bykvu = new String[10]; //Массив для введенных букв
        for (int i = 0; i < Bykvu.length; i++) Bykvu[i] = "*";

        String[] Naborslov = {"слон","молоко","пчела","птичка","собака"};//Массив слов на Отгадывание
        int Nomer=new Random().nextInt(4) + 1; // Выбираем слово
        String NewZagad=Naborslov[Nomer];
        System.out.println(NewZagad); //помещаем в переменную

        String[] Zagadka = new String[Razm];//Массив - Загаданное слово

        String[] Otvet = new String[Razm]; //Массив Отгаданное
        for (int i = 0; i < Otvet.length; i++) Otvet[i] = "*";

        while (true) {

            Verno=Razm; //Стартовое значение

            System.out.println(" ");
            System.out.println("Введите Букву");
            Scanner in = new Scanner(System.in);//Ввод бкувы
            String One = in.nextLine();

            for (int i = 0; i < Bykvu.length; i++) { //Цикл на Проверку была ли буква названна до этого
                if (Bykvu[i].equals(One)) {
                    System.out.println("Такая Буква Уже называлась");
                    break;
                } else {
                    if (i == Bykvu.length - 1) {
                        //Занесение буквы и увелечение счетчика
                        Bykvu[Schet] = One;
                        Schet++;

                        //Работа со словом
                        for (int j = 0; j < Razm; j++){
                            if (Zagadka[j].equals(One)) {
                                Otvet[j]=One;
                            }
                        }
                        //Сравнение ответа и Загадки
                        for (int j = 0; j < Razm; j++) {
                        if (Otvet[j].equals("*")) {} else {Verno--;}
                        }

                        if (Verno==0){System.out.println("Вы Угадали");}

                        for (int j = 0; j < Razm; j++)
                        System.out.print(Otvet[j]);

                    }
                }
            }
        }
    }
}
