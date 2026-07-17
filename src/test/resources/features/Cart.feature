Feature: Cart SauceDemo

  Background:
    Given User login sebagai "standard_user" dengan password "secret_sauce"
    And User menambahkan item pada button add to cart
    And User membuka halaman Cart

  Scenario: Melihat Item pada Cart
    Then User melihat item yang telah ditambahkan pada Cart

  Scenario: Remove Item dari Cart
    When User menekan tombol Remove pada Cart
    Then Item berhasil dihapus dari Cart

  Scenario: Continue Shopping
    When User menekan tombol Continue Shopping
    Then User kembali ke halaman Inventory

  Scenario: Membuka halaman Checkout
    When User menekan tombol Checkout
    Then User diarahkan ke halaman Checkout