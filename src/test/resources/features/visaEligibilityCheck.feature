Feature:Confirm whether a visa is required to visit the UK for individuals of different countries and purposes

  Background:
    Given I am on visa requirement check home page
    And I start the visa check process

  @japan
  Scenario Outline: Confirm whether a visa is required to visit the UK for Japan and Tourism

    And I provide a nationality as listed on my passport or travel document as <Nationality>
    When I select the purpose of visit as <purposeOfVisit>
    Then I verify the <expectedOutCome>

    @japan @tourism
    Examples:
      | Nationality | purposeOfVisit | expectedOutCome                         |
      | Japan       | tourism        | You won’t need a visa to come to the UK |


  @japan
  Scenario Outline: Confirm whether a visa is required to visit the UK for Japan and Study

    And I provide a nationality as listed on my passport or travel document as <Nationality>
    And I select the purpose of visit as <purposeOfVisit>
    And I state I am intending to stay for <moreOrLess> than six months
    When I submit the study duration form
    Then I verify the <expectedOutCome>

    @japan @longStudy
    Examples:
      | Nationality | purposeOfVisit | moreOrLess | expectedOutCome                       |
      | Japan       | study          | more       | You’ll need a visa to study in the UK |
    @japan @shortStudy
    Examples:
      | Nationality | purposeOfVisit | moreOrLess | expectedOutCome                          |
      | Japan       | study          | less       | You do not need a visa to come to the UK |


  @russia
  Scenario Outline: Confirm whether a visa is required to visit the UK for Russia and Tourism

    And I provide a nationality as listed on my passport or travel document as <Nationality>
    And I select the purpose of visit as <purposeOfVisit>
    And I state <withPartnerOrNot> for travelling with or visiting a partner or family and <withOrWithOutArtcile> for Article card
    When I submit the article form
    Then I verify the <expectedOutCome>

    @russia @tourism @partner @article
    Examples:
      | Nationality | purposeOfVisit | withPartnerOrNot | withOrWithOutArtcile | expectedOutCome                          |
      | Russia      | tourism        | yes              | yes                  | You do not need a visa to come to the UK |
    @russia @tourism @partner @article
    Examples:
      | Nationality | purposeOfVisit | withPartnerOrNot | withOrWithOutArtcile | expectedOutCome                      |
      | Russia      | tourism        | yes              | no                   | You’ll need a visa to come to the UK |
    @russia @tourism @partner @article
    Examples:
      | Nationality | purposeOfVisit | withPartnerOrNot | withOrWithOutArtcile | expectedOutCome                      |
      | Russia      | tourism        | no               | NA                   | You’ll need a visa to come to the UK |
