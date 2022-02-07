# jwd-task1

#Requirements
1. Разработать entity-класс, например: «класс Массив»
2. Entity-класс не следует наполнять методами, выполняющими функциональные действия 
(методами бизнес-логики, такими как вычисление, поиск и т.д.).
3. Все классы приложения должны быть структурированы по пакетам (package).
4. Оформление кода должно соответствовать Java Code Convention.
5. Для записи логов использовать Log4J2
6. Разработать тесты на TestNG.
7. Решение задания хранить на Github.
8. Методы класса Objects использовать запрещено.
9. Изучить appendix 1

#part 1
1. Создать класс Массив.
2. Разработать service-классы реализующие функциональности: 
 1. поиск min\max значения массива, 
 2. замену элементов массива по условию, 
 3. определение среднего значения элементов массива, 
 4. определение суммы элементов массива,
 5. определение числа положительных\отрицательных элементов массива.

#part 2
1. Сортировка массива тремя различными алгоритмами.
2. Параметры, необходимые для создания массивов, получить чтением информации из файла 
(.txt). Часть данных должна быть некорректной. Если встретилась некорректная 
строка, приложение должно переходить к следующей строке. Чтение может быть 
прекращено по достижении первой корректной строки. Файл данных должен находиться в 
отдельном каталоге.
3. Для чтения из файла можно использовать методы, появившиеся в Java8.
4. Использовать собственные классы исключительных ситуаций.
5. Разработать validation-классы для валидации исходных данных при создании массивов.
Например: корректная строка в файле для создания массива: «1, 2, 3» или «1 – 2 - 3» или «3 4 7»;
Некорректная строка в файле для создания массива: «1z1 21 32». Присутствует недопустимый символ
«z», следовательно всю строку следует считать некорректной.
 
#part 3
Решить задачи, поставленные в part 1 и 2, с помощью возможностей IntStream.