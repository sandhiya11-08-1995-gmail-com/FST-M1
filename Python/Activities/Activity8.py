	
number = list(input("Enter the sequence of numbers by comma seperated: ").split(" , "))
 
# Get first element in list
firstElement = number[0]
# Get last element in list
lastElement = number[-1]
 
# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)