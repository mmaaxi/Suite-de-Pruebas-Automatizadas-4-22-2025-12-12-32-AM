Feature: Verificar error con credenciales inválidas

  Scenario: Usuario intenta ingresar con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When ingresa un usuario "usuario_incorrecto" y una contraseña "contraseña_incorrecta"
    Then el sistema muestra un mensaje de error de autenticación