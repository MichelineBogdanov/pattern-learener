package org.pattern_learener.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Суть паттерна - это поведенческий паттерн проектирования, который даёт возможность последовательно обходить элементы
 * составных объектов, не раскрывая их внутреннего представления.<p>
 * Применимость:<p>
 * - когда у вас есть сложная структура данных, и вы хотите скрыть от клиента детали её реализации (из-за сложности или вопросов безопасности);<p>
 * - когда вам нужно иметь несколько вариантов обхода одной и той же структуры данных;<p>
 * - когда вам хочется иметь единый интерфейс обхода различных структур данных;<p>
 * Преимущества и недостатки:<p>
 * + упрощает классы хранения данных;<p>
 * + позволяет реализовать различные способы обхода структуры данных;<p>
 * + позволяет одновременно перемещаться по структуре данных в разные стороны;<p>
 * - не оправдан, если можно обойтись простым циклом;<p>
 * Реализация:<p>
 * 1. Создайте общий интерфейс итераторов. Обязательный минимум — это операция получения следующего элемента коллекции.
 * Но для удобства можно предусмотреть и другое. Например, методы для получения предыдущего элемента, текущей позиции, проверки окончания обхода и прочие.<p>
 * 2. Создайте интерфейс коллекции и опишите в нём метод получения итератора. Важно, чтобы сигнатура метода возвращала
 * общий интерфейс итераторов, а не один из конкретных итераторов.<p>
 * 3. Создайте классы конкретных итераторов для тех коллекций, которые нужно обходить с помощью паттерна.
 * Итератор должен быть привязан только к одному объекту коллекции. Обычно эта связь устанавливается через конструктор.<p>
 * 4. Реализуйте методы получения итератора в конкретных классах коллекций. Они должны создавать новый итератор того класса,
 * который способен работать с данным типом коллекции. Коллекция должна передавать ссылку на собственный объект в конструктор итератора.<p>
 * 5. В клиентском коде и в классах коллекций не должно остаться кода обхода элементов.
 * Клиент должен получать новый итератор из объекта коллекции каждый раз, когда ему нужно перебрать её элементы.<p>
 */
public class IteratorPattern {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        } else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }

}
