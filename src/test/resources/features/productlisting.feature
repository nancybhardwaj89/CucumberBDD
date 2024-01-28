Feature: Product Listing Page

  Background:
    Given User has already logged into the system
      | username | password |
      |standard_user | secret_sauce |


  Scenario: User is on Product details page
    Given User is on product listing page
      When clicks on product and product details page will display
      Then On clicking on Add to cart button, product should be added in cart

#    Scenario: User is on Cart Page
#      Given User is on the cart page
#      When User clicks on button Checkout
#












