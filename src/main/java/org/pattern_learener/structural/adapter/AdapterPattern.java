package org.pattern_learener.structural.adapter;

import org.pattern_learener.structural.adapter.class_adapter.AdapterJavaToDataBase;
import org.pattern_learener.structural.adapter.class_adapter.DataBase;
import org.pattern_learener.structural.adapter.composit_adapter.RoundHole;
import org.pattern_learener.structural.adapter.composit_adapter.RoundPeg;
import org.pattern_learener.structural.adapter.composit_adapter.SquarePeg;
import org.pattern_learener.structural.adapter.composit_adapter.SquarePegAdapter;

/**
 * Суть паттерна - это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.<p>
 * Применимость:<p>
 * - когда вам нужно использовать несколько существующих подклассов, но в них не хватает какой-то общей функциональности, причём расширить суперкласс вы не может;<p>
 * - когда вы хотите использовать сторонний класс, но его интерфейс не соответствует остальному коду приложения;<p>
 * Преимущества и недостатки:<p>
 * + отделяет и скрывает от клиента подробности преобразования различных интерфейсов;<p>
 * - усложняет код программы из-за введения дополнительных классов
 */
public class AdapterPattern {

    public static void main(String[] args) {
        // ============== композиция ==============
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

        // ============== наследование ==============
        DataBase db = new AdapterJavaToDataBase();
        db.insert();
        db.update();
        db.select();
        db.delete();
    }

}
