Feature: Yandex Market Compare feature
  In order to compare products
  As a buyer/customer
  I want to add products to compare list

  Scenario: Compare products characteristics
    Given I open main Yandex Market page
    And I navigate to 'Компьютеры' in header menu on the Yandex Market page
    And I navigate to 'Ноутбуки' in the Left Side menu on the Yandex Market Category page
    When I add 1 st product to compare list from the product list on the Catalog Yandex market page
    And I add 2 nd product to compare list from the product list on the Catalog Yandex market page
    And I click 'Сравнить' button on the Catalog Yandex market page
    Then added products titles should be the same as displayed products on the Compare page

#  Scenario Outline: Different products
#    Given I open main Yandex Market page
#    And I navigate to '<category>' in header menu on the Yandex Market page
#    And I navigate to '<subCategory>' in the Left Side menu on the Yandex Market Category page
#    When I add 1-st product to compare list from the product list on the Catalog Yandex market page
#    And I add 2-nd product to compare list from the product list on the Catalog Yandex market page
#    And I click 'Сравнить' button on the Catalog Yandex market page
#    Then added products titles should be the same as displayed products on the Compare page
#
#    Examples:
#      | category        | subCategory |
#      | Компьютеры      | Ноутбуки    |
#      | Бытовая техника | Плиты       |
