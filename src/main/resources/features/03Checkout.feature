Feature: User Melakukan Checkout
  Scenario: User dapat melakukan checkout
    When User melakukan checkout
    And User menambahkan firstname yang valid
    And User menambahkan lastname yang valid
    And User menambahkan zip postal code yang valid
    And User klik tombol continue
    And User klik tombol finish
    Then User berhasil melakukan checkout