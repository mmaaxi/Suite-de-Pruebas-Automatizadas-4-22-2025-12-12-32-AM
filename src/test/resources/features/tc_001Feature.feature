Feature: Inicio de la aplicación

  Scenario: Verificar inicio de la aplicación
    Given la aplicación está instalada
    When ejecuto la aplicación
    Then la aplicación se inicia correctamente
    And muestra la pantalla principal