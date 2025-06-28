package org.pattern_learener.behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Суть паттерна - это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс,
 * после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.<p>
 * Применимость:<p>
 * - когда вам нужно использовать разные вариации какого-то алгоритма внутри одного объекта;<p>
 * - когда у вас есть множество похожих классов, отличающихся только некоторым поведением;<p>
 * - когда вы не хотите обнажать детали реализации алгоритмов для других классов;<p>
 * - когда различные вариации алгоритмов реализованы в виде развесистого условного оператора. Каждая ветка такого оператора представляет собой вариацию алгоритма;<p>
 * Преимущества и недостатки:<p>
 * + горячая замена алгоритмов на лету;<p>
 * + изолирует код и данные алгоритмов от остальных классов;<p>
 * + уход от наследования к делегированию;<p>
 * + реализует принцип открытости/закрытости;<p>
 * - усложняет программу за счёт дополнительных классов;<p>
 * - клиент должен знать, в чём состоит разница между стратегиями, чтобы выбрать подходящую;<p>
 * Реализация:<p>
 * 1. Определите алгоритм, который подвержен частым изменениям. Также подойдёт алгоритм, имеющий несколько вариаций, которые выбираются во время выполнения программы.<p>
 * 2. Создайте интерфейс стратегий, описывающий этот алгоритм. Он должен быть общим для всех вариантов алгоритма.<p>
 * 3. Поместите вариации алгоритма в собственные классы, которые реализуют этот интерфейс.<p>
 * 4. В классе контекста создайте поле для хранения ссылки на текущий объект-стратегию, а также метод для её изменения.
 * Убедитесь в том, что контекст работает с этим объектом только через общий интерфейс стратегий.<p>
 * 5. Клиенты контекста должны подавать в него соответствующий объект-стратегию, когда хотят, чтобы контекст вёл себя определённым образом.
 */
public class StrategyPattern {

    private static final Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("""
                        Please, select a product:
                        1 - Mother board
                        2 - CPU
                        3 - HDD
                        4 - Memory
                        """);
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("""
                        Please, select a payment method:
                        1 - PalPay
                        2 - Credit Card""");
                String paymentMethod = reader.readLine();

                // Клиент создаёт различные стратегии на основании
                // пользовательских данных, конфигурации и прочих параметров.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            // Объект заказа делегирует сбор платёжных данны стратегии, т.к.
            // только стратегии знают какие данные им нужны для приёма оплаты.
            order.processOrder(strategy);

            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // И наконец, стратегия запускает приём платежа.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }

}
