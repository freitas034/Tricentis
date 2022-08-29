

@tag
Feature: abrir o site tricentis e preencher o formulario
 

  @tag1
  Scenario: abrir site tricentis
    Given eu esteja no site 
    And clicar na caixa de texto 
    When escrever o texto
    Then validar o resultado 

 