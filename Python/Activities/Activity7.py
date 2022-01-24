	
numbers = list(input("Enter a numbers by comma seperated: ").split(", "))
sum = 0
 
for number in numbers:
  sum += int(number)
 
print(sum)