# Pattern Training

## Setup
* Clone this code into a local repository.
* Check if the following runs from the project main folder: `mvn clean package` (in case maven is installed) `mvnw clean package` (otherwise)
* Thereafter you should be able to start the program with `java -jar ./target/restaurant.jar`and see a small window


## Factory Exercise
### Task
* The restaurant in [RestaurantMain](src/main/java/com/umlaut/patterntraining/RestaurantMain.java) shall be created with factory pattern
* Implement the classes in package `restaurant` with factory pattern
* If the program is run with `java -jar restaurant.jar gematik` the gematik logo shall be used 
* If the program is run with `java -jar restaurant.jar umlaut` the umlaut logo shall be used

### Success Criterion
* You have defined the logo of the restaurant
* Factory pattern is used for creation of the restaurant

### Check Solution
Checkout remote branch `solution_factory`

### Remark
* Check the class [SymbolImage](src/main/java/com/umlaut/patterntraining/dialog/SymbolImage.java) for a construct similar to the factory pattern often used in java


## Adapter Exercise
### Task
* Add an adapter to the [SpecialSoupOffer](src/main/java/com/umlaut/patterntraining/restaurantmenu/legacy/SpecialSoupOffer.java)
* Use this adapter to add the lentil soup to the [RestaurantMenu](src/main/java/com/umlaut/patterntraining/restaurantmenu/RestaurantMenu.java)
### Success Criterion
* The order dialog shows four different soups including lentil soup
* No changes made in the `restaurantmenu.legacy` package
* [SpecialSoupOffer](src/main/java/com/umlaut/patterntraining/restaurantmenu/legacy/SpecialSoupOffer.java) class is used in solution
### Check Solution
Checkout remote branch `solution_adapter`


## Observer Exercise
### Task
* Use `PropertyChangeListener` and `PropertyChangeSupport` classes from the standard library
* Add `PropertyChangeSupport` in [AbstractStateDialog](src/main/java/com/umlaut/patterntraining/dialog/AbstractStateDialog.java) to fire property updates on button clicks
* Register the `goOn` function in [RestaurantState](src/main/java/com/umlaut/patterntraining/state/RestaurantState.java) for all dialogs of the three states to that property change
### Success Criterion
* Click on the Button changes the dialog view
### Check Solution
Checkout remote branch `solution_observer`


## Builder Exercise
### Task
* Implement [Order](src/main/java/com/umlaut/patterntraining/dialogresult/Order.java) with the builder pattern
* Fill the builder in [OrderDialog](src/main/java/com/umlaut/patterntraining/dialog/OrderDialog.java)
### Success Criterion
* The bill on payment view is correct for meals containing exactly one soup
### Check Solution
Checkout remote branch `solution_builder`


## Decorator Exercise
### Task
* Implement decorator classes in the `bill` package
* Decorate a primarily empty bill with a decorator for each order in [RestaurantState](src/main/java/com/umlaut/patterntraining/state/RestaurantState.java)
### Success Criterion
* The bill on payment view is correct for all meals including usage of eat more option
### Check Solution
Checkout remote branch `solution_decorator`


## State Exercise
### Task
* Refactor the state machine of the restaurant
* Implement classes in the package `state` to work same as [RestaurantState](src/main/java/com/umlaut/patterntraining/state/RestaurantState.java)
* In [AbstractRestaurant](src/main/java/com/umlaut/patterntraining/restaurant/AbstractRestaurant.java) replace [RestaurantState](src/main/java/com/umlaut/patterntraining/state/RestaurantState.java) with [RestaurantContext](src/main/java/com/umlaut/patterntraining/state/RestaurantContext.java)
### Success Criterion
* Dialog works as before
* [RestaurantState](src/main/java/com/umlaut/patterntraining/state/RestaurantState.java) class removed
* [StateName](src/main/java/com/umlaut/patterntraining/state/StateName.java) class removed

### Check Solution
Checkout remote branch `solution_state`