Feature: Validación de login con credenciales válidas

  Scenario: Usuario se autentica correctamente con credenciales válidas
    Given el usuario está en la página de login
    When ingresa el usuario "usuarioValido" y la contraseña "contraseñaValida"
    Then es redirigido a la pantalla de dashboard