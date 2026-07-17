Feature: Checkout SauceDemo

  Background:
    Given User login sebagai "standard_user" dengan password "secret_sauce"
    And User menambahkan item pada button add to cart
    And User membuka halaman Cart
    And User menekan tombol Checkout

  Scenario: Checkout dengan data kosong

    When User memasukkan First Name ""
    And User memasukkan Last Name ""
    And User memasukkan Zip atau Postal Code ""
    And User menekan tombol Continue Checkout
    Then Muncul pesan error blank

  Scenario: Checkout berhasil

    When User memasukkan First Name "Sayid"
    And User memasukkan Last Name "Ridho"
    And User memasukkan Zip atau Postal Code "12312"
    And User menekan tombol Continue Checkout
    And User melakukan checkout overview
    Then Checkout berhasil!