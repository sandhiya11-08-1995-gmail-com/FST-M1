fruitshop = { 
    "apple": 100, 
    "banana": 30,
    "papaya": 50}

checkFruit = input("Enter the fruit which you are looking for: ").lower()

if(checkFruit in fruitshop):
    print("Fruit is available here!")
else:
    print("Fruit is not available!")
