package org.pattern_learener.structural.bridge;

/**
 * Суть паттерна - это структурный паттерн проектирования, который разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.<p>
 * Применимость:<p>
 * - когда вы хотите разделить монолитный класс, который содержит несколько различных реализаций какой-то функциональности (например, если класс может работать с разными системами баз данных);<p>
 * - когда класс нужно расширять в двух независимых плоскостях;<p>
 * - когда вы хотите, чтобы реализацию можно было бы изменять во время выполнения программ;<p>
 * Преимущества и недостатки:<p>
 * + позволяет строить платформо-независимые программы;<p>
 * + скрывает лишние или опасные детали реализации от клиентского кода;<p>
 * + реализует принцип открытости/закрытости;<p>
 * - усложняет код программы из-за введения дополнительных классов
 */
public class BridgePattern {

    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        BasicRemote basicRemote = new BasicRemote(radio);
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);

        basicRemote.power();
        basicRemote.setChannel(3);
        basicRemote.volumeUp();
        radio.printStatus();

        advancedRemote.power();
        advancedRemote.setChannel(3);
        advancedRemote.volumeUp();
        tv.printStatus();
    }

}
