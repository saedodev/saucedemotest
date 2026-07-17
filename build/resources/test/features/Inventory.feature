Feature: Inventory SauceDemo

  Background:
    Given User login sebagai "standard_user" dengan password "secret_sauce"

  Scenario: Melihat Detail Produk

    When User menekan detail item yang diberikan
    Then User redirect pada page detail inventory

  Scenario: Menambahkan Produk ke Cart

    When User menambahkan item pada button add to cart
    Then User melihat item keranjang ditambah

  Scenario: Menghapus Produk dari Inventory

    When User menambahkan item pada button add to cart
    And User menghapus item pada button remove
    Then User melihat item keranjang dihapus