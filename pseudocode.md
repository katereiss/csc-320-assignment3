Create a program that will calculate the weekly average tax withholding for a customer given the following weekly income guidelines:

Income less than $500: tax rate 10%
Incomes greater than/equal to $500 and less than $1500: tax rate 15%
Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
Incomes greater than/equal to $2500: tax rate 30%

Initialize variable income as int
Initialize variable taxRate as double
Initialize variable taxWithholding as double

Set default values of 0 for income, taxRate, and taxWithholding

Prompt user for income, store in variable income

if income < 500
taxRate = .1
else if income < 1500
taxRate = .15
else if income < 2500
taxRate = .2
else
taxRate = .3

taxWithholding = income * taxRate

return taxWithholding