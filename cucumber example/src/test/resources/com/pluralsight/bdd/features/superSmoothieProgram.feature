Feature: smoothie buying program

Background: 
Given the following categories:
|Drink |Category|Points|
|Banana|regular       |15    |
|berry | fancy      |20    |
|Earl  |tea       |30    |

Scenario Outline: Earning points 
Given Alice is morning freshness person
When Alice purchases <Quantity> <Drink> drinks
Then he should earn <Points>

Examples:
|Drink |Quantity|Points|
|Banana|1       |15    |
|berry | 1      |20    |
|Earl  |1       |30    |
