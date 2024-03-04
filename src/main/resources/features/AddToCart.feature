Feature: User Menambahkan Produk
  Scenario: User dapat berhasil menambahkan produk yang diinginkan ke dalam keranjang
    When User menambahkan produk ke keranjang
    And User melihat melihat produk dalam keranjang
    Then User berhasil menambahkan produk ke dalam keranjang dan diarahkan ke checkout