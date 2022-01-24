def calculateSum(num):
    if(num):
       return num + calculateSum (num -1)
    else:
       return 0

number = int(input("Enter the number:"))
result = calculateSum(number)
print(result)
