@login
Feature: Homework
  Scenario Outline: kullanici_bilgileriyle_giris_testi

Given kullanici ana sayfada
When kullanici login sayfasina gider
And kullanıcı adini "<email>" girer
And sifreyi "<password>" girer
And login buttoning basar
Then login islemi gerçekleşir


    Examples:data
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |