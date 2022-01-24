def calculateSum(numbers):
    sum = 0
    for no in numbers:
        sum += no
    return sum    

	
numberList = [10, 40, 60, 90]     
result = calculateSum(numberList)
print(result)