








crypto - presentation - models - CoinUi.kt

data class

things display in ui
for marketcapusd, price,changepercent24hr we dont use double instead
displayablenumber data class....value for actual...and formated string to  display

on important thing is icon

presentation - coinlist
it contain all the ui components to show in app

it consist of all reusable package used in 
app

onclick lambda function to display when click
it consist of a row with icon and then column conatin short name and name
then another column contain price,changepercent24hr

previewcoin the map to coinUi


NumberFormat.getNumberInstance(Locale.getDefault())
use for formatting number 

