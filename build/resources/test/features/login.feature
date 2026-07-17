Feature: Login SauceDemo

  Scenario: Login berhasil

    Given User login sebagai "standard_user" dengan password "secret_sauce"
    Then User berhasil masuk ke Dashboard

  Scenario: Password salah

    Given User berada pada halaman login
    When User memasukkan username "standard_user"
    And User memasukkan password "123456"
    And User menekan tombol Login
    Then Muncul pesan error

  Scenario: Username kosong

    Given User berada pada halaman login
    When User memasukkan username ""
    And User memasukkan password "secret_sauce"
    And User menekan tombol Login
    Then Muncul pesan error

  Scenario: Username salah

    Given User berada pada halaman login
    When User memasukkan username "waodjfhiwaldfhilswjfsiofghslivhdswilfgvhslaidfhsiofhsiodfhdslidfhsildfhlsidfhdlsifhlsidfhsildfyslifygh"
    And User memasukkan password "secret_sauce"
    And User menekan tombol Login
    Then Muncul pesan error

  Scenario: Password kosong

    Given User berada pada halaman login
    When User memasukkan username "standard_user"
    And User memasukkan password ""
    And User menekan tombol Login
    Then Muncul pesan error