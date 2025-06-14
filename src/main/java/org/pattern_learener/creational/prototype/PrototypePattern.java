package org.pattern_learener.creational.prototype;

/**
 * Суть паттерна - это порождающий паттерн проектирования, который позволяет копировать объекты, не вдаваясь в подробности их реализации.<p>
 * Применимость:<p>
 * - когда ваш код не должен зависеть от классов копируемых объектов;<p>
 * - когда вы имеете уйму подклассов, которые отличаются начальными значениями полей. Кто-то мог создать все эти классы,
 * чтобы иметь возможность легко порождать объекты с определённой конфигурацией;<p>
 * Преимущества и недостатки:<p>
 * + позволяет клонировать объекты, не привязываясь к их конкретным классам;<p>
 * + меньше повторяющегося кода инициализации объектов;<p>
 * + ускоряет создание объектов;<p>
 * + альтернатива созданию подклассов для конструирования сложных объектов;<p>
 * - сложно клонировать составные объекты, имеющие ссылки на другие объекты<p>
 *
 * ПС. Вообще в jdk уже есть интерфейс, который реализует данный паттерн (Cloneable).
 */
public class PrototypePattern {

    public static void main(String[] args) {
        Project master = new Project(1, "Project", "psvm");
        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project project = projectFactory.cloneProject();
        System.out.println(project);
    }

}
