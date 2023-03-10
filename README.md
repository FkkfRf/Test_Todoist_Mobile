# Проект по автоматизации тестирования мобильного приложения Todoist


<code><img width="50%" title="GitHub" src="images/icons/Todoist-logo.png"></code>
#### <a target="_blank" href="https://todoist.com/">todoist</a>
#### © Doist Inc.


#### Тестирование проводилось c использованием Android Studio + Appium Server GUI на локальном эмуляторе



# :closed_book:    Содержание

> - [Технологии и инструменты](#toolbox-технологии-и-инструменты)
>
> - [Реализованы проверки](#chart_with_upwards_trend-реализованы-проверки)
>
> - [Отчет о результатах тестирования в Allure Report](#triangular_flag_on_post-отчет-о-результатах-тестирования-в-allure-report)
>

## :toolbox: Технологии и инструменты

<p  align="center"

<code><img width="6%" title="GitHub" src="images/logo/GitHub-logo.svg"></code>
<code><img width="6%" title="IntelliJ IDEA" src="images/logo/IntelijIDEA-logo.svg"></code>
<code><img width="6%" title="Java" src="images/logo/Java-logo.svg"></code>
<code><img width="6%" title="Selenide" src="images/logo/Selenide-logo.svg"></code>
<code><img width="6%" title="Gradle" src="images/logo/Gradle-logo.svg"></code>
<code><img width="6%" title="Junit5" src="images/logo/JUnit5-logo.svg"></code>
<code><img width="4%" title="Android Studio" src="images/logo/AndroidStudio-logo.png"></code>
<code><img width="5%" title="Appium" src="images/logo/Appium-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/AllureReport-logo.png"></code>
</p>

> - *В данном проекте использовались:*
>- *<code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Selenide*</strong></code> -
   автотесты для UI*
>- *<code><strong>*Gradle*</strong></code> - сборка проекта*
>- *<code><strong>*JUnit 5*</strong></code> - фреймворк для модульного тестирования*
>- *<code><strong>*Allure Report*</strong></code> - визуализации результатов тестирования*
>- *<code><strong>*Appium*</strong></code> - среда автоматизации тестирования для использования с нативными, гибридными и мобильными веб-приложениями*
>- *<code><strong>*Android Studio*</strong></code> - интегрированная среда разработки (IDE) для работы с платформой Android*

## :chart_with_upwards_trend: Реализованы проверки

### Mobile

#### ✓ Тесты

> - [x] *Добавить проект*
>- [x] *Добавить задачу*
>- [x] *Добавить текущее время в планировщике*

## :triangular_flag_on_post: Отчет о результатах тестирования в Allure Report

<img width="4%" title="Allure Report" src="images/logo/AllureReport-logo.png"> 

#### ✓ Главная страница Allure-отчета содержит следующие информационные блоки:

> <code>*ALLURE REPORT*</code> - отображает дату и время прохождения теста, общее количество прогнанных кейсов, а также
> диаграмму с указанием процента и количества успешных, упавших и сломавшихся в процессе выполнения тестов

> <code>*TREND*</code> - отображает тренд прохождения тестов от сборки к сборке

> <code>*SUITES*</code> - отображает распределение результатов тестов по тестовым наборам

> <code>*ENVIRONMENT*</code> - отображает тестовое окружение, на котором запускались тесты (в данном случае информация
> не задана)

> <code>*CATEGORIES*</code> - отображает распределение неуспешно прошедших тестов по видам дефектов

> <code>*FEATURES BY STORIES*</code> - отображает распределение тестов по функционалу, который они проверяют

> <code>*EXECUTORS*</code> - отображает исполнителя текущей сборки (ссылка на сборку в Jenkins)

<p align="center">
  <img src="images/screenshots/Allure1.PNG" alt="Allure Report" >
</p>

#### ✓ В разделе Behaviors тесты отображаются  сгруппироваными в многоуровневый список:

<p align="center">
  <img src="images/screenshots/Allure2.PNG" alt="Allure Report">
</p>

Описания тестов и шагов тестов создаётся автоматически, на основе аннотаций и степов, созданных в исходном коде.


#### ✓ Видео выполнения мобильного теста :

<p align="center">
  <img title="mobile Video" src="images/screenshots/mobile.gif" width="500">
</p>
